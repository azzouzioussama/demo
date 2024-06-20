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

/*
 * The App_refactored class is refactored to use the Shape interface. 
 * The printHelloMessage() and printShapeDetails() methods are added to the App_refactored class to reduce code duplication. 
 * The printHelloMessage() method creates a Hello object and prints the message. 
 * The printShapeDetails() method takes a Shape object as a parameter and prints the area and perimeter/circumference of the shape.
 * 
 * This changes has been made to the App class to use the Shape interface and reduce code duplication, 
 * and this was achieved by utilizing The Asssistant chatbot ''Refactor Code (React JS/ React Native/ Python/ Android/ Java/ Swift)''.
 * 
 * Here is the explanation of the changes made:
 *  1. Extracted the `printHelloMessage` method to separate the logic of printing a hello message from the main method.
    2. Extracted the `printShapeDetails` method to separate the logic of printing shape details from the main method.
    3. Used more descriptive variable names, such as `message` and `shape`.
    4. Followed Java naming conventions for method names.
    5. Removed duplicated code by using a single `printShapeDetails` method for both rectangle and circle.
 * 
 */