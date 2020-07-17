package Replits;

public class StoreProduct {
    String label;
    int price;
    String category;
    boolean hasExpiration;
    int stock;


    public StoreProduct(String label, int price, String category, boolean hasExpiration) {
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.label = label;
        this.price = price;
        stock = 0;
    }

    public StoreProduct(String label, int price) {
        category = "misc";
        hasExpiration = false;
        this.label = label;
        this.price = price;
        stock = 0;
    }

    public StoreProduct(String label, int price, int stock) {
        category = "misc";
        hasExpiration = false;
        this.label = label;
        this.price = price;
        this.stock = stock;
    }

    public StoreProduct(String label, int price, String category, boolean hasExpiration, int stock) {
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.label = label;
        this.price = price;
        this.stock = stock;
    }

    public void expired(boolean hasExpired) {
        if (hasExpired) {
            stock = 0;
        }
    }

    public boolean sale(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            return true;
        } else {
            return false;
        }
    }

    public double getDiscountedPrice(double discount) {
        double dis = price * (1 - discount);
        return dis;
    }
}