package stringconcat.nameconcat;

public class Name {
    String familyName;
    String middleName;
    String givenName;
    Title title;


    public Name(String familyName, String middleName, String givenName, Title title) {
        this.familyName = familyName == null || familyName.isEmpty()? "" : familyName + " ";
        this.middleName = middleName == null || middleName.isEmpty() ? "" : middleName + " ";
        this.givenName = givenName == null || givenName.isEmpty()? "" : givenName + " ";
        this.title = title ==null ? Title.valueOf("NONE"): title;
        if (title ==null){
            this.title = Title.valueOf("NONE");
        }
    }

    public String concatNameWesternStyle(){
        String fullName = title.getTitleString();
        fullName += givenName;
        fullName += middleName;
        fullName += familyName;
        return fullName;
    }
    public String concatNameHungarianStyle(){
        return familyName.concat(middleName).concat(givenName);
    }
}
