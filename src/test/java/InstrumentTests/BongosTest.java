package InstrumentTests;

import Enums.Family;
import Instruments.Percussion.Bongos;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BongosTest {

    Bongos bongos;

    @Before
    public void setUp() throws Exception {
        bongos = new Bongos(180.00, 310.00, Family.PERCUSSION, "Latin Percussion", 7);
    }

    @Test
    public void testGetTradePrice() {
        assertEquals(180.00, bongos.getTradeprice(), 0.01);
    }

    @Test
    public void testGetRetailPrice() {
        assertEquals(310.00, bongos.getRrp(), 0.01);
    }

    @Test
    public void testInstrumentFamily() {
        assertEquals("Percussion", bongos.getFamily());
    }

    @Test
    public void testGetMake() {
        assertEquals("Latin Percussion", bongos.getMake());
    }

    @Test
    public void testGetSize() {
        assertEquals(7, bongos.getSize());
    }
}
