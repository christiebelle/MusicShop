package Instruments.Strings;

import Enums.Family;
import Instruments.Instruments;
import Interfaces.iPlay;

public class Violin extends Instruments implements iPlay {

    public Violin(double tradeprice, double rrp, Family family, String make) {
        super(tradeprice, rrp, family, make);
    }

    @Override
    public String play() {
        return "zeeee, zee-zeeee";
    }

    @Override
    public String tune() {
        return "tuning up. ping ping ping";
    }
}
