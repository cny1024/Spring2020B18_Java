package day26_MethodOverloading;

public class MethodOverloading3 {
    public static void main(String[] args) {
        sum(10,20);
        sum(3.5,1.5);
        int result = sum(10,20,70);
        System.out.println(result);
    }
    public static void sum(int a,int b){
        System.out.println(a+b);

    }
    public static void sum(double a,double b){
        System.out.println(a+b);

    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
}
