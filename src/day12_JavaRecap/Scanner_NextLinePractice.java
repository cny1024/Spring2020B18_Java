package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fulladress;

        System.out.println("enter building number:");
        int bNum = input.nextInt(); // 380enter

        input.nextLine();

        System.out.println("Enter street name:");
        String streetName = input.nextLine();

        System.out.println("enter type of the road:");
        String road = input.nextLine();

        System.out.println("enter city name, state name and zip code");
        String cname = input.nextLine();
        String state = input.nextLine();
        int zipCode = input.nextInt();

        fulladress = bNum + " " + streetName + " "+ road +", "+ cname+", "+state+" "+zipCode;
        System.out.println(fulladress);

        input.close();




    }
}
