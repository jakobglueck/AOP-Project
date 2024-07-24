
package modul.UnoCardTypes;

public class NormalCard extends Card {
    private Number number;

    public NormalCard(Color color, Number number) {
        super(color);
        this.number = number;
    }

    public Number getNumber() {
        return number;
    }

}