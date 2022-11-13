package de.uni.koeln.se.main;

public class Main {

	public static void main(String[] args) {
		
		Student st1 = new Student(1, "Marlon");
		
		Exam exam1 = new Exam(1, "Aufgabe 1", 10); // min. 1 Question in Exam & Composition, weil wenn exam1 gelöscht wird, dann auch Questions
		exam1.addQuestion(2, "Aufgabe 2", 8); // Exam kann unendlich viele Questions haben
		
		exam1.register(st1); // Exam kann 0..* Students haben
		
		st1.addExam(exam1); // Student kann 0..* Exams haben
		
		Course c1 = new Course(301, "Softwaretechnik", 180);
		
		Project pr1 = new Project("Projekt 1", c1); // Jedes Project hat genau 1 Course
		pr1.addMember(st1); // Project kann 0..* Students haben
		st1.addProject(pr1); // Student kann 0..1 Projects haben
		
		Department d1 = new Department("Informatik"); 
		Employee e1 = new Employee("Müller", 8428, d1); // Aggregation; jeder Employee hat genau 1 Department
		d1.addEmployee(e1); // Department kann 0:..* Employees haben
		Professor p1 = new Professor("Vogelsang", 7898, d1, 30); // Inheritance von Employee
		p1.addExam(exam1); // Professor kann 0..* Exams haben
	}

}
