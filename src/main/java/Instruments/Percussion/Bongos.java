package Instruments.Percussion;

import Enums.Family;
import Instruments.Instruments;

public class Bongos extends Instruments {

    int size;

    public Bongos(double tradeprice, double rrp, Family family, String make, int size) {
        super(tradeprice, rrp, family, make);

        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
