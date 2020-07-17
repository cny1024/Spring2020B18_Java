package day05_Unary_ShorthandOperators;

public class Divisibility {
    public static void main(String[] args) {

        int number = 423432450;

        boolean divisibilityBy2 = number % 2 == 0;
        boolean divisibilityBy3 = number % 3 == 0;
        boolean divisibilityBy5 = number % 5 == 0;

        System.out.println( number + " is divisible by 2 : " + divisibilityBy2);
        System.out.println( number + " is divisible by 3 : " + divisibilityBy3);
        System.out.println( number + " is divisible by 5 : " + divisibilityBy5);

        System.out.println("===================================================");

        String result1 = number + " is divisible by 2 : " + divisibilityBy2;
        String result2 = number + " is divisible by 3 : " + divisibilityBy3;
        String result3 = number + " is divisible by 5 : " + divisibilityBy5;
        String finalResult = result1 + "\n" + result2 + "\n" + result3;

        System.out.println(finalResult);


    }
}
