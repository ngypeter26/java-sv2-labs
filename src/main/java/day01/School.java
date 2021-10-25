package day01;

public class School {
    public static void main(String[] args) {

        Students std = new Students();

        std.addHeight(154);
        std.addHeight(160);
        std.addHeight(170);
        std.addHeight(130);
        std.addHeight(190);
        std.addHeight(200);

        System.out.println(std.isHeightsIncreasing());
    }
}
