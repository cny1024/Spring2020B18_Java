package day35_Static;

public class Dog {

    //static String breed; ---> poddle, poddle
    String breed; // ----> husky,poddle
    static boolean isPet;

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.breed = "Husky";
        dog1.isPet = true;

        Dog dog2 = new Dog();
        dog2.breed = "Poddle";

        System.out.println(dog1.breed); //husky
        System.out.println(dog2.breed); // poddle

        System.out.println(dog1.isPet);// true
        System.out.println(dog2.isPet);// true

    }

}
