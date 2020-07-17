package day27_DateTime;
/*
 write a method that can print out the unique elements from an int array
					Ex: {1,1,2,3,3} ==> 2
						{6,6,7,7,8,9} ==> 8 9
		4. write a method that can print out the unique elements from a double array
					Note: Apply method overloading
 */
public class Unique_Arrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2,4,5};
       uniqueElements(arr);
       double[] arr1= {1.1,1.2,0.3,0.3,1.1};
       uniqueElements(arr1);

    }
    public static void uniqueElements(int[]arr){
        for (int each2 : arr){
            int count = 0;
            for (int  each : arr){
                if (each==each2){
                    count++;
                }
            }
            if (count==1){
                System.out.println(each2);
            }
        }
    }
    public static void uniqueElements(double[]arr){
        for (double each2 : arr){
            int count = 0;
            for (double  each : arr){
                if (each==each2){
                    count++;
                }
            }
            if (count==1){
                System.out.println(each2);
            }
        }
    }

}
