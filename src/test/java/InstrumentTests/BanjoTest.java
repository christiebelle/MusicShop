package InstrumentTests;

import Enums.Family;
import Instruments.Strings.Banjo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BanjoTest {

    Banjo banjo;

    @Before
    public void setUp() throws Exception {
        banjo = new Banjo(200.00, 550.00, Family.STRINGS, "Deering", "Bluegrass");
    }

    @Test
    public void testGetTradePrice() {
        assertEquals(200.00, banjo.getTradeprice(), 0.01);
    }

    @Test
    public void testGetRetailPrice() {
        assertEquals(550.00, banjo.getRrp(), 0.01);
    }

    @Test
    public void testInstrumentFamily() {
        assertEquals("Strings", banjo.getFamily());
    }

    @Test
    public void testGetMake() {
        assertEquals("Deering", banjo.getMake());
    }

    @Test
    public void testGetStyle() {
        assertEquals("Bluegrass", banjo.getStyle());
    }

    @Test
    public void testCanPlay() {
        assertEquals("buy me a banjo. clatter janger ringer janger.", banjo.play());
    }

    @Test
    public void testCanTune() {
        assertEquals("tuning up, twang twang twang a lang", banjo.tune());
    }
}
