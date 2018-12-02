import Items.GuitarString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
    public void before(){
        guitarString = new GuitarString(5, 8, "Gibson", "Bass");
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(5, guitarString.getBuyPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(8, guitarString.getSellPrice());
    }

    @Test
    public void hasBrand(){
        assertEquals("Gibson", guitarString.getBrand());
    }

    @Test
    public void hasGuitarType(){
        assertEquals("Bass", guitarString.getGuitarType());
    }

}
