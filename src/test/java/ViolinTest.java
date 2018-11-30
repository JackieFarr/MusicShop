import Instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void before(){
        violin = new Violin("Red", "Maple", 5000, 2000, "Ivory", "eee");
    }

    @Test
    public void hasColour(){
        assertEquals("Red", violin.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Maple", violin.getMaterial());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(5000, violin.getSellPrice());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(2000, violin.getBuyPrice());
    }

    @Test
    public void hasBowType(){
        assertEquals("Ivory", violin.getBowType());
    }

    @Test
    public void canPlay(){
        assertEquals("I play this sound: eee", violin.play("eee"));
    }
}
