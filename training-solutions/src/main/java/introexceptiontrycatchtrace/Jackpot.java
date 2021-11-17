package introexceptiontrycatchtrace;

public class Jackpot {

    public static void main(String[] args) {
        Winner winner = new Winner();

        for(int i = 0;i<10;i++){
            System.out.println(winner.getWinner());
        }
    }
}
