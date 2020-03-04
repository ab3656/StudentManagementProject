package edu.mum.cs.cs415.demos.studentrecordsmgmtapp.model;

import java.time.LocalDate;

public class Student {
	
	private long studentId;
	private String name;
	private LocalDate dateOfAdmission;
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfAdmission() {
		return dateOfAdmission;
	}
	public void setDateOfAdmission(LocalDate dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}
	public Student(long studentId, String name, LocalDate localDate) {
		this.studentId = studentId;
		this.name = name;
		this.dateOfAdmission = localDate;
	}
	public Student() {
		
	}
	
	
	
	

}
