package day54_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Intro {

    public static void main(String[] args) {

        Map<String, Double> employeeInfo = new LinkedHashMap<>();
        employeeInfo.put("Naci", 120000.0);
        employeeInfo.put("Cihad", 115000.0);

        System.out.println(employeeInfo);//{Naci=120000.0, Cihad=115000.0}
        System.out.println(employeeInfo.size());//2

        System.out.println(employeeInfo.get("Naci"));//120000.0
        System.out.println(employeeInfo.get("Cihad"));//115000.0

        employeeInfo.remove("Cihad");

        System.out.println(employeeInfo);//{Naci=120000.0}
        System.out.println(employeeInfo.size());//1

        employeeInfo.put("Naci", 130000.0);
        System.out.println(employeeInfo);//{Naci=130000.0}


    }
}
