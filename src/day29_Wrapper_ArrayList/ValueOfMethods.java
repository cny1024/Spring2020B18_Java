package day29_Wrapper_ArrayList;

import java.util.Arrays;

public class ValueOfMethods {
    public static void main(String[] args) {
        String str = "123";

        Integer a = Integer.valueOf(str);

        System.out.println(a+1);

        double b = Integer.valueOf(str);
        System.out.println(b);

        String str2 = "15.5";
        double d1 = Double.parseDouble(str2);//double=double. neither auto or unboxing
        double d2 = Double.valueOf(str2);//double=Double. unboxing
        System.out.println(d1);//15.5
        System.out.println(d2);//15.5
        System.out.println(d1==d2);//true

        //-=-=-=-=-=-==-=--=-=-==--=-==-=-
        int z1 = 2000;
        //   Long L1 = z1; // does not accept any other primitives except for long

        Short sh1 = 3000;
        int z2 = sh1 ;
        //=-=-=-=-=-=-=-=-=-=-

        int maxNum=Integer.MAX_VALUE;
        System.out.println(maxNum);

        double maxNum1 = Double.MAX_VALUE;
        System.out.println(maxNum1);

        double minNum=Double.MIN_VALUE;
        System.out.println(minNum);

        byte maxNum3 = Byte.MAX_VALUE; // 127
        System.out.println(maxNum3);

        byte minNum2 = Byte.MIN_VALUE;   // -128
        System.out.println(minNum2);

        System.out.println("=================================");

        char[] arr = new char[3];
        System.out.println(Arrays.toString(arr) );

        Integer[] arr2 = new  Integer[3];
        System.out.println(Arrays.toString(arr2) );
    }
}
