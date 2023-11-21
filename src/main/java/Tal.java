import java.util.ArrayList;
import java.util.Random;

public class Tal {

    ArrayList<Integer> tal = new ArrayList<>();
    Random random = new Random();

    public int randomNumber() {
        int number = random.nextInt(5) + 1;
        return number;
    }

    public void lavMangeTal() {
        for (int i = 0; i < 10; i++) {
            tal.add(randomNumber());
        }

    }

    public ArrayList<Integer> getTilfældigeTal() {
        return tal;
    }
}
