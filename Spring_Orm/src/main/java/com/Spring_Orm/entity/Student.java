package com.Spring_Orm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Student_detail")
public class Student {
	@Id
	@Column(name = "student_id")
	private int StudentID;
	@Column(name = "student_name")
	private String StudentName;
	@Column(name = "student_city")
	private String StudentCity;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentID, String studentName, String studentCity) {
		super();
		StudentID = studentID;
		StudentName = studentName;
		StudentCity = studentCity;
	}
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentCity() {
		return StudentCity;
	}
	public void setStudentCity(String studentCity) {
		StudentCity = studentCity;
	}
	
	

}
