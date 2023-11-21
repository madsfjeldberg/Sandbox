import java.lang.reflect.Array;
import java.util.ArrayList;

public class Tekst {

    ArrayList<String> tekstLinjer;

    public Tekst() {
        tekstLinjer = new ArrayList<>();
    }

    public void tilføj(String tekst) {
        tekstLinjer.add(tekst);
    }

    public int findAntalUnikke() {
        ArrayList<String> unikke = new ArrayList<>();

        for (String string: tekstLinjer) {
            if (!unikke.contains(string)) unikke.add(string);

        }
        return unikke.size();
    }
}
