package day18_NestedLoop;

import java.util.Scanner;

public class ASSIGNMENT {
    /*
    Write a program for the room reservation

   king bed ==>120$
   Queen bed ==>100$
   single bed ==>80$

   should ask which bed do you want to reserve.
   if user provides invalid entry ==> please re=enter.
   calculate the total price
   do you want to reserve another room.
   if yes==>repeat the previous steps.
   if no==> your total price is===> x$
   if answer either yes or no ==> please re-enter


   &&&&&&&&&&&&&&&&&&&&&&&&&&


   finding the frequency of charecters
   "AAABBBCCC" ==A3B3C3

     */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int totalPrice = 0;
        while (true) {
            System.out.println("Which room, would you like to reserve?");
            System.out.println("King Bed, Queen Bed, Single Bed");
            String str = scan.nextLine();
            while (!(str.equalsIgnoreCase("King Bed") || str.equalsIgnoreCase("Queen Bed") || str.equalsIgnoreCase("Single Bed"))) {
                System.out.println("Invalid entry, please select room type.");
                str = scan.nextLine();
            }
            if (str.equalsIgnoreCase("King Bed")) {
                totalPrice += 120;
            } else if (str.equalsIgnoreCase("Queen Bed")) {
                totalPrice += 100;
            } else if (str.equalsIgnoreCase("Single Bed")) {
                totalPrice += 80;
            }
            System.out.println("Thanks for your choice, Would like to reserve another room? ");
            str = scan.nextLine();
            while (!(str.equalsIgnoreCase("YES") || str.equalsIgnoreCase("NO"))) {
                System.out.println("yes mi no mu aq");
                str = scan.nextLine();
            }
            if (str.equalsIgnoreCase("NO")) {
                System.out.println("Thank you, you are redirecting to payment page... ");
                System.out.println("Your total price is " + totalPrice + "$");
                break;
            }
        }
    }
}