package Items;

public class SheetMusic extends StockItems {

    private String instument;
    private String title;
    private String artist;

    public SheetMusic(int buyPrice, int sellPrice, String brand, String instument, String title, String artist) {
        super(buyPrice, sellPrice, brand);
        this.instument = instument;
        this.title = title;
        this.artist = artist;
    }

    public String getInstument() {
        return this.instument;
    }

    public String getTitle() {
        return this.title;
    }

    public String getArtist() {
        return this.artist;
    }
}
