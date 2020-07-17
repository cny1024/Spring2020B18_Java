package day40_Encapsulation;

public class Test {
    public static void main(String[] args) {

        Encapsualtion obj = new Encapsualtion();
        System.out.println( obj.getSSN() );//0

        obj.setSSN(1234567);

        System.out.println( obj.getSSN() );//1234567
    }
}
