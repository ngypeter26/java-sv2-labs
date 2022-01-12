package catalog;

public  final class SearchCriteria {
    public  final String title;
    public  final String contributor;

    public SearchCriteria(String title, String contributor) {
        this.title = title;
        this.contributor = contributor;
    }

    public static SearchCriteria createByBoth(String title , String contributor){
        if (title==null || contributor==null){
            throw new  IllegalArgumentException("Input is null");
        }
        return new SearchCriteria(title,contributor);
    }
    public static SearchCriteria createByContributor(String contributor){
        if (contributor==null){
            throw new  IllegalArgumentException("Input is null");
        }
        return new SearchCriteria(null,contributor);
    }
    public static SearchCriteria createByTitle(String title){
        if (title==null){
            throw new  IllegalArgumentException("Input is null");
        }
        return new SearchCriteria(title,null);
    }

    public String getTitle() {
        return title;
    }

    public String getContributor() {
        return contributor;
    }
    public boolean hasTitle() {
        return title!=null;
    }

    public boolean hasContributor() {
        return contributor!=null;
    }
    public boolean isString(String input){
        if (input==null){
           throw new  IllegalArgumentException("Input is null");
        }
        return true;
    }

}
