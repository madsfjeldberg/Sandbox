import java.util.ArrayList;

public class Butik {

    ArrayList<Cykel> inventory = new ArrayList<>();

    public void add(String mærke, String farve, int pris) {
        Cykel cykel = new Cykel(mærke, farve, pris);
        inventory.add(cykel);
    }

    public int samletLagerBeholdning() {
        int totalPris = 0;
        for (Cykel cykel: inventory) {
            totalPris += cykel.pris;
        }
        return totalPris;
    }
}
