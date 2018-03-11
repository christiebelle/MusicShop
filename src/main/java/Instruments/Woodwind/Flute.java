package Instruments.Woodwind;

import Enums.Family;
import Instruments.Instruments;
import Interfaces.iPlay;

public class Flute  extends Instruments implements iPlay {

    String type;

    public Flute(double tradeprice, double rrp, Family family, String make, String type) {
        super(tradeprice, rrp, family, make);

        this.type = type;

    }

    public String getType() {
        return type;
    }

    @Override
    public String play() {
        return "insert lilting flute music here";
    }

    @Override
    public String tune() {
        return "tuning up, floodaloo";
    }
}
