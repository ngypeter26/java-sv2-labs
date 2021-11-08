package controlselection.greetings;


public class Greetings {

    public String sayHello(int hour, int minute){
        int minutes = hour * 60 + minute;
        String output;
        if (minutes < 5*60) {
            output = "Jó éjt!";
            System.out.println(output);
            return output;
        }
        else if ( minutes < 9*60){
            output = "Jó reggelt!";
            System.out.println(output);
            return output;
        }
        else if ( minutes < 18*60+30){
            output = "Jó napot!";
            System.out.println(output);
            return output;
        }
        else if (minutes < 20*60){
            output = "Jó estét!";
            System.out.println(output);
            return output;
        }
        else{
            output = "Jó éjt!";
            System.out.println(output);
            return output;
        }
    }

//    public static void main(String[] args) {
//        Greetings greetings = new Greetings();
//        greetings.sayHello(4,10);
//    }
}
