package inheritanceattributes;

import jdk.swing.interop.SwingInterOpUtils;

public class BuildingMain {
    public static void main(String[] args) {
        Building building = new Building("D",100.2,2);
        SchoolBuilding schoolBuilding = new SchoolBuilding("általános", 1000.2,4,30);

        System.out.println(building.area);
        System.out.println(building.name);
        System.out.println(building.getFloors());

        System.out.println(schoolBuilding.area);
        System.out.println(schoolBuilding.name);
        System.out.println(schoolBuilding.getFloors());
        System.out.println(schoolBuilding.getNumberOfClassRooms());
    }
}
