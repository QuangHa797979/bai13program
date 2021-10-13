package entity;
/*
 * Purpose: Manage teachers - subclass
 * Author: Vu The Quan
 * Date: 11/07/2020
 */

import java.util.Scanner;

public class Experience extends Employee {
	// 1. Fields
	private int expInYear;
	private String proSkill;

	// 2. Getters, setters
	/**
	 * @return the expInYear
	 */
	public int getExpInYear() {
		return expInYear;
	}

	/**
	 * @param expInYear the expInYear to set
	 */
	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}

	/**
	 * @return the proSkill
	 */
	public String getProSkill() {
		return proSkill;
	}

	/**
	 * @param proSkill the proSkill to set
	 */
	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}

	

	// 3. Constructors
	public Experience() {
		super();
		this.proSkill = "";
		this.expInYear = 0;

	}

	public Experience(int id, String fullName, String birthDay, String phone, String email, String employeeType, int expInYear, String proSkill) {
		super(id, fullName, birthDay, phone, email, employeeType);
		this.expInYear = expInYear;
		this.proSkill = proSkill;
	}
	


	// 4. Input, output methods
	
//	@Override
//	public void input(Scanner scan) {
//		super.input(scan);
//		System.out.print("Nhập skill: ");
//		this.expInYear = Integer.parseInt(scan.nextLine());
//		System.out.print("Please input address: ");
//		this.proSkill = scan.nextLine();
//	}
	
	@Override
	public String showInfo() {
		
		return super.showInfo() + "Số năm kinh nghiệm: "+ this.expInYear + " Kỹ năng chuyên môn: "+ this.proSkill;

//		System.out.println("Id: "+getId());
//		System.out.println("Fullname: "+ getFullName());
//		System.out.println("Birthday: "+getBirthDay());
//		System.out.println("Phone: "+getPhone());
//		System.out.println("email: "+getEmail());
//		System.out.println("Employee type: "+ getEmployeeType() );
////		System.out.println("Employee count: "+getEmployee_count());  //static
//		
//		System.out.println("Số năm kinh nghiệm: "+ expInYear);
//		System.out.println("Kỹ năng chuyên môn: "+proSkill);
	}
}
