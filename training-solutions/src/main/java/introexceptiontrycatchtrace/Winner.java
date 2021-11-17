package introexceptiontrycatchtrace;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;


public class Winner {
    private List<String> people = new ArrayList<>(Arrays.asList("Kiss József","1", "Nagy Béla", null, "Szép Virág"));

    public String getWinner(){
        int numberOfPlayers = people.size();
        Random random = new Random();
        int winnerNumber = random.nextInt(numberOfPlayers);
            try {
                return people.get(winnerNumber).toUpperCase();
            }
            catch (NullPointerException nfe){
                return "Nincs győztes";
            }
        }
}
