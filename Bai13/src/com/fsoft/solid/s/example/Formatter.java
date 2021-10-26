package com.fsoft.solid.s.example;

public class Formatter {
	// Class này chỉ format thông tin hiển thị student
	  public String FormatStudentText(Student std) {
	    return "Name: " + std.Name + ". Age: " + std.Age;
	  }

	  public String FormatStudentHtml(Student std) {
	    return "<span>" + std.Name + " " + std.Age + "</span>";
	  }
	  
}