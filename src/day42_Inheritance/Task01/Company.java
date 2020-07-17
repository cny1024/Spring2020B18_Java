package day42_Inheritance.Task01;
/*
create a class called company:
					create 3 objects of employee and set thier info
					create an array of employees and store all those employee objects
					use regular for loop to print out each employee' name and employeeID
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Company {

    public static Employee employee1;
    public static Employee employee2;


    static {
        employee1 = new Employee();
        employee1.setEmployeeInfo("naci",25,'m',60000,1024,"QA");

        employee2= new Employee();
        employee2.setEmployeeInfo("minnos",8,'f',0,1,"kedi");
    }

    public static void main(String[] args) {



        ArrayList<Employee> empList = new ArrayList<>(Arrays.asList(employee1, employee2));
        for (Employee each : empList ){
            System.out.println(each.name+" "+each.employeeID);
        }

    }
}
