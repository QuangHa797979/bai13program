package com.fsoft.controllers;

import java.util.ArrayList;
import java.util.List;

import com.fsoft.entity.*;
import com.fsoft.service.*;


public class EmployeeController implements EmployeeService {

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

	public Employee getEmployeeByID(int id) {
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
				// instanceof được sử dụng để kiểm tra Experience  là thể hiện của employee hay không.
				// Khi kiểu của lớp con Experience tham chiếu tới đối tượng của lớp cha employee được gọi là downcasting. 
				// Do Experience kế thừa Employee nên đối tượng của Experience có thể tham chiếu đến cả hai lớp Experience và Employee
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
