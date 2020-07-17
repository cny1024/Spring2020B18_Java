package day27_DateTime;

public class Find_Minimum {
    public static void main(String[] args) {

        int [] arr = {5,4,7,5};
        int minNum = minimum(arr);
        System.out.println(minNum);

        double[] arr2={10.0,2.5,1.1};
        double minNum2 = minimum(arr2);
        System.out.println(minNum2);
    }

    public static int minimum(int[] arr){
        int minimum = arr[0];
        for (int each : arr){
            if (each<minimum){
                minimum=each;
            }
        }
        return minimum;
    }

    public static double minimum(double[] arr){
        double minimum = arr[0];
        for (double each : arr){
            if (each<minimum){
                minimum=each;
            }
        }
        return minimum;
    }
}
