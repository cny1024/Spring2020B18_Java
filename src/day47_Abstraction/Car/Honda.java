package day47_Abstraction.Car;

public class Honda extends  Car{


    @Override
    public void start() {
        System.out.println("use key to start the car");
    }

    @Override
    public void Break() {
        System.out.println("push the break pedal");

    }
}
