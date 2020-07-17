package day46_final_abstract;

public class final_Variables {

    final int instanceVariable = 300;
    //final int instanceVariable2;

    final static int staticVariable = 1000;

    final private int privateVariable = 100;

    final public int publicVariable = 1;


    public static void main(String[] args) {

        final double PI = 3.14;
        //PI=3.15;

        final String gender = "Male";
        //gender = "female";

        final_Variables obj1 = new final_Variables();
        //obj1.instanceVariable = "female";

    }
}
