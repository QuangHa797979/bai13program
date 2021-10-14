package com.fsoft.controllers;

import java.util.ArrayList;
import java.util.List;

import com.fsoft.entity.*;
import com.fsoft.repository.*;


public class EmployeeController extends EmployeeAbstract {

	List<Employee> employees = new ArrayList<>();
	
	@Override
	public void addNew(Employee employee) {
        employees.add(employee);
    }

	@Override
	public void update(Employee employee) {
		Employee oldEmployee = getEmployeeByID(employee.getId());
	    for(Employee e : employees) {
	    	if(oldEmployee.getId() == e.getId()) {
	    		employees.remove(e);
	    		break;
	    	}
	    }	
	}
	
	@Override
	public void delete(int id) {
		int countDelete = 0;
		for (Employee employee : employees) {
			if (employee.getId() == id) {
				countDelete++;
				employees.remove(employee);
			}
		}
		if (countDelete == 0) {
			System.out.println("Not found Employee");
		}
		if (countDelete != 0) {
			System.out.println("Delete Succcesful");
		}
	}

	private Employee getEmployeeByID(int id) {
		for (Employee employee: employees) {
			if(employee.getId() == id) {
				return employee;
			}
		}
		return null;
	}


	@Override
	public void findIntern() {
		int countIntern = 0;
		for(Employee employee : employees) {
			if (employee instanceof Intern) {
				countIntern++;
				System.out.println(employee.showInfo());
			}
		}
		if (countIntern == 0) {
			System.out.println("Not found Intern");
		}
	}

	@Override
	public void findExperience() {
		int countExperience = 0;
		for (Employee employee : employees) {
			if (employee instanceof Experience) {
				countExperience++;
				System.out.println(employee.showInfo());
			}
		}
		if (countExperience == 0) {
			System.out.println("Not found Experience");
		}
	}

	@Override
	public void findFesher() {
		int countFresher = 0;
		for (Employee employee : employees) {
			if (employee instanceof Fresher) {
				countFresher++;
				System.out.println(employee.showInfo());
			}
		}
		if (countFresher == 0) {
			System.out.println("Not found Fresher");
		}
	}
	
	// Các phương thức trên override (ghi đè các phương thức trong employee abstract)

}
