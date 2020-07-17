package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_Next {
    public static void main(String[] args) {
       Scanner scan  = new Scanner(System.in);
        /*String str = scan.next();
        System.out.println(str); */
        String fullAddress = "";
        System.out.println("Enter the number of building:");
        short bNumber = scan.nextShort();
        fullAddress += bNumber+ " ";

        System.out.println("Enter the street name:");
        String streetName = scan.next();
        fullAddress += streetName+" ";

        System.out.println("Enter the type of the road:");
        String roadType = scan.next();
        fullAddress += roadType +", ";

        System.out.println("Enter city name, state and zip code:");
        String cityName = scan.next();
        fullAddress += cityName+" ";
        String stateName = scan.next();
        fullAddress += stateName+", ";
        int zipCode = scan. nextInt();
        fullAddress += zipCode;

        System.out.println(fullAddress);



    }
}
