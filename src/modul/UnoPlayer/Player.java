
package modul.UnoPlayer;

import modul.UnoCardTypes;
import modul.UnoDeck;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String playerName;
    private List<Deck> playerHand;

    Player(string Name, List<Deck> playerHand){
        this.playerName = Name;
        this.playerHand = playerHand;
    }

    public List<Deck> getPlayerHand{
        return this.playerHand;
    }

    public String getPlayerHand{
        return this.playerName;
    }

    public String sayUno(){
        return "UNO";
    }

    public Card selectCard(){
    }

    public void playCard(Card Card){

    }
}