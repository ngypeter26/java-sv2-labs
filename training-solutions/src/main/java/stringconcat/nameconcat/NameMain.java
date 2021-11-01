package stringconcat.nameconcat;

public class NameMain {
    public static void main(String[] args) {
        System.out.println(new Name("Doe", "Fckn", "John", Title.MR).concatNameWesternStyle());
        System.out.println(new Name("Doe", "Fckn", "John", Title.MR).concatNameHungarianStyle());

        System.out.println(new Name("Doe", "Fckn", "John", null).concatNameWesternStyle());
        System.out.println(new Name("Doe", "Fckn", "John", null).concatNameHungarianStyle());

        System.out.println(new Name("Doe", "", "John", Title.MR).concatNameWesternStyle());
        System.out.println(new Name("Doe", "", "John", Title.MR).concatNameHungarianStyle());

        System.out.println(new Name("Doe", null, "John", Title.MR).concatNameWesternStyle());
        System.out.println(new Name("Doe", null, "John", Title.MR).concatNameHungarianStyle());
    }
}
