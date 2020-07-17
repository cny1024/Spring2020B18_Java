package day22_Arrays_Loops;

import java.util.Arrays;

/*
 write a program that sort the array in descending order
 */
public class Descending {
    public static void main(String[] args) {
        int[] arr = {10,78,2,-1,500,70};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] revarr = new int[arr.length];
        int j = arr.length-1;
        for (int i =0;i<=arr.length-1;i++){
            revarr[i] =arr[j];
            j--;

        }
        System.out.println(Arrays.toString(revarr));
    }
}
