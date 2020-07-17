package day02_Variables;

public class VariablesPractice {
    public static void main(String[] args) {
        int salary =  7000;
        double federalTax = 0.18;
        double stateTax = 0.065;
        double sumTaxes = federalTax + stateTax;

        double salaryAfterTax = salary * (1 - sumTaxes);
        System.out.println(salaryAfterTax);
        System.out.println("================");

        int kg = 78;
        double pound = kg * 2.25;
        System.out.println(pound);
        System.out.println("=============");

        double dollar = 168;
        double TL = dollar * 6.15;
        System.out.println(TL);
        System.out.println("=*=*=*=*=*=*=");

        double gallon = 12;
        double liter = gallon * 3.7;
        System.out.println(liter);




    }
}
