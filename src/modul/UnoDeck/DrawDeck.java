
package modul.UnoDeck;

import modul.UnoCardTypes;
import java.util.ArrayList;
import java.util.List;

public class DrawDeck  implements Deck{

    private List<Card> drawCards;

    public DrawDeck() {
        this.drawCards = new ArrayList<Card>();
    }

    public List<Card> getCards() {
        return this.drawCards;
    }

    @overrride
    public void addCard(Card card) {
        this.drawCards.add(card);
    }

    @override
    public boolean removeCard(Card card) {
        return this.drawCards.remove(card);
    }

    @override
    public boolean isEmpty(){
        return this.drawCards.isEmpty();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

}