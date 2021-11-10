package meetingrooms;

import java.util.ArrayList;
import java.util.List;


public class Office {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom){
        meetingRooms.add(meetingRoom);
    }
    public void printNames(){
        for (MeetingRoom i : meetingRooms){
            System.out.println(i.getName()); // ez működik
        }
    }
    public void printNamesReverse(){
        for (int i = meetingRooms.size()-1; i > -1 ; i--){
            System.out.println(meetingRooms.get(i).getName());
        }
    }
    public void printEvenNames(){
        for (int i = 0;  i< meetingRooms.size(); i+=2){
            System.out.println(meetingRooms.get(i).getName());
        }
    }
    public void printAreas(){
        for (MeetingRoom i : meetingRooms){
            System.out.println(i.getArea());
        }
    }
    public void printMeetingRoomsWithName(String name){
        for (MeetingRoom i : meetingRooms){
            if (name.equals(i.getName())) {
                System.out.println(i);
            }
        }
    }
    public void printMeetingRoomsContains(String part){
        for (MeetingRoom i : meetingRooms){
            if (i.getName().contains(part)) {
                System.out.println(i);
            }
        }
    }
    public void printAreasLargerThan(int area){
        for (MeetingRoom i : meetingRooms){
            if (i.getArea() > area) {
                System.out.println(i);
            }
        }
    }



}
