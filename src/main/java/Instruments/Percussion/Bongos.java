package Instruments.Percussion;

import Enums.Family;
import Instruments.Instruments;
import Interfaces.iPlay;

public class Bongos extends Instruments implements iPlay {

    int size;

    public Bongos(double tradeprice, double rrp, Family family, String make, int size) {
        super(tradeprice, rrp, family, make);

        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String play() {
        return "hello Leonard, do you like my bongos";
    }

    @Override
    public String tune() {
        return "tuning up, bangalang";
    }
}
