package de.uni.koeln.se.main;

public class Employee {

	private String name;
	private int employeeId;
	private Department department;
	
	public Employee(String name, int employeeId, Department department) { // Aggregation; Employee hat genau 1 Department
		this.name = name;
		this.employeeId = employeeId;
		this.department = department;
	}
	
}
