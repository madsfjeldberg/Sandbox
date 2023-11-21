import java.util.ArrayList;
import java.util.List;

public class Card {

    private String suit;
    private int value;
    private ArrayList<String> suits = new ArrayList<>(List.of("spades", "hearts", "diamonds", "clubs"));


    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }


    public boolean beats(Card card2) {
        if (this.value > card2.getValue()) {
            if (this.suits.indexOf(this.suit) <= this.suits.indexOf(card2.getSuit()));
            return true;
        } return false;
    }

    // spades > hearts > diamonds > clubs

    public int getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }
}
