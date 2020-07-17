package day18_NestedLoop;

public class NestedLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int a = 1; a <= 5; a++) {
                System.out.print(a);
            }
            System.out.println();
        }


        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        for (int i = 1; i <= 3; i++) {
            int a = 1;
            while (a <= 3) {
                System.out.print("* ");
                a++;
            }
            System.out.println();
        }
    }
}