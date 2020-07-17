package day10_Siwtch_Scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter first byte number:");
        byte num1 = input.nextByte();
        System.out.println("enter second byte number:");
        byte num2 = input.nextByte();
        System.out.println("total is: " + "\n" +(num1 + num2));
    }

}
