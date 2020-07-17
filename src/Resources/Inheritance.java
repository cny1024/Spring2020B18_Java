package Resources;

import day42_Inheritance.Data;
import day42_Inheritance.TestData;

public class Inheritance extends Data {
    //        sub class        super class
    public static void main(String[] args) {

        System.out.println( TestData.publicData );
        System.out.println( TestData.protectedData );
        //System.out.println( TestData.defaultData ); // only visible in same package
        // System.out.println( TestData.privateData ); // private can never be inherited

    }

}
