package Instruments;

import Interfaces.ISell;

public class Piano extends Instrument implements ISell {

    private String brand;
    private int numOfPedals;

    public Piano(String colour, String material, int sellPrice, int buyPrice, String brand, int numOfPedals, String sound){
        super(colour, "String", material, sellPrice, buyPrice, sound);
        this.brand = brand;
        this.numOfPedals = numOfPedals;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getNumOfPedals() {
        return this.numOfPedals;
    }

    public int calculateMarkup(){
        return this.getSellPrice() - this.getBuyPrice() ;
    }
}
