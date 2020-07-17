package day07_IfStatements;

public class ValidTriangle {
    public static void main(String[] args) {

        short angle1 = 50;
        short angle2 = 50;
        short angle3 = 80;

        short sumOfAngles = (short) (angle1 + angle2 + angle3);

        boolean validTriangle = sumOfAngles == 180;

        if (validTriangle) {
            System.out.println("the shape is a triangle");
        }else
            System.out.println("the shape is not a triangle");


    }
}
