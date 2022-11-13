package de.uni.koeln.se.main;

import java.util.ArrayList;

public class Exam {

	private int maxValue;
	
	private ArrayList<Question> questions = new ArrayList<>(); // -questions
	private ArrayList<Student> students = new ArrayList<>(); // -students

	public Exam(int id, String task, int value) { // mindestens 1 Question & Composition
		addQuestion(id, task, value);
	}
	
	public boolean register(Student student) { // Exam kann 0..* Students haben
		if (students.contains(student)) {
			return false;
		} else {
			students.add(student);
			return true;
		}
	}
	
	public void addQuestion(int id, String task, int value) { // unedlich viele Questions erstellen
		questions.add(new Question(id, task, value)); 
	}
	
	public ArrayList<Student> getRegisteredStudents() {
		return students;
	}
	
}
