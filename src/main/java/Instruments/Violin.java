package Instruments;

import Interfaces.ISell;

public class Violin extends Instrument implements ISell {

    private String bowType;

    public Violin(String colour, String material, int sellPrice, int buyPrice, String bowType, String sound){
        super(colour, "String", material, sellPrice, buyPrice, sound);
        this.bowType = bowType;
    }

    public String getBowType() {
        return this.bowType;
    }

    public int calculateMarkup(int sellPrice, int buyPrice){
        return this.getSellPrice() - this.getBuyPrice() ;
    }
}
