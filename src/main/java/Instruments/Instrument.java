package Instruments;

import Interfaces.IPlay;

public abstract class Instrument implements IPlay {

    private String colour;
    private String type;
    private String material;
    private int sellPrice;
    private int buyPrice;
    private String sound;

    public Instrument(String colour, String type, String material, int sellPrice, int buyPrice, String sound){
        this.colour = colour;
        this.type = type;
        this.material = material;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
        this.sound = sound;
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

    public String play(String sound){
        return "I play this sound: " + this.sound;
    }
}
