package de.uni.koeln.se.main;

import java.util.ArrayList;

public class Professor extends Employee { // inheritance

	private ArrayList<Exam> exams = new ArrayList<>();
	private ArrayList<Course> courses = new ArrayList<>();
	
	public Professor(String name, int id, Department department, int cap) {
		super(name, id, department); //generalization
	}
	
	public void addExam(Exam exam) { // Professor kann 0..* Exams haben
		exams.add(exam);
	}
	
	public void publicCourse() {
		
	}
	
	public void assignTA() {
		
	}

}
