package entity;
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
	/**
	 * @return the majors
	 */
	public String getMajors() {
		return majors;
	}

	/**
	 * @param majors the majors to set
	 */
	public void setMajors(String majors) {
		this.majors = majors;
	}

	/**
	 * @return the semester
	 */
	public String getSemester() {
		return semester;
	}

	/**
	 * @param semester the semester to set
	 */
	public void setSemester(String semester) {
		this.semester = semester;
	}
	
	/**
	 * @return the universityName
	 */
	public String getUniversityName() {
		return universityName;
	}

	/**
	 * @param universityName the universityName to set
	 */
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	// 3. Constructors
	public Intern() {

	}

	public Intern(int id, String fullName, String birthDay, String phone, String email, String employeeType, String majors, String semester, String universityName) {
		super(id, fullName, birthDay, phone, email, employeeType);
		this.majors = majors;
		this.semester = semester;
		this.universityName = universityName;
	}

	// 4. Input, output methods
//	@Override
//	public void input(Scanner scan) {
//		super.input(scan);
//			System.out.print("Please input Majors: ");
//			this.majors = scan.nextLine();
//			System.out.print("Please input Semester: ");
//			this.semester = scan.nextLine();
//			System.out.print("Please input University Name: ");
//			this.universityName = scan.nextLine();
//	}

	@Override
	public String showInfo() {
		return super.showInfo() + "\t Chuyên ngành: " + this.majors + "\t Học kì: " + this.semester + "\t Trường đại học: " + this.universityName;
	}
}
