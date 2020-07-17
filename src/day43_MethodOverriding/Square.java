package day43_MethodOverriding;

import javax.print.attribute.standard.Sides;

public class Square extends Shape {

    public double side;

    public Square(double side) {
        this.side = side;
    }
    @Override
    public void calculateArea() {
        area = side*side;
        System.out.println("Area of the square: " + area);
    }

    public void calculatePerimeter() {
        perimeter = 2* side;
        System.out.println("Perimeter of the square: " + perimeter);
    }

}
