package day42_Inheritance.Task02;

public class DeviceObjects {

    public static void main(String[] args) {
        TV tv1 = new TV("Samsung","E250", 500, "40 inches" );
        tv1.country = "USA";
        System.out.println( tv1 );
        tv1.wacth();

        Phone phone1 = new Phone("Iphone", "11", 1000, "large");


        System.out.println(phone1);
        phone1.call(1234);
        phone1.text(1234);



    }

}
