package de.uni.koeln.se.main;

public class TA {
	private Course course;
	private String name;

	public TA(Course course, String name) {
		this.course = course;
		this.name = name;
	}
	
	public Course getCourse() {
		return course;
	}
	
	public String getName() {
		return name;
	}
	
	public void extendContract(Course course) {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
