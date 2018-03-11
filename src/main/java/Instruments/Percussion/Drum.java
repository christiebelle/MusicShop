package Instruments.Percussion;

import Enums.Family;
import Instruments.Instruments;
import Interfaces.iPlay;

public class Drum extends Instruments implements iPlay {

    public Drum(double tradeprice, double rrp, Family family, String make) {
        super(tradeprice, rrp, family, make);
    }

    @Override
    public String play() {
        return "bang bada bang";
    }

    @Override
    public String tune() {
        return "tuning up, bangalang";
    }
}
