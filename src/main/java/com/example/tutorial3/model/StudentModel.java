package com.example.tutorial3.model;

public class StudentModel {
	public String name;
	public String npm;
	public double gpa;
	
	public String getNpm() {
		return npm;
	}

	public void setNpm(String npm) {
		this.npm = npm;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public StudentModel(String npm, String name, double gpa) {
		this.setName(name);
		this.npm = npm;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
