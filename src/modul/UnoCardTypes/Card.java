
package modul.UnoCardTypes;

public abstract class Card {
    protected Color color;

    public Card(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}