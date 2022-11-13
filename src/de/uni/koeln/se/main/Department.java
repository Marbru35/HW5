package de.uni.koeln.se.main;

import java.util.ArrayList;

public class Department {

	private String name;
	private ArrayList<Employee> employee = new ArrayList<>();
	
	public Department(String name) {
		this.name = name;
	}
	
	public void addEmployee(Employee e) { // Department hat 0..* Employees
		employee.add(e);
	}
}
