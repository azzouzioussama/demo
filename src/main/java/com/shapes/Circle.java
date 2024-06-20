package com.shapes;

public class Circle implements Shape{
    private double radius = 0;
    private String name = "Circle";
    
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // setters and getters
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        System.out.println(name);
        return name;
    }


    @Override
    public Double getPerimeter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPerimeter'");
    }

    @Override
    public Double getPerimeterOrCircumference() {
        // TODO Auto-generated method stub
        return 2 * Math.PI * radius;
    }
    
}
