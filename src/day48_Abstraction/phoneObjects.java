package day48_Abstraction;

public class phoneObjects {

    public static void main(String[] args) {
        iPhone iphone1 = new iPhone("X", 1000, "10 inches");
        iPhone iphone2 = new iPhone("8", 900, "8 inches");

        System.out.println(iphone1);
        System.out.println(iphone2);

        iphone1.faceTiming(123456);
        iphone1.calling(911);
        iphone1.texting(987456);

        System.out.println("===============================");

        Samsung samsung = new Samsung("e250",1, "5 inches");

        System.out.println(samsung);
        samsung.calling(123456);
        samsung.texting(123456);
        samsung.freezing();


    }

}
