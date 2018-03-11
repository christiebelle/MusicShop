package Instruments.Woodwind;

import Enums.Family;
import Instruments.Instruments;

public class Flute  extends Instruments {

    String type;

    public Flute(double tradeprice, double rrp, Family family, String make, String type) {
        super(tradeprice, rrp, family, make);

        this.type = type;

    }

    public String getType() {
        return type;
    }
}
