package day14_StringClass;

import java.util.Scanner;

public class combinewoString2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = input.next();  // Apple

        word1 =   word1.substring(1);  // pple

        System.out.println("Enter second word");
        String word2 = input.next();  //Banana
        word2  =   word2.substring(1);  // anana

        String result = word1+word2;

        System.out.println(result);
    }
}
