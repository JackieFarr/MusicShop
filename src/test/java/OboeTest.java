import Instruments.Oboe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OboeTest {

    Oboe oboe;

    @Before
    public void before(){
        oboe = new Oboe("Brown", "Wood", 500, 100, 65);
    }

    @Test
    public void hasColour(){
        assertEquals("Brown", oboe.getColour());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Wood", oboe.getMaterial());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(500, oboe.getSellPrice());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(100, oboe.getBuyPrice());
    }

    @Test
    public void hasLength(){
        assertEquals(65, oboe.getLength());
    }

}
