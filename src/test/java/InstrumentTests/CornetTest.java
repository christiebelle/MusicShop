package InstrumentTests;

import Enums.Family;
import Instruments.Brass.Cornet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CornetTest {

    Cornet cornet;

    @Before
    public void setUp() throws Exception {
        cornet = new Cornet(100.00, 250.00, Family.BRASS, "Besson", 3);
    }

    @Test
    public void testGetTradePrice() {
        assertEquals(100.00, cornet.getTradeprice(), 0.01);
    }

    @Test
    public void testGetRetailPrice() {
        assertEquals(250.00, cornet.getRrp(), 0.01);
    }

    @Test
    public void testInstrumentFamily() {
        assertEquals("Brass", cornet.getFamily());
    }

    @Test
    public void testGetMake() {
        assertEquals("Besson", cornet.getMake());
    }

    @Test
    public void testGetValves() {
        assertEquals(3, cornet.getValves());
    }
}
