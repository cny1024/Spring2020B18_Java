package MultipleClasses;
import java.util.Scanner;

public class xd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        za zaObject = new za();

        System.out.println("enter your name here : ");
        String name = input.nextLine();

        zaObject.simpleMessage(name);

    }
}
