package com.fsoft.entity;
/*
 * Purpose: Manage teachers - subclass
 * Author: Vu The Quan
 * Date: 11/07/2020
 */

import java.util.Scanner;

public class Experience extends Employee {
	// Experience is - a Employee
	// Experience là một trường hợp đặc biệt của Employee
	// 1. Fields
	private int expInYear;
	private String proSkill;

	// 2. Getters, setters
	public int getExpInYear() {
		return expInYear;
	}


	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}


	public String getProSkill() {
		return proSkill;
	}


	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}

	
	// 3. Constructors
	public Experience() {
		super();
		this.proSkill = "";
		this.expInYear = 0;

	}

	public Experience(int id, String fullName, String birthDay, String phone, String email, String employeeType, String employeeCount, int expInYear, String proSkill) {
		super(id, fullName, birthDay, phone, email, employeeType, employeeCount);
		// Gọi Constructor của lớp cha Employee
		// Sử dụng được các thuộc tính của lớp cha
		this.expInYear = expInYear;
		this.proSkill = proSkill;
	}
	


	// 4. Input, output methods
	public String showMe() {
		return super.showInfo() + "Số năm kinh nghiệm: "+ this.expInYear + " Kỹ năng chuyên môn: "+ this.proSkill + super.showCertificate();
		// super.showInfo() gọi phương thức showInfo() của lớp cha Employee
	}


//	@Override
//	String Info() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	// Class Experience kế thừa (Inheritance) các thuộc tính từ class Employee
	// CLass Experience sẽ tự thêm các thuộc tính như expInYear, proSkill mà không cập nhập đến phương thức cha (Empoloyee),
	// điều này thể hiện tính trừu tượng (Abstraction)
	// Mỗi nhân viên loại Experience sẽ có các id, fullName, birthDay, phone, email khác nhau, điều này thể hiện tính đa hình (Polymorphism) trong java
}

// Tính trừu tượng hai giai đoạn
// 1. Thiết kế hệ thống
// Nguyên lý solid sinh ra nhiều design button
// 2. Implement(triên khai)




