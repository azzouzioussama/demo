package com.example;

public class Hello {
    // 
    private String message = "Hello World!";

    // creating a constructor
    public Hello(String message) {
        this.message = message;
    }

    // creating a method that returns the message
    public String getMessage() {
        return message;
    }

    // creating a method that prints the message
    public void printMessage() {
        System.out.println(message);
    }

    // creating a setter method
    public void setMessage(String message) {
        this.message = message;
    }
    
}
