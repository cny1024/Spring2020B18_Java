package day21_MultiDimensionalArrays;

public class AvarageNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int length = arr.length;
        int sum = 0;

        for(int i = 0;i<length;i++){
            sum += arr[i];
        }
        System.out.println(sum/length);
    }
}
