
package modul.UnoDeck;

import modul.UnoCardTypes;

public class DropDeck implements {
    private Card topCard;

    DropDeck() {
        this.topCard == null;
    }

    public Card getTopCard(){
        return this.topCard;
    }

    @overrride
    public void addCard(Card card) {
        this.topCard = card;
    }

    @overrride
    public void removeCard(Card card){
        this.topCard = null;
    }

    @override
    public boolean isEmpty(){
        return this.topCard.isEmpty();
    }

}