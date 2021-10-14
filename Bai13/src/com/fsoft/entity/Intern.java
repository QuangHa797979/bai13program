package com.fsoft.entity;
/*
 * Purpose: Manage teachers - subclass
 * Author: Vu The Quan
 * Date: 11/07/2020
 */

import java.util.Scanner;

public class Intern extends Employee {
	// 1. Fields
	private String majors;
	private String semester;
	private String universityName;
	
	// 2. Getters, setters
	public String getMajors() {
		return majors;
	}

	public void setMajors(String majors) {
		this.majors = majors;
	}


	public String getSemester() {
		return semester;
	}


	public void setSemester(String semester) {
		this.semester = semester;
	}
	
	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	// 3. Constructors
	public Intern() {
		this.majors = "";
		this.semester = "";
		this.universityName = "";
	}

	public Intern(int id, String fullName, String birthDay, String phone, String email, String employeeType, String employeeCount, String majors, String semester, String universityName) {
		super(id, fullName, birthDay, phone, email, employeeType, employeeCount);
		this.majors = majors;
		this.semester = semester;
		this.universityName = universityName;
	}


	public String showMe() {
		return super.showInfo() + "\t Chuyên ngành: " + this.majors + "\t Học kì: " + this.semester + "\t Trường đại học: " + this.universityName + super.showCertificate();
	}
	
	// Class Intern kế thừa các thuộc tính từ class Employee
	// CLass Intern sẽ tự thêm các thuộc tính như majors, semester, universityName mà không cập nhập đến phương thức cha (Empoloyee),
	// điều này thể hiện tính trừu tượng (Abstraction)
	// Mỗi nhân viên loại Intern sẽ có các id, fullName, birthDay, phone, email khác nhau, điều này thể hiện tính đa hình (Polymorphism) trong java
}
