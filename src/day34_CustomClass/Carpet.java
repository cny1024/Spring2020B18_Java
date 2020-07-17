package day34_CustomClass;
/*
create a custom class for the carpet class that should contain the following:
				instance variables:
						width, length, unitPrice, isPersian (boolean)
				instance methods:
						customOrder(): sets the carpet' width, length, unitprice, & isParsian
						calcCost(): should be able to caculate the total cost of the carpet and return it as double
						toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
			total price of carpet= (width+length)*unitprice
			if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice
 */
public class Carpet {

    double width;
    double lenght;
    double unitPrice;
    boolean isPersian;


    public double calsCost(){

        double total = (width+lenght)*unitPrice;

        total = (isPersian==true)?total+200:total;

        return total;

    }

    public void customOrder(double carpetWidth, double carpetLenght, double carpetUnitPrice, boolean carpetPersian){

        width = carpetWidth;
        lenght = carpetLenght;
        unitPrice = carpetUnitPrice;
        isPersian = carpetPersian;
    }

    public String toString(){
        return "width: " + width+
                "\nlenght: " + lenght+
                "\nunit price: "+unitPrice+
                "\nTotal costs: "+calsCost();
    }

}
