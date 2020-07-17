package Replits;

public class Stock {

    public String tickerSymbol;
    public String companyName;
    public int price;
    public double percentChange;
    public int totalShares;
    public long marketCap;

    public Stock(String tickerSymbol, String companyName, int price, int totalShares){
        this.tickerSymbol=tickerSymbol.toUpperCase();
        this.companyName=companyName;
        this.price=price;
        this.totalShares=totalShares;
    }
    public long marketCap(int price,int totalShares) {
        marketCap = totalShares * price;
        return marketCap;
    }

    public void adjustPrice(int value) {
        int temp = price;
        price = price + (value);
        percentChange = ((double) (price - temp)) / temp;
        marketCap = totalShares * price;
    }
    public String toString(){
        return "Ticker Symbol: "+ tickerSymbol+
                "\nCompany: "+companyName+
                "\nCurrent Price: $"+price + " "+percentChange+
                "\nMarket Cap: $"+marketCap;
    }
}