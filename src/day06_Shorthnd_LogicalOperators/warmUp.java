package day06_Shorthnd_LogicalOperators;

public class warmUp {
    public static void main(String[] args) {
        double liter = 60;
        double gallon = liter / 3.7;
        String Result = liter + " liter equal to " + gallon + " gallon.";
        System.out.println(Result);

        System.out.println("=+=+=+=+=+=+=+=+");

        int a = 200;
        int b = -a++ + - --a * a-- % 2;
      //        -200  -  200 * 200 & 2
        //      -200  -    40000   % 2
        //       -200 - 0 = -200
        System.out.println(a);
        System.out.println(b);
    }
}
