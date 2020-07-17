package day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

    public static void main(String[] args) {

    Item item1 = new Item("Orange Juice", 3.5,1);
    Item item2 = new Item("Lahmacun", 5.5, 3);
    Item item3 = new Item("Banana", 1.1,7);
    Item item4 = new Item("Simit", 0.5,5);

        ArrayList<Item> shoppingList = new ArrayList<>();
        shoppingList.addAll(Arrays.asList(item1, item2, item3, item4));

        double totalCost = 0 ;

        for ( Item each : shoppingList){
            totalCost += each.calcCost();
        }
        System.out.println("Total: "+totalCost );


    }
}
