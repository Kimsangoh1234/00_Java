package com.kh.oop.method;

public class Students {

	public int grade;
	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getGrade() {
		return grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public char getGender() {
		return gender;
	}

	public int classroom;
	public String name;
	public double height;
	public char gender; //alt shift s
	
 public Students() {
	 
 }

 public void information() {
	 System.out.println("학년 : "+grade);
	 System.out.println("반 : "+classroom);
	 System.out.println("이름 : "+name);
	 System.out.println("키 : "+height);
	 System.out.println("성별 : "+gender);
 }
}
