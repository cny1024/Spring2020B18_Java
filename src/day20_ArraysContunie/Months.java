package day20_ArraysContunie;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        int[] n = new int[3];
        n[0] = 0;
        n[1] =1 ;
        n[2] =2;
        //     n[3] = 3;


        String[] months ={"Jan" , "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct","Nov", "Dec"}; // size: 12,  : 11
        //          0       1      2
        /*
        String[] months2 = new String[12];
                months2[0] = "Jan";
               ...
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt(); // 18
        int attempts = 1;

        while(num > 12 || num < 1){
            System.out.println("Invalid Entry");
            System.out.println("Please re-enter the number");
            num = input.nextInt();//12
            attempts ++;
            if (attempts==3 &&(num > 12 || num < 1)){
                System.out.println("Invalid entry third time");
                System.exit(0);

            }
        }

        String result =  months[num-1];

        System.out.println(result);


    }
}
