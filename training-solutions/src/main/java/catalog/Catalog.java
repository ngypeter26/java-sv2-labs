package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    protected List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem){
        catalogItems.add(catalogItem);
    }
    public double averagePageNumberOver(int limit){
        if (limit<=0){
            throw new IllegalArgumentException("Page number must be positive");
        }
        double allPageNumber = 0;
        double count = 0;
        for (CatalogItem cI : catalogItems){
            if(cI.hasPrintedFeature() && cI.numberOfPagesAtOneItem()> limit){
                allPageNumber += cI.numberOfPagesAtOneItem();
                count++;
            }
        }
        if (count==0){
            throw new IllegalArgumentException("No page");
        }
        return allPageNumber/count;
    }
    public void deleteItemByRegistrationNumber(String registrationNumber){
        for (int i=0;i<catalogItems.size();i++){
            if (catalogItems.get(i).getRegistrationNumber().equals(registrationNumber)){
                catalogItems.remove(catalogItems.get(i));
            }
        }
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria){
        List<CatalogItem> foundItems = new ArrayList<>();
        if (!searchCriteria.hasContributor() && searchCriteria.hasTitle()){
            for (CatalogItem cI : catalogItems){
                if(cI.getTitles().contains(searchCriteria.getTitle())){
                    foundItems.add(cI);
                }
            }
        }else if (searchCriteria.hasContributor() && !searchCriteria.hasTitle()){
            for (CatalogItem cI : catalogItems){
                if(cI.getContributors().contains(searchCriteria.getContributor())){
                    foundItems.add(cI);
                }
            }
        }else if (searchCriteria.hasContributor() && searchCriteria.hasTitle()){
            for (CatalogItem cI : catalogItems){
                if(cI.getContributors().contains(searchCriteria.getContributor())
                &&cI.getTitles().contains(searchCriteria.getTitle())){
                    foundItems.add(cI);
                }
            }
        }
        return foundItems;
    }
    public int getAllPageNumber(){
        int allPageNumber = 0;
        for (CatalogItem cI : catalogItems){
            if(cI.hasPrintedFeature()){
                allPageNumber += cI.numberOfPagesAtOneItem();
            }
        }
        return allPageNumber;
    }
    public List<CatalogItem>getAudioLibraryItems(){
        List<CatalogItem> audioLibraryItems = new ArrayList<>();
        for (CatalogItem cI : catalogItems){
            if (cI.hasAudioFeature()){
                audioLibraryItems.add(cI);
            }
        }
        return audioLibraryItems;
    }
    public int getFullLength(){
        int fullLength = 0;
        for (CatalogItem cI : catalogItems){
            if(cI.hasAudioFeature()){
                fullLength += cI.fullLengthAtOneItem();
            }
        }
        return fullLength;
    }
    public List<CatalogItem> getPrintedLibraryItems(){
        List<CatalogItem> printedLibraryItems = new ArrayList<>();
        for (CatalogItem cI : catalogItems){
            if (cI.hasPrintedFeature()){
                printedLibraryItems.add(cI);
            }
        }
        return printedLibraryItems;
    }


}
