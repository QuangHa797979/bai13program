package com.fsoft.interfaceexample;

public class ShapeApp {
    public static void main(String[] args) {
        Shape rect = new Rectangle();
        rect.draw();
        System.out.println("---");
        Shape circle = new Circle();
        circle.draw();      
    }
}