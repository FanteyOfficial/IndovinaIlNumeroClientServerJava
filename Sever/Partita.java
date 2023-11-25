import java.util.Random;
public class Partita {
    private Random r = new Random();
    private int randomNum;
    Partita() {
        randomNum = r.nextInt(1, 10);
    }

    public boolean checkVictory(int n) {
        if (randomNum == n) {
            return true;
        }
        return false;
    }
}
