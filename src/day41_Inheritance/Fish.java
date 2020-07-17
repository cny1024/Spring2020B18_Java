package day41_Inheritance;

public class Fish extends Animal {

    public void swim(){
        System.out.println(name +" is swimming");
    }

    public static void main(String[] args) {
        Fish obj1 = new Fish();
        obj1.name = "Lale";
        obj1.size= "small";
        obj1.weight = 2;

        System.out.println(obj1);
        obj1.move();
        obj1.eat();
        obj1.swim();
    }


}
