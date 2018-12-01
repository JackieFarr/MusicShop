package Instruments;

import Interfaces.ISell;

public class Oboe extends Instrument implements ISell {

    private int length;

    public Oboe(String colour, String material, int sellPrice, int buyPrice, int length, String sound){
        super(colour, "Woodwind", material, sellPrice, buyPrice, sound);
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }

    public int calculateMarkup(){
        return this.getSellPrice() - this.getBuyPrice() ;
    }
}
