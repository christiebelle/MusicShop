package Instruments.Woodwind;

import Enums.Family;
import Instruments.Instruments;
import Interfaces.iPlay;

public class Oboe extends Instruments implements iPlay {

    public Oboe(double tradeprice, double rrp, Family family, String make) {
        super(tradeprice, rrp, family, make);
    }

    @Override
    public String play() {
        return "booodaloo";
    }

    @Override
    public String tune() {
        return "tuning up, floodaloo";
    }
}
