package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] weekDays = {"Hétfő","Kedd","szerda","csütörtök","péntek","szombat","vasárnap"};
        System.out.println(weekDays[1]);

        int[] powerTwo = new int[5];
        powerTwo[0]=1;

        for (int i=1;i<powerTwo.length;i++){
            powerTwo[i] = powerTwo[i-1]*2;
        }
        for (int powerAct : powerTwo){
            System.out.print(powerAct);
        }

        boolean[] arrayOfBoolean = new boolean[6];

        for (int i=0;i<arrayOfBoolean.length;i++){
          //  arrayOfBoolean[i] =  i%2 ==0 ? false : true;
            arrayOfBoolean[i] =  i%2!=0;
        }

        System.out.println();
        for (boolean booleanAct : arrayOfBoolean){
            System.out.println(booleanAct);
        }

    }
}
