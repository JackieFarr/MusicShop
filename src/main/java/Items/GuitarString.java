package Items;

public class GuitarString extends StockItems {

    private String guitarType;

    public GuitarString(int buyPrice, int sellPrice, String brand, String guitarType) {
        super(buyPrice, sellPrice, brand);
        this.guitarType = guitarType;
    }

    public String getGuitarType() {
        return this.guitarType;
    }
}
