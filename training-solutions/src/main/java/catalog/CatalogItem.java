package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogItem implements Feature {
    private List<Feature> features;// = new ArrayList<>();
    private int price;
    private String registrationNumber;

    public CatalogItem(String registrationNumber, int price, Feature... features) {
        if (Validators.isBlank(registrationNumber)) {
            throw new IllegalArgumentException("RegistrationNumber is empty!");
        }
//        if(Validators.isEmpty(features)){
//            throw new IllegalArgumentException("List of features is empty!");
//        }
        if (price < 0) {
            throw new IllegalArgumentException("Price is negative!");
        }
        this.features = Arrays.asList(features);
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public int fullLengthAtOneItem() {
        int full = 0;
        for (Feature f : features) {
            if (f instanceof AudioFeatures) {
               full += ((AudioFeatures) f).getLength();
            }
        }
        return full;
    }

    public List<String> getTitles() {
        List<String> titles = new ArrayList<>();
        for (Feature f : features) {
            titles.add(f.getTitle());
        }
        return titles;
    }

    public boolean hasPrintedFeature() {
        for (Feature f : features) {
            if (f instanceof PrintedFeatures) {
                return true;
            }
        }
        return false;
    }
    public boolean hasAudioFeature() {
        for (Feature f : features) {
            if (f instanceof AudioFeatures) {
                return true;
            }
        }
        return false;
    }


    public int numberOfPagesAtOneItem() {
        for (Feature f : features) {
            if (f instanceof PrintedFeatures) {
                return  ((PrintedFeatures) f).getNumberOfPages();
            }
        }
        return 10;
    }


    @Override
    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        for (Feature f : features) {
            contributors.addAll(f.getContributors());
        }
        return contributors;
    }

    @Override
    public String getTitle() {
        return null;
    }


    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
