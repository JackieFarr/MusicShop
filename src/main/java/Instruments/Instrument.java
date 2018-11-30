package Instruments;

public abstract class Instrument {

    private String colour;
    private String type;
    private String material;
    private int sellPrice;
    private int buyPrice;

    public Instrument(String colour, String type, String material, int sellPrice, int buyPrice){
        this.colour = colour;
        this.type = type;
        this.material = material;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
    }

    public String getColour() {
        return this.colour;
    }

    public String getType() {
        return this.type;
    }

    public String getMaterial() {
        return this.material;
    }

    public int getSellPrice() {
        return this.sellPrice;
    }

    public int getBuyPrice() {
        return this.buyPrice;
    }
}
