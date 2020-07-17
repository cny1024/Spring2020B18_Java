package day10_Siwtch_Scanner;
/*
write a program that can display the days based on the numbers 1 ~ 7
			MUST USE NESTED IF(ben ternary yaptim)
 */
public class warmUp {

    public static void main(String[] args) {

        int num = 3;
        String day = "";

        day = (num==1)?"monday": (num==2) ? "tuesday" : (num==3)? "wednesday"  : (num==4)?"thursday" : (num==5)? "friday" : (num == 6)? "saturday" : (num==7)?"sunday":"invalid entry";

        System.out.println(day);

    }
}
