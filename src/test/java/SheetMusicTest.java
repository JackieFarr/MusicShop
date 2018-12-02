import Items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic(6, 20, "Oxford", "Piano", "A Rush of Blood to the Head", "Coldplay");
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(6, sheetMusic.getBuyPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(20, sheetMusic.getSellPrice());
    }

    @Test
    public void hasBrand(){
        assertEquals("Oxford", sheetMusic.getBrand());
    }

    @Test
    public void hasInstrument(){
        assertEquals("Piano", sheetMusic.getInstument());
    }

    @Test
    public void hasTitle(){
        assertEquals("A Rush of Blood to the Head", sheetMusic.getTitle());
    }

    @Test
    public void hasArtist(){
        assertEquals("Coldplay", sheetMusic.getArtist());
    }


}
