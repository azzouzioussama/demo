package com.shapes;

public class Rectangle implements Shape{
    private double length = 0;
    private double width = 0;
    private String name = "Rectangle";
    
    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Double getArea() {
        return length * width;
    }

    public Double getPerimeter() {
        return 2 * (length + width);
    }

    // setters and getters
    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        System.out.println(name);
        return name;
    }

    @Override
    public Double getPerimeterOrCircumference() {
        // TODO Auto-generated method stub
        return 2 * (length + width);
    }

}
