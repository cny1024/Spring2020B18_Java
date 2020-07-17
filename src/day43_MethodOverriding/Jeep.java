package day43_MethodOverriding;

public class Jeep extends Car {
@Override
    public void start(){
        System.out.println("call mechanic");
        System.out.println("call friend");
    }

}
