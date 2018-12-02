package Items;

import Interfaces.ISell;

public class DrumStick extends StockItems implements ISell {

    public DrumStick(int buyPrice, int sellPrice, String brand) {
        super(buyPrice, sellPrice, brand);
    }

    public int calculateMarkup(){
        return sellPrice - buyPrice;
    }
}
