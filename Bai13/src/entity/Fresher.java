package entity;
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
	/**
	 * @return the graduationDate
	 */
	public String getGraduationDate() {
		return graduationDate;
	}

	/**
	 * @param graduationDate the graduationDate to set
	 */
	public void setGraduationDate(String graduationDate) {
		this.graduationDate = graduationDate;
	}

	/**
	 * @return the graduationRank
	 */
	public String getGraduationRank() {
		return graduationRank;
	}

	/**
	 * @param graduationRank the graduationRank to set
	 */
	public void setGraduationRank(String graduationRank) {
		this.graduationRank = graduationRank;
	}
	
	/**
	 * @return the education
	 */
	public String getEducation() {
		return education;
	}

	/**
	 * @param education the education to set
	 */
	public void setEducation(String education) {
		this.education = education;
	}

	// 3. Constructors
	public Fresher() {

	}

	public Fresher(int id, String fullName, String birthDay, String phone, String email, String employeeType, String graduationDate, String graduationRank, String education) {
		super(id, fullName, birthDay, phone, email, employeeType);
		this.graduationDate = graduationDate;
		this.graduationRank = graduationRank;
		this.education = education;
	}

	// 4. Input, output methods
//	@Override
//	public void input(Scanner scan) {
//		super.input(scan);
//			System.out.print("Please input Graduation Date: ");
//			this.graduationDate = scan.nextLine();
//			System.out.print("Please input Graduation Rank: ");
//			this.graduationRank = scan.nextLine();
//			System.out.print("Please input education: ");
//			this.education = scan.nextLine();
//
//	}

	@Override
	public String showInfo() {
		 return super.showInfo() + "\t Ngày tốt nghiệp: " + this.graduationDate + "\t Hạng tốt nghiệp: " + this.graduationRank + "\t Bậc giáo dục: " + this.education;
	}
}
