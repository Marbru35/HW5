package de.uni.koeln.se.main;

import java.util.ArrayList;

public class Project {
	
	private String name;
	private ArrayList<Student> members = new ArrayList<>();
	private Course course;
	
	public Project(String name, Course course) { // Jedes Project hat genau 1 Course
		this.name = name;
		this.course = course;
	}
	
	public String getName() {
		return name;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	public void addMember(Student student) { //Project kann * Students haben
		members.add(student);
	}
	
	public ArrayList<Student> getMembers() {
		return members;
	}

}
