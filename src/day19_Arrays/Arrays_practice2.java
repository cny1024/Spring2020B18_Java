package day19_Arrays;

import java.util.Scanner;

public class Arrays_practice2 {
    public static void main(String[] args) {
        int arr[]={10,20,30};

        System.out.println(arr.length);

        System.out.println("-=-=-=-=-=-=-=-=-=-");


        String testers[] = new String[3];//{"naci","burhan","akto"}
         //testers[0] = "naci";//null
         testers[1]="burhan";
         testers[2]="akto";
for (int i =0;i<=2;i++) {
    System.out.print(testers[i]+" ");
}
        System.out.println();
        System.out.println(testers.length);


        System.out.println("-=-=-=-=-=-=");

        Scanner scan = new Scanner(System.in);
        String[] students = new String[3];

        for (int i =0;i<=2;i++) {
            System.out.println("enter your name");
            String name = scan.next();
            students[i] = name;
        }

            System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);






    }
}
