package de.uni.koeln.se.main;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Student st1 = new Student(1, "Marlon");
		
		Exam exam1 = new Exam(1, "Aufgabe 1", 10); // min. 1 Question in Exam & Composition, weil wenn exam1 gelöscht wird, dann auch Questions
		exam1.addQuestion(2, "Aufgabe 2", 8); // Exam kann unendlich viele Questions haben
		
		exam1.register(st1); // Exam kann 0..* Students haben
		
		st1.addExam(exam1); // Student kann 0..* Exams haben
		
		Project pr1 = new Project("Projekt 1");
		pr1.addMember(st1); // Project kann 0..* Students haben
		st1.addProject(pr1); // Student kann 0..1 Projects haben
		
		Employee e1 = new Employee("Rosenkranz", 8428);
		
		Department d1 = new Department("Informatik"); 
		d1.addEmployee(e1); // Department kann 0:..* Employees haben
		
	}

}
