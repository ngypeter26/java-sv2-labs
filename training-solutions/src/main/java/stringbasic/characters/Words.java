package stringbasic.characters;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg a szót!");
        String teacherWord = scanner.nextLine();

        System.out.println("Betűzd a következő szót!" + "\n" +
                teacherWord);
        System.out.println("Minden betű után nyomj enter!");

        String[] studentWordArray = new String[teacherWord.length()];

        for (int i = 0; i<teacherWord.length();i++){
            studentWordArray[i]=(scanner.nextLine());

        }

        String studentWord = "";
        System.out.println("A beírt betűk:");
        for (String i : studentWordArray){
            System.out.println(i);
            studentWord += i;
        }
        System.out.println("A beírt szó:");
        System.out.println(studentWord);

        if (teacherWord.equals(studentWord)){
            System.out.println("A megoldás helyes!");
        }else{
            System.out.println("A megoldás helytelen!");
        }
    }
}
