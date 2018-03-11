package Instruments.Woodwind;

import Enums.Family;
import Instruments.Instruments;
import Interfaces.iPlay;

public class Saxophone extends Instruments implements iPlay {

    public Saxophone(double tradeprice, double rrp, Family family, String make) {
        super(tradeprice, rrp, family, make);
    }

    @Override
    public String play() {
        return "badadabaa";
    }

    @Override
    public String tune() {
        return "tuning up,badadada";
    }
}
