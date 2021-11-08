package controlselection.accents;


public class WithoutAccents {

    public String convertAccent(String letter) {
        String lettersToReplace = "áéíóöőúüűÁÉÍÓÖŐÚÜŰ";
        String lettersToSubstitute = "aeiooouuuAEIOOOUUU";


        int index = lettersToReplace.indexOf(letter);
        if (index >= 0) { //benne van
            return lettersToSubstitute.substring(index,index+1);
        }
        else {
            return letter;
        }
    }


    public static void main(String[] args) {
        WithoutAccents WA = new WithoutAccents();

        System.out.println("á:" + WA.convertAccent("á"));
        System.out.println("é:" + WA.convertAccent("é"));
        System.out.println("ű:" + WA.convertAccent("ű"));
        System.out.println("Ú:" + WA.convertAccent("Ú"));
        System.out.println("Í:" + WA.convertAccent("Í"));
    }
}
