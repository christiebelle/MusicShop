package Instruments.Strings;

import Enums.Family;
import Instruments.Instruments;

public class Banjo  extends Instruments {

    String style;

    public Banjo(double tradeprice, double rrp, Family family, String make, String style) {
        super(tradeprice, rrp, family, make);

        this.style = style;
    }

    public String getStyle() {
        return style;
    }
}
