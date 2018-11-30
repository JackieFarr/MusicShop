import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Blue", "Wood", 2500, 400, "Gibson", 6);
    }

    @Test
    public void hasColour(){
        assertEquals("Blue", guitar.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(2500, guitar.getSellPrice());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(400, guitar.getBuyPrice());
    }

    @Test
    public void hasBrand(){
        assertEquals("Gibson", guitar.getBrand());
    }

    @Test
    public void hasNumOfStrings(){
        assertEquals(6, guitar.getNumOfStrings());
    }
}
