package Items;

public abstract class StockItems {

    private int buyPrice;
    private int sellPrice;
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
}
