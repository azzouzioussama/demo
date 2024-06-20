package com.example;


import com.shapes.*;

public class App_refactored {
    public static void main(String[] args) {
        printHelloMessage("Hello World!");
        printHelloMessage("Welcome to Java!!");

        Rectangle rectangle = new Rectangle(10, 20);
        printShapeDetails(rectangle);

        Circle circle = new Circle(10);
        printShapeDetails(circle);
    }

    private static void printHelloMessage(String message) {
        Hello hello = new Hello(message);
        hello.printMessage();
    }

    private static void printShapeDetails(Shape shape) {
        System.out.println("Area of " + shape.getName() + ": " + shape.getArea());
        System.out.println("Perimeter/Circumference of " + shape.getName() + ": " + shape.getPerimeterOrCircumference());
    }
} 
