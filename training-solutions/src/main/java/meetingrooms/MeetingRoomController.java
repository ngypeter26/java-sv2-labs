package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {
    private Office office = new Office();
    Scanner scanner = new Scanner(System.in);
    public void readOffice() {
        System.out.println("Add meg a tárgyaló nevét");
        String name = scanner.nextLine();
        System.out.println("Add meg a tárgyaló szélességét");
        int width = scanner.nextInt();
        System.out.println("Add meg a tárgyaló hosszát");
        int length = scanner.nextInt();
        scanner.nextLine();
        office.addMeetingRoom(new MeetingRoom(name,length,width));
    }

    public void printMenu() {
        System.out.println("1. Tárgyaló rögzítése" + "\n" +
                "2. Tárgyalók sorrendben " + "\n" +
                "3. Tárgyalók visszafele sorrendben" + "\n" +
                "4. Minden második tárgyaló" + "\n" +
                "5. Területek" + "\n" +
                "6. Keresés pontos név alapján" + "\n" +
                "7. Keresés névtöredék alapján" + "\n" +
                "8. Keresés terület alapján" + "\n" +
                "9. Kilépés ");
    }

    public void runMenu() {
        int parancs = 0;
        printMenu();
        while (parancs !=9){
        System.out.println("Válassz menüpontot és nyomj entert!");
        parancs = scanner.nextInt();
            scanner.nextLine();
        switch (parancs) {
            case 1:  //Tárgyaló rögzítése
                readOffice();
                break;
            case 2: //Tárgyalók sorrendben
                office.printNames();
                break;
            case 3:     //Tárgyalók visszafele sorrendben
                office.printNamesReverse();
                break;
            case 4:     //Minden második tárgyaló
                office.printEvenNames();
                break;
            case 5:     //Területek
                office.printAreas();
                break;
            case 6:     //Keresés pontos név alapján
                System.out.println("Add meg a nevet!");
                office.printMeetingRoomsWithName(scanner.nextLine());
                break;
            case 7:     //Keresés névtöredék alapján
                System.out.println("Add meg a névtöredéket!");
                String part = scanner.nextLine();
                office.printMeetingRoomsContains(part);
                break;
            case 8:     //Keresés terület alapján
                System.out.println("Add meg a területet!");
                office.printAreasLargerThan(scanner.nextInt());
                break;
            case 9:     //Kilépés
                break;
            default:
                System.out.println("Ilyen parancs nincs");
        }
        }
    }


    public static void main(String[] args) {
        MeetingRoomController meetingRoomController = new MeetingRoomController();
        meetingRoomController.runMenu();

        //Office office = new Office();
    }


}
