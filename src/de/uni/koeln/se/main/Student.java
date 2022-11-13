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
	
	public void addExam(Exam exam) { // Student hat * Exams
		exams.add(exam);
	}
	
	public String getName() {
		return name;
	}
	
	public void addProject(Project project) { // Student kann 0..1 Projects haben
		this.project = project;
	}
	
	public Project getProject() {
		return project;
	}
}
