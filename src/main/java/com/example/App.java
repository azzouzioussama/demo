package com.example;
import com.shapes.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {


        Hello hello = new Hello("Hello World!");
        hello.printMessage();

        hello.setMessage("Welcome to java!! from setter method");
        hello.printMessage();

        // Rectangle length = 10, width = 20
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("Area of rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());

        // Circle radius = 10
        Circle circle = new Circle(10);
        System.out.println("Area of circle: " + circle.getArea());
        System.out.println("Circumference of circle: " + circle.getCircumference());

    }
}
