package day25_MethodsRecap;

public class return_methods {
    public static void main(String[] args) {
        System.out.println(maxNumber(10,9));

    }
    public static int maxNumber(int a,int b){
        if (a>=b){
            return a;
        }
        return b;
    }
}
