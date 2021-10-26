package com.fsoft.solid.l.example;

//class Cat và Dog extend từ class animal
public class Cat extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("meow meow");
    }
}