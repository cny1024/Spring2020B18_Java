package day22_Arrays_Loops;
/*
write a program that can count the even and odd number from an array of integers
                        MUST use for each loop
 */
public class Count_odd_even {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int countOdd = 0;
        int countEven = 0;

        for (int each: arr){
            if (each%2==0){
                countEven++;
            }else {
                countOdd++;
            }
        }
        System.out.println(countEven);
        System.out.println(countOdd);
    }
}
