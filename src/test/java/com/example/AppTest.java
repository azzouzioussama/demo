
package com.example;
import com.shapes.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testHelloWorld() {
        Hello hello = new Hello("Hello World!");
        hello.printMessage();
        assertEquals("Hello World!", hello.getMessage());
    }

    @Test
    public void testSetterMethod() {
        Hello hello = new Hello("Hello World!");
        hello.setMessage("Welcome to java!! from setter method");
        assertEquals("Welcome to java!! from setter method", hello.getMessage());
    }

    @Test
    public void testRectangle() {
        Rectangle rectangle = new Rectangle(10, 20);
        assertEquals(200, rectangle.getArea(),0.0);
        assertEquals(60, rectangle.getPerimeter(),0.0);
    }

    @Test
    public void testCircle() {
        Circle circle = new Circle(10);
        assertEquals(314, circle.getArea(),1.0);
        assertEquals(62, circle.getCircumference(),1.0);
    }
}