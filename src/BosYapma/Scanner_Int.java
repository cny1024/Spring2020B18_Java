import  java.util.Scanner;

public class Scanner_Int {
    public static void main(String[] args) {
        Scanner human = new Scanner(System.in);
        int  girls, boys, people;
        System.out.println("How many girls are in the party?");
        girls = human.nextInt();
        System.out.println("How many boys are in the party?");
        boys = human.nextInt();
        people = girls + boys;


        System.out.println("There are "+ people + " people inside of the party.");


    }


}
