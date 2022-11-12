package de.uni.koeln.se.main;

import java.util.ArrayList;

public class Department {

	private String name;
	private ArrayList<Employee> employees = new ArrayList<>();
	
	public Department(String name, ArrayList<Employee> employees) {
		this.name = name;
		this.employees = employees;
	}
	
	
}
