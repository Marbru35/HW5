package de.uni.koeln.se.main;

public class Course {

	private int id;
	private String name;
	private int maxCapacity;
	private boolean isFull;
	private Professor prof;
	private int[] professors = new int[3];
	
	public Course(int id, String name, int cap, Professor prof) {
		this.id = id;
		this.name = name;
		this.maxCapacity = cap;
		this.prof = prof;
	}
	
	public void enroll(Student student) {
		
	}
	
	public void apply(TA ta) {
		
	}
	
	public void setMaxCap(int max) {
		this.maxCapacity = max;
	}
	
	public Professor getProf() {
		return prof;
	}
	
	public TA getTa() {
		
	}
	
	public void setTa(TA ta) {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
