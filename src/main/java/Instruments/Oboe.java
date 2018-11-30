package Instruments;

public class Oboe extends Instrument {

    private int length;

    public Oboe(String colour, String material, int sellPrice, int buyPrice, int length, String sound){
        super(colour, "Woodwind", material, sellPrice, buyPrice, sound);
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }
}
