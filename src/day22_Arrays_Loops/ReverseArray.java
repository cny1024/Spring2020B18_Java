package day22_Arrays_Loops;

import java.util.Arrays;

/*
 write a program that can reverse the array
 */
public class ReverseArray {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        for (int i = arr.length-1;i>=0;i--){
            int eachNum =arr[i];
            System.out.println(eachNum);
        }

        System.out.println("-=-=-=-=-=-=-=");

        int[] revArr = new int[arr.length];

        int i =arr.length-1;
        for (int j = 0; j<=arr.length-1;j++){
            revArr[j]=arr[i];
            i--;
            System.out.println(revArr[j]);
        }


    }
}
