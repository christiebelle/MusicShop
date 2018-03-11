package Instruments.Strings;

import Enums.Family;
import Instruments.Instruments;
import Interfaces.iPlay;

public class Cello extends Instruments implements iPlay {

    public Cello(double tradeprice, double rrp, Family family, String make) {
        super(tradeprice, rrp, family, make);
    }

    @Override
    public String play() {
        return "zoooom zoomazoom";
    }

    @Override
    public String tune() {
        return "tuning up. ping ping ping";
    }
}
