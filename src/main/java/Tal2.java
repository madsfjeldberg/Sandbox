import java.util.ArrayList;
import java.util.List;

public class Tal2 {

    ArrayList<Integer> talListe = new ArrayList<Integer>(List.of(5,66,12,87,66,5,89));

    public int tælTal(int tal) {
        int occurences = 0;
        for (int i: talListe) {
            if (i == tal) {
                occurences += 1;
            }
        }
        return occurences;
    }

    public int average() {
        int sum = 0;
        for (int i: talListe) {
            sum += i;
        }
        return sum / talListe.size();
    }
}
