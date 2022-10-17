package com.jpa.service;

import com.jpa.Dao.StudentDao;
import com.jpa.Dao.StudentDaoImp;
import com.jpa.entities.Student;

public class StudentServiceImp implements StudentService{
	
	private StudentDao dao;
	
	

	public StudentServiceImp() {
		dao = new StudentDaoImp();
	}

	@Override
	public Student findStudentById(int id) {
		Student student = dao.getStudentById(id);
		return student;
	}

	@Override
	public void addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();	}

	@Override
	public void updateStudent(Student student) {
	dao.beginTransaction();
	dao.updateStudent(student);
	dao.commitTransaction();
		
	}

	@Override
	public void removeStudent(Student student) {
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
	}

}
