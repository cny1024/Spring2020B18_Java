package day41_Inheritance.Task01;

public class EmployeeObjects {

    public static void main(String[] args) {

        Developer dev1 = new Developer("Naci",70000,1024,"SDET",'M');

        dev1.fixingBug();

        System.out.println(dev1);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        Tester tester1 = new Tester("Cihad",60000,2500,"QA",'M');

        tester1.testing();
        System.out.println(tester1);

        System.out.println(".=.=.=.=.=.==.=.=.=.=.=.=.=.=.==..==.");

        BusinessAnalyst ba1= new BusinessAnalyst("Yasin",120000,123456,"BA",'M');
        ba1.writingRequiremnts();
        System.out.println(ba1);



    }
}
