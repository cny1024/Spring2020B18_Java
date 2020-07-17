package day21_MultiDimensionalArrays;

import java.text.DecimalFormat;

public class Formatting_Decimals {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        double a = 10.0/3.0;
        System.out.println(df.format(a));

        System.out.println(2.54653);
        System.out.println(df.format(2.54653));


    }
}
