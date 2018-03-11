package Instruments.Brass;

import Enums.Family;
import Instruments.Instruments;

public class Cornet extends Instruments {

    int valves;

    public Cornet(double tradeprice, double rrp, Family family, String make, int valves) {
        super(tradeprice, rrp, family, make);

        this.valves = valves;
    }

    public int getValves() {
        return valves;
    }
}
