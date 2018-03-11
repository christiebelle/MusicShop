package InstrumentTests;

import Enums.Family;
import Instruments.Woodwind.Flute;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void setUp() throws Exception {
        flute = new Flute(179.99, 440.00, Family.WOODWIND, "Yamaha");
    }

    @Test
    public void testGetTradePrice() {
        assertEquals(179.99, flute.getTradeprice(), 0.01);
    }

    @Test
    public void testGetRetailPrice() {
        assertEquals(440.00, flute.getRrp(), 0.01);
    }

    @Test
    public void testInstrumentFamily() {
        assertEquals("Woodwind", flute.getFamily());
    }

    @Test
    public void testGetMake() {
        assertEquals("Yamaha", flute.getMake());
    }
}
