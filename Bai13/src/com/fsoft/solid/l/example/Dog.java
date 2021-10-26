package com.fsoft.solid.l.example;

//class Cat và Dog extend từ class animal
public class Dog extends Animal {
 @Override
 public void makeNoise() {
     System.out.println("gâu gâu");
 }
}

// Liskov’s Substitution Principle
// Trong một chương trình, các object của class con có thể thay thế class cha mà 
// không làm thay đổi tính đúng đắn của chương trình