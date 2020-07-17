package day13_StringClass;

import java.util.Scanner;

/*
write me a program that asks the user first and last names, then prints the initials.
input: Cybertek
       School
output: CS
 */
public class assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your first name");
        String Fname = input.next();
        System.out.println("enter your last name");
        String  Lname = input.next();

        Fname= Fname.substring(0,1).toUpperCase();
        Lname= Lname.substring(0,1).toUpperCase();

        char ch1 = Fname.charAt(0);
        char ch2 = Lname.charAt(0);

        System.out.println(ch1+""+ch2);







    }

}
