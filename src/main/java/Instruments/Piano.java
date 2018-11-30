package Instruments;

public class Piano extends Instrument{

    private String brand;
    private int numOfPedals;

    public Piano(String colour, String material, int sellPrice, int buyPrice, String brand, int numOfPedals){
        super(colour, "String", material, sellPrice, buyPrice);
        this.brand = brand;
        this.numOfPedals = numOfPedals;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getNumOfPedals() {
        return this.numOfPedals;
    }
}
