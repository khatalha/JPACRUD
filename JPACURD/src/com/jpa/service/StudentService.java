package com.jpa.service;

import com.jpa.entities.Student;

public interface StudentService {
	
	public abstract Student findStudentById(int id);
	
	public abstract void addStudent(Student student);
	
	public abstract void updateStudent(Student student);
	
	public abstract void removeStudent(Student student);

}
