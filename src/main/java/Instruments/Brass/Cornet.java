package Instruments.Brass;

import Enums.Family;
import Instruments.Instruments;
import Interfaces.iPlay;

public class Cornet extends Instruments implements iPlay {

    int valves;

    public Cornet(double tradeprice, double rrp, Family family, String make, int valves) {
        super(tradeprice, rrp, family, make);

        this.valves = valves;
    }

    public int getValves() {
        return valves;
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
