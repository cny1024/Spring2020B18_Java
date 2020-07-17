package day07_IfStatements;
/*
write a java program that accepts three numbers and return the maximum number
				(assume that none of them are equal)
 */
public class MaxNumber {
    public static void main(String[] args) {

        double a = 200;
        double b = 200;
        double c = 200;

        if (a > b && a > c) {
            System.out.println("a is the greatest number");
        } else if (b > a && b > c) {
            System.out.println("b is the greatest number");
        }else if (c > a && c > b) {
            System.out.println("c is the greatest number");
        }else if (a ==b && a > c){
            System.out.println("a and b are the greatest number");
        }else if (a==c && a>b){
            System.out.println("a and c are the greatest numbers");
        }else if (b==c && b > a){
            System.out.println("b and c are the greatest numbers");
        }else
            System.out.println("numbers are equal");
    }
}