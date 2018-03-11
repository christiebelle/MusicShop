package Instruments.Strings;

import Enums.Family;
import Instruments.Instruments;
import Interfaces.iPlay;

public class Banjo  extends Instruments implements iPlay {

    String style;

    public Banjo(double tradeprice, double rrp, Family family, String make, String style) {
        super(tradeprice, rrp, family, make);

        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public String play() {
        return "buy me a banjo. clatter janger ringer janger.";
    }

    @Override
    public String tune() {
        return "tuning up, twang twang twang a lang";
    }
}
