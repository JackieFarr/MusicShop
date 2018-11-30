package Instruments;

public class Guitar extends Instrument {

    private String brand;
    private int numOfStrings;

    public Guitar(String colour, String material, int sellPrice, int buyPrice, String brand, int numOfStrings){
        super(colour, "String", material, sellPrice, buyPrice);
        this.brand = brand;
        this.numOfStrings = numOfStrings;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getNumOfStrings() {
        return this.numOfStrings;
    }
}
