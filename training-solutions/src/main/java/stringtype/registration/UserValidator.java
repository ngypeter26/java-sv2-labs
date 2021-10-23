package stringtype.registration;

public class UserValidator {
//    private String username;
//    private String password1;
//    private String password2;
//    private String email;

    public boolean isValidUsername(String username){
        int legthUserName = username.length();
        return legthUserName > 0;
    }

    public boolean isValidPassword(String password1, String password2){
        int legthpassWord = password1.length();
        boolean egyezik = password1.equals(password2);
        return legthpassWord > 7 && egyezik;
    }

    public boolean isValidEmail(String email){
        int kukacIndex = email.indexOf("@");
//        System.out.println(kukacIndex);
        kukacIndex = kukacIndex == -1 ? 0 : kukacIndex;
        String kukacUtan = email.substring(kukacIndex);
//        System.out.println(kukacUtan);
        int pontIndex= kukacUtan.indexOf(".");
//        System.out.println(pontIndex);
        return kukacIndex > 0 && pontIndex > 1;
    }
}
