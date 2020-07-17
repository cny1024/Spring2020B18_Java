package day26_MethodOverloading;

public class MethodOverloading {
    public static void main(String[] args) {
        method(10);
        method(10.0);
    }

    public static void method(int a) {
        System.out.println("original");
    }

    public static void method(double a) {
        System.out.println("overloaded");
    }
}
