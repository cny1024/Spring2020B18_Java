package day35_Static;

public class staticVariables2 {

    int insVariable;
    static int staticVariable;

    public static void main(String[] args) {

        staticVariables2 obj1 = new staticVariables2();
        obj1.insVariable= 300;
        obj1.staticVariable=400;

        staticVariables2 obj2 = new staticVariables2();

        System.out.println(obj1.insVariable);//300
        System.out.println(obj2.insVariable);//0

        System.out.println( obj1.staticVariable);//400
        System.out.println(obj2.staticVariable);//400

        System.out.println( staticVariables2.staticVariable);//static can be called through class name
        //System.out.println(staticVariable.insVariable); instance CAN NOT be called through the class name


    }

}
