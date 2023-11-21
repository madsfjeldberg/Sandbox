import java.util.ArrayList;

public class Keyword {

    private String word;
    private String definition;
    private ArrayList<String> seeAlso;

    public Keyword(String word, String definition) {
        this.word = word;
        this.definition = definition;
        seeAlso = new ArrayList<>();
    }


    public boolean matches(String search) {

        if (word.toLowerCase().contains(search.toLowerCase())) {
            return true;
        } return false;
    }

    public String print() {
        return word + definition + seeAlso;
    }
}
