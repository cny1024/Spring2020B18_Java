package day26_MethodOverloading;

public class MethodOverloading2 {
    /*
    1. print sum of two num.
    2.print sum of three num.
    3.print sum of for num.
     */
    public static void main(String[] args) {
        int result1 = sum(10,20);
        System.out.println(result1);
        int result2 = sum(10,20,30);
        System.out.println(result2);
        int result3 = sum(10,20,30,40);
        System.out.println(result3);

    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }


}
