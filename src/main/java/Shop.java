import Instruments.Instrument;
import Interfaces.ISell;

import java.util.ArrayList;

public class Shop implements ISell {

    private ArrayList<ISell> stock;
    private String name;

    public Shop(String name, ArrayList stock){
        this.name = name;
        this.stock = stock;
    }

    public ArrayList<ISell> getStock() {
        return this.stock;
    }

    public String getName() {
        return this.name;
    }

    public int calculateMarkup(int buyPrice, int sellPrice){
        return buyPrice - sellPrice;
    }

    public void addStock(ISell stockItem){
        stock.add(stockItem);
    }

    public void sellStockByName(Instrument instrument){
        if (this.stock.contains(instrument)){
                this.stock.remove(instrument);
        }
    }
}
