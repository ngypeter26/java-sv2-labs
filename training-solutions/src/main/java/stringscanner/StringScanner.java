package stringscanner;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Írj be egy mondatot (több tagmonat, szavak között szóköz)!");
        String sentence1 = scanner.nextLine();

        //kiírás Ez egy olyan mondat, amely több tagmondatból áll, és ezért megfelel a feladatkiírásnak
        Scanner scannerWord = new Scanner(sentence1);
        while (scannerWord.hasNext()){
            System.out.println(scannerWord.next());
        }

        System.out.println("Írj be egy másik modnatot!");
        String sentence2 = scanner.nextLine();

        Scanner scannerSentence = new Scanner(sentence2).useDelimiter(",");
        while (scannerSentence.hasNext()){
            System.out.println(scannerSentence.next());
        }

    }
}
