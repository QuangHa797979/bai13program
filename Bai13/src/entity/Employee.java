package entity;

import java.util.Scanner;

public abstract class Employee {
	// 1. Fields
	
	final int Experience = 0;
	final int Fresher  = 1;
	final int Intern   = 2;
	private int id;
	private String fullName;
	private String birthDay;
	private String phone;
	private String email;
	private String employeeType;
	

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

	
	// 3. Constructors
	public Employee() {
		// Default
		super();
		this.fullName = "";
		this.birthDay = "";
		this.phone = "";
		this.email = "";
		this.employeeType = "";
	}

	public Employee(int id, String fullName, String birthDay, String phone, String email, String employeeType) {
		this.id = id;
		this.fullName = fullName;
		this.birthDay = birthDay;
		this.phone = phone;
		this.email = email;
		this.employeeType = employeeType;
	}
	
//	public void input(Scanner scan) {
//		System.out.println("Nhập id: ");
//		this.id = Integer.parseInt(scan.nextLine());
//		System.out.println("Nhập họ tên: ");
//		this.fullName = scan.nextLine();
//		System.out.println("Nhập ngày sinh: ");
//		this.birthDay = scan.nextLine();
//		System.out.println("Nhập số điện thoại: ");
//		this.phone = Integer.parseInt(scan.nextLine());
//		System.out.println("Nhập email: ");
//		this.email = scan.nextLine();
//		do {
//			System.out.print("Nhập loại nhân viên ((0) Experience, (1) Fresher, (2) Intern): ");
//			this.employeeType = Integer.parseInt(scan.nextLine());
//		} while (this.employeeType < 0 || this.employeeType > 3);
//	}
	
//	public String showEmployeeType() {
//		if(this.employeeType == Experience)
//			return "Experience";
//		else if(this.employeeType == Fresher)
//			return "Fresher";
//		else
//			return "Intern";
//	}
	
	
	public String showInfo() {
		return "id: " + this.id + "\t\tHọ tên: " + this.fullName + '/' + "\t\tNgày sinh: " + this.birthDay + '/' + "\t\tSố điện thoại: " + this.phone
				+ "\t\tEmail: " + this.email;
	}

}



