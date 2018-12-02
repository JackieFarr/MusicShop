package Items;

import Interfaces.ISell;

public abstract class StockItems implements ISell {

    protected int buyPrice;
    protected int sellPrice;
    private String brand;

    public StockItems(int buyPrice, int sellPrice, String brand){
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.brand = brand;
    }

    public int getBuyPrice() {
        return this.buyPrice;
    }

    public int getSellPrice() {
        return this.sellPrice;
    }

    public String getBrand() {
        return this.brand;
    }

    public int calculateMarkup(){
        return this.sellPrice - this.buyPrice;
    }
}
