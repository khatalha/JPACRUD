package com.jpa.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	int id;
	
	String name;
	
	String board;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBoard() {
		return board;
	}
	public void setBoard(String board) {
		this.board = board;
	}
	public Student(int id, String name, String board) {
		this.id = id;
		this.name = name;
		this.board = board;
	}
	public Student() {
	
	}
	
	

}
