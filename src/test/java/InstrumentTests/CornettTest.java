package InstrumentTests;

import Enums.Family;
import Instruments.Brass.Cornett;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CornettTest {

    Cornett cornett;

    @Before
    public void setUp() throws Exception {
        cornett = new Cornett(100.00, 250.00, Family.BRASS, "Besson");
    }

    @Test
    public void testGetTradePrice() {
        assertEquals(100.00, cornett.getTradeprice(), 0.01);
    }

    @Test
    public void testGetRetailPrice() {
        assertEquals(250.00, cornett.getRrp(), 0.01);
    }

    @Test
    public void testInstrumentFamily() {
        assertEquals("Brass", cornett.getFamily());
    }

    @Test
    public void testGetMake() {
        assertEquals("Besson", cornett.getMake());
    }
}
