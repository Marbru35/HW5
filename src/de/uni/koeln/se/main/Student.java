package de.uni.koeln.se.main;

import java.util.ArrayList;

public class Student {
	
	private int id;
	private String name;
	
	private ArrayList<Exam> exams = new ArrayList<>();
	private Project project;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void addExam(Exam exam) {
		exams.add(exam);
	}
	
	public String getName() {
		return name;
	}
	
	public void addProject(Project project) {
		
	}
	
	public Project getProject() {
		return project;
	}
}
