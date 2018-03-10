package Instruments;

import Enums.Family;

public abstract class Instruments {

    private double tradeprice;
    private double rrp;
    private Family family;
    private String make;

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

    public Family getFamily() {
        return family;
    }

    public String getMake() {
        return make;
    }

    public void setRrp(double rrp) {
        this.rrp = rrp;
    }
}
