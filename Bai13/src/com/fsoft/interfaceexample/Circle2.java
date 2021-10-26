package com.fsoft.interfaceexample;

public class Circle2 implements ShapeColor {
 
	@Override
    public void draw() {
        System.out.println("Draw " + this.getColor() + " circle");
    }
 
    @Override
    public String getColor() {
        return "red";
    }
     
}

//  interface Circle2 kế thừa (extend) nhiều interface:
