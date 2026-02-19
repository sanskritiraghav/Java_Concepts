package com.test;

import java.util.List;

public class StudentMain {
	public static void main(String args []) {
		Student s = new Student();
		Student_sync c = new Student_sync();
// get new
//		s.setId(2);
//		s.setName("Dhanush");
//		c.StudDet(s);
		
// update old
		
		s.setId(2);
		s.setName("Bhuvan"));
		c.updateStudent(s);
		System.out.println("Updated Student Data.");
		
		
		List<Student> data = c.getAllStudents();
		data.forEach(System.out::println);
	}
}
