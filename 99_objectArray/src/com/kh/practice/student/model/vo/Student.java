package com.kh.practice.student.model.vo;

public class Student {
// 필드
	//이름 과목 점수
	private boolean passed;
	public boolean isPassed() {
		return passed;
	}
	public void setPassed(boolean passed) {
		this.passed = passed;
	}

	private String subject;
	private    int score;
	private String name;
	public String getName() {
		return name;
	}
	public String getObject() {
		return subject;
	}
	public int getScore() {
		return score;
	}
	
// 메서드
	//Setter
	//Getter
	public void setName(String name) {
		this.name = name;
	}
	public void setObject(String subject) {
		this.subject = subject;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Student() {
		
	}
	public Student(String name,String subject,int score ) {
		this.name=name;
		this.subject=subject;
		this.score=score;
	}
	//생성자:기본
	//생성자:필수
	
	//자동정렬 단축키 : ctrl + shift +f
	//return Stirng inform()
	public String inform() {
		return "이름 : " +name +" 과목 : "+subject + ", 점수 :" + score;
	}
}
