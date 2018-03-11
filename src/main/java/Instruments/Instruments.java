package Instruments;

import Enums.Family;
import Interfaces.iPlay;

public abstract class Instruments implements iPlay {

    private double tradeprice;
    private double rrp;
    private Family family;
    private String make;
    private Instruments instrument;

    public Instruments(double tradeprice, double rrp, Family family, String make) {
        this.tradeprice = tradeprice;
        this.rrp = rrp;
        this.family = family;
        this.make = make;
    }

    public double getTradeprice() {
        return tradeprice;
    }

    public double getRrp() {
        return rrp;
    }

    public String getFamily() {
        return family.getFamily();
    }

    public String getMake() {
        return make;
    }

    public void setRrp(double rrp) {
        this.rrp = rrp;
    }
}
