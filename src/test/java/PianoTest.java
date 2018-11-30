import Instruments.Instrument;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Black", "Wood", 1000, 500, "Yamaha", 3, "honky tonk");
    }

    @Test
    public void hasColour(){
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Wood", piano.getMaterial());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(1000, piano.getSellPrice());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(500, piano.getBuyPrice());
    }

    @Test
    public void hasBrand(){
        assertEquals("Yamaha", piano.getBrand());
    }

    @Test
    public void getNumOfPedals(){
        assertEquals(3, piano.getNumOfPedals());
    }

    @Test
    public void canPlay(){
        assertEquals("I play this sound: honky tonk", piano.play("honky tonk"));
    }
}
