package com.jpa.client;

import com.jpa.entities.Student;
import com.jpa.service.StudentService;
import com.jpa.service.StudentServiceImp;

public class Client {

	public static void main(String[] args) {
		
		StudentService service  = new StudentServiceImp();
		
		Student student = new Student();
		
		
		
		//insert

//		student.setId(5);
//		student.setName("Talha");
//		student.setBoard("HSC");
//		service.addStudent(student);
		
		
		
		// update
//		student = service.findStudentById(1);
//		student.setName("Usman");
//		service.updateStudent(student);
		
		// Retrieve Operation
			student = service.findStudentById(1);
//		System.out.println("ID    :"+student.getId());
//		System.out.println("Name  :"+student.getName());
//		System.out.println("Board :"+student.getBoard());
			
			
		//delete
			student = service.findStudentById(5);
			service.removeStudent(student);

	}

}
