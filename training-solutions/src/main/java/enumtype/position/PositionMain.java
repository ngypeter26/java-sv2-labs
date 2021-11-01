package enumtype.position;

import enumtype.university.University;

public class PositionMain {
    public static void main(String[] args) {
        for (Position i : Position.values()){

            System.out.println(i.ordinal()+1 + ". pozíció: " + i +
                    ", fizetés : " +  i.getSalary() +
                    ", juttatás : " +  i.getBenefit());
        }
    }

}
