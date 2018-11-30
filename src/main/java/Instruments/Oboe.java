package Instruments;

public class Oboe extends Instrument {

    private String length;

    public Oboe(String colour, String material, int sellPrice, int buyPrice, String length){
        super(colour, "Woodwind", material, sellPrice, buyPrice);
        this.length = length;
    }

    public String getLength() {
        return this.length;
    }
}
