import Instruments.Guitar;
import Instruments.Oboe;
import Instruments.Piano;
import Instruments.Violin;
import Interfaces.ISell;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Violin violin;
    Oboe oboe;
    Piano piano;
    Piano piano2;

    @Before
    public void before(){
        guitar = new Guitar("Blue", "Wood", 2500, 400, "Gibson", 6, "pluck");
        oboe = new Oboe("Brown", "Wood", 500, 100, 65, "oomph");
        piano = new Piano("Black", "Wood", 1000, 500, "Yamaha", 3, "honky tonk");
        piano2 = new Piano("Yellow", "Gold", 5000, 3000, "Yamaha", 4, "honky tonky tonk");
        violin = new Violin("Red", "Maple", 5000, 2000, "Ivory", "eee");

        ArrayList<ISell> stock = new ArrayList<ISell>();

        stock.add(guitar);
        stock.add(oboe);
        stock.add(violin);
        stock.add(piano);

        shop = new Shop("Empire Records");
    }

    @Test
    public void getAllStock(){
        shop.addStock(piano2);
        shop.addStock(guitar);
        shop.addStock(piano);
        shop.addStock(oboe);
        assertEquals(4, shop.getStock().size());
    }

    @Test
    public void canAddStock(){
        shop.addStock(piano2);
        shop.addStock(piano);
        shop.addStock(guitar);
        shop.addStock(piano);
        shop.addStock(oboe);
        assertEquals(5, shop.getStock().size());
    }

    @Test
    public void canSellStock(){
        shop.addStock(piano2);
        shop.addStock(guitar);
        shop.addStock(piano);
        shop.addStock(oboe);
        shop.sellStockByName(piano);
        assertEquals(3, shop.getStock().size());
    }

    @Test
    public void hasProfit(){
        shop.addStock(piano2);
        shop.addStock(guitar);
        shop.addStock(piano);
        shop.addStock(oboe);
        assertEquals(5000, shop.calculateShopProfit());
    }
}
