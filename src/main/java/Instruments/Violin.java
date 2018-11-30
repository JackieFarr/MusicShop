package Instruments;

public class Violin extends Instrument {

    private String bowType;

    public Violin(String colour, String material, int sellPrice, int buyPrice, String bowType){
        super(colour, "String", material, sellPrice, buyPrice);
        this.bowType = bowType;
    }

    public String getBowType() {
        return this.bowType;
    }
}
