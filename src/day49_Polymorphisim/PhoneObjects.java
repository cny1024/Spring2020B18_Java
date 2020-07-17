package day49_Polymorphisim;

public class PhoneObjects {

    public static void main(String[] args) {

        iPhone phone1 = new iPhone( "XI", 700, "7 inches" );
        phone1.calling(123456);
        phone1.faceTiming(123456);
        phone1.selfie();
        phone1.download();
        System.out.println(phone1);
    }

}
