package com.fsoft.interfaceexample;


 
public class Rectangle2 implements Shape, Color {
 
    @Override
    public void draw() {
        System.out.println("Draw " + this.getColor() + " rectangle");
    }
 
    @Override
    public String getColor() {
        return "red";
    }
     
}

// Lớp cài đặt Rectangle2 (implements) nhiều interface:
// một lớp chỉ được thừa kế (extends) từ một lớp, có thể cài đặt (implements) nhiều interface. 
// Tuy nhiên, một interface có thể thừa kế (extends) nhiều interface.
// Một interface không thể cài đặt (implements) interface khác, do interface không có phần cài đặt, chỉ chứa các khai báo.

