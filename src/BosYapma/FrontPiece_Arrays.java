package BosYapma;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FrontPiece_Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter size");
        int size = scan.nextInt();
        int[] num = new int[size];
        System.out.println("enter " +size + " numbers");
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        int[] num2 = new int[2];

        if (num.length<2){
            System.out.println(Arrays.toString(num));
        }else {
            for (int i = 0;i < 2;i++){
                num2[i]=num[i];
            }
            System.out.println(Arrays.toString(num2));
        }


    }
}
