package day38_Constructors;

public class EmployeeSalary {

    public static void main(String[] args) {

        SalaryCalculator zareen = new SalaryCalculator(50,40,0.0825, 0.2);

        SalaryCalculator namik = new SalaryCalculator(62,40,0.0875,0.26);


        System.out.println(zareen.salary());
        System.out.println(zareen.salaryAfterTax());
        System.out.println(zareen);

        System.out.println(namik);

    }
}
