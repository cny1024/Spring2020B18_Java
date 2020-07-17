package day18_NestedLoop;

public class NestedLoop2 {
    public static void main(String[] args) {
        /*for (int i = 9; i >= 1; i--) {
            int a = 1;
            while (a <= i)  {
                System.out.print("* ");
                a++;
            }
            System.out.println();

         */
        for (int j = 1; j <= 9; j++) {

            for (int i = 1; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();


        }
        System.out.println("-=-=-=-=");

        for (int j = 9; j >= 1; j--) {

            for (int i = 1; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        for(char z = 'a'; z <= 'z'; z++){

            for(char ch ='a'; ch <= z ; ch++ ){  //  'a' >= 'a'
                System.out.print(ch+" ");
            }
            System.out.println();


        }

        System.out.println("=======================================");

        for(char z = 'z'; z >= 'a'; z--){

            for(char ch ='a'; ch <= z ; ch++ ){  //  'a' >= 'a'
                System.out.print(ch+" ");
            }
            System.out.println();


        }

    }
}