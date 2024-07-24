
package modul.UnoCardTypes;

public class SpecialCard extends Card {
    private SpecialEffect specialEffect;

    public SpecialCard(Color color, SpecialEffect specialEffect) {
        super(color);
        this.specialEffect = specialEffect;
    }

    public SpecialEffect getSpecialEffect() {
        return specialEffect;
    }

}