package com.fsoft.solid.l.example;

public class MuteCat extends Animal {
    @Override
    public void makeNoise() {
        throw new RuntimeException("I can't make noise");
    }
}

//  Ta có thể thay thể những chỗ đã sử dụng class Animal bằng class Dog hoặc Cat mà không làm chết chương trình. 
//  không nên thực thi đoạn code ở lớp con mà khi thay thế lớp cha sẽ làm chết chương trình