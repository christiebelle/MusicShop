package Instruments.Brass;

import Enums.Family;
import Instruments.Instruments;
import Interfaces.iPlay;

public class Trumpet extends Instruments implements iPlay {

    public Trumpet(double tradeprice, double rrp, Family family, String make) {
        super(tradeprice, rrp, family, make);
    }

    @Override
    public String play() {
        return "toot toot! tootaloo!";
    }

    @Override
    public String tune() {
        return "tuning up! toot toot!";
    }
}
