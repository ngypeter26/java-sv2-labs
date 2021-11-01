package stringmethods.filename;

public class FileNameManipulator {
    char findLastCharacter(String str){
        str = str.trim();
        return str.charAt(str.length()-1);
    }
    String findFileExtension(String fileName){
        fileName = fileName.trim();
        return fileName.substring(fileName.lastIndexOf("."));
    }

    boolean identifyFilesByExtension(String ext, String fileName){
        fileName = fileName.trim();
        return fileName.endsWith(ext);
    }
    public boolean compareFilesByName(String searchedFileName, String actualFileName) {
        return  searchedFileName.trim().equalsIgnoreCase(actualFileName.trim());
    }

    public String changeExtensionToLowerCase(String fileName) {
        fileName = fileName.trim();
        String firstPart = fileName.substring(0, fileName.lastIndexOf('.'));
        String extension = fileName.substring(fileName.lastIndexOf('.')).toLowerCase();

        return firstPart.concat(extension);
    }

    public String replaceStringPart(String fileName, String present, String target) {
        return fileName.contains(present) ? fileName.replace(present, target) : fileName;
    }
    public static void main(String[] args) {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();

        System.out.println(fileNameManipulator.findLastCharacter("abcdef"));
        System.out.println(fileNameManipulator.findLastCharacter("abcdef \t  \n "));
//
        System.out.println(fileNameManipulator.findFileExtension("rec.ord.dat"));
//
        System.out.println(fileNameManipulator.identifyFilesByExtension("mm", "tematika.mm"));
        System.out.println(fileNameManipulator.identifyFilesByExtension("md", "tematika.mm"));
//
        System.out.println(fileNameManipulator.compareFilesByName("String.java", "String.JAVA"));
        System.out.println(fileNameManipulator.compareFilesByName("String.java", "Sting.java"));

        System.out.println(fileNameManipulator.changeExtensionToLowerCase("String.JAVA"));
//
        System.out.println(fileNameManipulator.replaceStringPart("picture.png", "jpeg", "jpg"));
        System.out.println(fileNameManipulator.replaceStringPart("picture.jpeg", "jpeg", "jpg"));
        System.out.println(fileNameManipulator.replaceStringPart("long descriptive name.txt", " ", "_"));
    }
}

