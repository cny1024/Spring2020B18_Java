package day10_Siwtch_Scanner;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the code:");
        byte num1 = input.nextByte();
        if (num1==123){
            System.out.println("access granted");
        }else{
            System.out.println("wrong password");
        }

    }
}

