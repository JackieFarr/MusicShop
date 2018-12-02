import Instruments.Instrument;
import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;
    private String name;

    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public ArrayList<ISell> getStock() {
        return this.stock;
    }

    public String getName() {
        return this.name;
    }


    public void addStock(ISell stockItem){
        stock.add(stockItem);
    }

    public void sellStockByName(Instrument instrument){
        if (this.stock.contains(instrument)){
                this.stock.remove(instrument);
        }
    }

    public int calculateShopProfit(){
        int total = 0;
            for (ISell item : this.stock) {
            total += item.calculateMarkup();
            }
        return total;
    }

    // for each instrument in the shop
        // calculate the markup
        // add it to the total
        // return the total
}
