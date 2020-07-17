package Resources;

import day40_Encapsulation.Encapsualtion;

public class Encapsulation_Test {
    public static void main(String[] args) {

        Encapsualtion obj = new Encapsualtion();
        //System.out.println(obj.SSN);

        obj.getSSN();//0
        obj.setSSN(1234567);
        System.out.println(obj.getSSN());//1234567



    }
}
