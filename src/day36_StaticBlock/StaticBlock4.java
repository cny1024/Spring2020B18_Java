package day36_StaticBlock;

import day34_CustomClass.Tester;

public class StaticBlock4 {
    static String name = "Cybertek School";
    static Tester tester1 = new Tester();
    //tester1.setInfo("Muhtar",123,"SDET",120000);

    static {
        name  =  "Cybertek School" ;
        tester1.setTesterInfo("Muhtar",123,"SDET",120000);
    }

    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(tester1);
    }



}
