import Items.DrumStick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumStick drumStick;

    @Before
    public void before(){
        drumStick = new DrumStick(7, 15, "Sabian");
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(7, drumStick.getBuyPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(15, drumStick.getSellPrice());
    }

    @Test
    public void hasBrand(){
        assertEquals("Sabian", drumStick.getBrand());
    }
}
