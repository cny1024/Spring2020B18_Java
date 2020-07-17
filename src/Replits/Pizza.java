package Replits;

public class Pizza {

    private String size;
    private int numOfCheese;
    private int numOfPep;
    private int numOfHam;

    public Pizza(String size, int numOfCheese, int numOfPep, int numOfHam) {
        this.size = size;
        this.numOfCheese = numOfCheese;
        this.numOfPep = numOfPep;
        this.numOfHam = numOfHam;
    }

    public double calcCost() {
        double total = 0;
        if (size.equalsIgnoreCase("small")) {
            total += 10 + 2 * (numOfCheese + numOfPep + numOfHam);
        } else if (size.equalsIgnoreCase("medium")) {
            total += 12 + 2 * (numOfCheese + numOfPep + numOfHam);
        } else {
            total += 14 + 2 * (numOfCheese + numOfPep + numOfHam);
        }
        return total;
    }

    public String getDescription() {
        return size + " Pizza with " + numOfCheese + " Cheese toppings, " + numOfPep +
                " Pepperoni toppings, and " + numOfHam + " Ham toppings.\nTotal Price: " + calcCost();
    }


}
