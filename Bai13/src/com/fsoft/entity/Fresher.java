package com.fsoft.entity;
/*
 * Purpose: Manage teachers - subclass
 * Author: Vu The Quan
 * Date: 11/07/2020
 */

import java.util.Scanner;

public class Fresher extends Employee {
	// 1. Fields
	private String graduationDate;
	private String graduationRank;
	private String education;
	
	// 2. Getters, setters

	public String getGraduationDate() {
		return graduationDate;
	}


	public void setGraduationDate(String graduationDate) {
		this.graduationDate = graduationDate;
	}


	public String getGraduationRank() {
		return graduationRank;
	}


	public void setGraduationRank(String graduationRank) {
		this.graduationRank = graduationRank;
	}
	

	public String getEducation() {
		return education;
	}


	public void setEducation(String education) {
		this.education = education;
	}

	// 3. Constructors
	public Fresher() {
		super();
		this.graduationDate = "";
		this.graduationRank = "";
		this.education = "";
	}

	public Fresher(int id, String fullName, String birthDay, String phone, String email, String employeeType, String employeeCount, String graduationDate, String graduationRank, String education) {
		super(id, fullName, birthDay, phone, email, employeeType, employeeCount);
		this.graduationDate = graduationDate;
		this.graduationRank = graduationRank;
		this.education = education;
	}

	public String showMe() {
		 return super.showInfo() + "\t Ngày tốt nghiệp: " + this.graduationDate + "\t Hạng tốt nghiệp: " + this.graduationRank + "\t Bậc giáo dục: " + this.education + super.showCertificate();
	}
	
	// Class Fresher kế thừa các thuộc tính từ class Employee
	// CLass Fresher sẽ tự thêm các thuộc tính như graduationDate, graduationRank, education mà không cập nhập đến phương thức cha (Empoloyee),
	// điều này thể hiện tính trừu tượng (Abstraction)
	// Mỗi nhân viên loại Fresher sẽ có các id, fullName, birthDay, phone, email khác nhau, điều này thể hiện tính đa hình (Polymorphism) trong java
}
