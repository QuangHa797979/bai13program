package com.fsoft.exception;

public class Common {
public static final String EMPLOYEE_FRESHER = "Fresher";
public static final String EMPLOYEE_INTERN = "Intern";
public static final String EMPLOYEE_EXPERIENCE = "Experience";
public static final String VALID_EMAIL_REGEX =  "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
public static final String VALID_NAME_REGEX = "[a-zA-Z\\s]+";
public static final String VALID_PHONE_NUMBER_REGEX = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";
public static final String VALID_BIRTHDAY_REGEX = "^\\d{2}-\\d{2}-\\d{2}$";
public static final String VALID_INPUT_NUMBER_REGEX = "-?\\d+(\\.\\d+)?";


public void checkInputNumber(String inputNumber, int rangeMin, int rangeMax) throws InputNumberException {
	if (!inputNumber.matches(Common.VALID_INPUT_NUMBER_REGEX)) {
		throw new InputNumberException("Number must be form " + rangeMin + " to " + rangeMax);
	} else if (inputNumber.matches(Common.VALID_INPUT_NUMBER_REGEX) &&  (Integer.parseInt(inputNumber) < rangeMin || Integer.parseInt(inputNumber) > rangeMax)) {
		throw new InputNumberException("Number must be from " + rangeMin + " to " + rangeMax);
    }else{
        System.out.println("Number accepted");
    }
}

public void checkPhone(String str) throws PhoneException {
	if(!str.matches(Common.VALID_PHONE_NUMBER_REGEX)) {
		throw new PhoneException("Invalid phone number"); 
	} else {
			System.out.println("Phone number accecpted");
		}
	}
public void checkName(String str) throws NameException {
	if(!str.matches(Common.VALID_NAME_REGEX)) {
		throw new NameException("Invalid name"); 
	} else {
			System.out.println("Name accecpted");
		}
	}

public void checkEmail(String str) throws EmailException {
	if(!str.matches(Common.VALID_EMAIL_REGEX)) {
		throw new EmailException("Invalid email"); 
	} else {
			System.out.println("Email accecpted");
		}
	}

public void checkBirthDay(String str) throws BirthdayException {
	if(!str.matches(Common.VALID_BIRTHDAY_REGEX)) {
		throw new BirthdayException("Invalid BirthDay"); 
	} else {
			System.out.println("BirthDay accecpted");
		}
	}
}

	
