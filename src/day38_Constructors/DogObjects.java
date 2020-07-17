package day38_Constructors;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        System.out.println(dog1.name);//unknown
        System.out.println(dog1.breed);//unknown
        System.out.println(dog1.age);//0

        Dog dog2 =new Dog("Husky");
        System.out.println(dog2.name);//unknown
        System.out.println(dog2.breed);//husky
        System.out.println(dog2.age);//0

        Dog dog3 = new Dog("Golden", 3);
        System.out.println(dog3.breed);
        System.out.println(dog3.age);
        System.out.println(dog3.name);
    }
}
