package de.uni.koeln.se.main;

import java.util.ArrayList;

public class Professor extends Employee {
	private Course course;
	ArrayList<Course> courses = new ArrayList<>();

	public Professor(String name, int id, ArrayList<Course> courses) {
		super(name, id);	//generalization
		this.courses = courses;
	}
	
	public void publicCourse() {
		
	}
	
	public void assignTA() {
		
	}
	
	public void addCourse() {
		
	}
}
