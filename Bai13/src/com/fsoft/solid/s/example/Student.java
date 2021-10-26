package com.fsoft.solid.s.example;

public class Student {
// Student chỉ chứa thông tin
public String Name;
public int Age;

// Format class này dưới dạng text, html để in ra
public String GetStudentInfoText() {
  return "Name: " + Name + ". Age: " + Age;
}

public String GetStudentInfoHTML() {
  return "<span>" + Name + " " + Age + "</span>";
}
}


// Class Student có nhiều chức năng: chứa thông tin học sinh, 
// format hiển thị thông tin
// Một class chỉ nên giữ 1 trách nhiệm duy nhất 
// Single Responsibility Principle
// (Chỉ có thể sửa đổi class với 1 lý do duy nhất)