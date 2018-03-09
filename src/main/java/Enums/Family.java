package Enums;

import java.awt.datatransfer.StringSelection;

public enum Family {
    BRASS("Brass"),
    STRINGS("Strings"),
    WOODWIND("Woodwind"),
    PERCUSSION("Percussion");

    private String family;

    Family(String family) {
        this.family = family;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
