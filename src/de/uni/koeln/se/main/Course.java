package de.uni.koeln.se.main;

import java.util.ArrayList;

public class Course {

	private int id;
	private String name;
	private int maxCapacity;
	private boolean isFull;
	private ArrayList<Student> students = new ArrayList<>();
	
	public Course(int id, String name, int cap) {
		this.id = id;
		this.name = name;
		this.maxCapacity = cap;
	}
	
	public void enroll(Student student) { // Course hat * Students
		students.add(student);
	}
	
	public void apply(TA ta) {
		
	}
	
	public void setMaxCap(int max) {
		this.maxCapacity = max;
	}
	
	public Professor getProf() {
		
	}
	
	public TA getTa() {

	}
	
	public void setTa(TA ta) {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
