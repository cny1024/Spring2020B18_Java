package day09_NestedIf_Ternary;

public class Ternary {
    public static void main(String[] args) {
        int num = 100;
        String result = "";

        if(num%2 == 0){
            result = "even";
        }else {
            result = "odd";
        }

        String result2 = (num%2 == 0) ? "even" : "odd";
        System.out.println(result);
        System.out.println(result2);

        System.out.println("=_=_=_=_=_=_=_=");

        int num1 = 100;
        int num2 = 200;
        int max = 0;

        if(num1>num2){
            max=num1;
        }else{
            max=num2;
        }
        int max2 = (num1> num2) ? num1 : num2;
        System.out.println(max);
        System.out.println(max2);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");

        int age =20;
        boolean eligibility = (age>=21) ? true : false;
        System.out.println(eligibility);
        System.out.println("=-=-=-=-=-=-=-=-=-=");







    }
}
