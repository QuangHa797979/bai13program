package com.fsoft.entity;

import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
	// 1. Fields
	private int id;
	private String fullName;
	private String birthDay;
	private String phone;
	private String email;
	private String employeeType;
	private String employeeCount;
	public List<Certificate> certificates;
	
//	abstract String Info();
	
	// Employee has - a Certificate;
	// Một employee chứa nhiều certificate
	// Quan hệ HAS-A giúp làm tăng tính tái sử dụng của code
	
	// Abstract class
	// khi extend lại abstract class phải định nghĩa lại các hàm trong abstarct
	// Abstract class bên trong có absstract method -> abstract
	// Abstract class bên trong không có absstract method -> non-abstract
	// không thể khởi tạo obj trực tiếp bên trong

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getBirthDay() {
		return birthDay;
	}


	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	

	public String getEmployeeType() {
		return employeeType;
	}


	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	
	public String getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(String employeeCount) {
		this.employeeCount = employeeCount;
	}
	
	 public Employee() {
	        certificates = new ArrayList<>();
	    }
	 
	 // Các getter, setter của Employee thể hiện tính đóng gói (encapsulation)
	 // lấy get khi sửa
	
	// 3. Constructors
	// tạo ra các obj
	public Employee(int id, String fullName, String birthDay, String phone, String email, String employeeType, String employeeCount) {
		this.id = id;
		this.fullName = fullName;
		this.birthDay = birthDay;
		this.phone = phone;
		this.email = email;
		this.employeeType = employeeType;
		this.employeeCount = employeeCount;
		// this được sử dụng để phân biệt biến cục bộ Employee và biến toàn cục, tránh trùng tên biến.
		certificates = new ArrayList<>();
	}
	
	public String showInfo() {
		return "id: " + this.id + "\t\tHọ tên: " + this.fullName + '/' + "\t\tNgày sinh: " + this.birthDay + '/' + "\t\tSố điện thoại: " + this.phone
				+ "\t\tEmail: " + this.email;
	}
	
	public String showCertificate() {
		String c = "\nCertificate: ";
		int count = 1;
		for (Certificate certificate : certificates) {
			c = c + "\nCertificate" + count 
					+ "\n CertificateID: " + certificate.certificateId 
					+ "\n CertificateName: " + certificate.certificateName 
					+ "\n CertificateRank: " + certificate.certificateRank
					+ "\n CertificateDate: " + certificate.certificateDate;
			count ++;			
		}
		return c;
	}

}



