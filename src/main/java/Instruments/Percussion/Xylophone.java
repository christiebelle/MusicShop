package Instruments.Percussion;

import Enums.Family;
import Instruments.Instruments;
import Interfaces.iPlay;

public class Xylophone extends Instruments implements iPlay {

    public Xylophone(double tradeprice, double rrp, Family family, String make) {
        super(tradeprice, rrp, family, make);
    }

    @Override
    public String play() {
        return "tringaling";
    }

    @Override
    public String tune() {
        return "tuning up, bangalang";
    }
}
