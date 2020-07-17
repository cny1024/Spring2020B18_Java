package day43_MethodOverriding;

public class CarShop {

    public static void main(String[] args) {

        Tesla tesla = new Tesla();
        tesla.start(); // push the button
        System.out.println("----------------------------------");
        Honda honda = new Honda();
        honda.start(); // anahtari tak kontagi cevir
        System.out.println("<><><><><><><><><><><><><><><><><><>");
        Jeep jeep = new Jeep();
        jeep.start();
    }
}
