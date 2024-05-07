package com.kh.oop.basic;

public class Student {
	//학생인데 학생의 이름과 나이와 학년
 public String name;
 public int age;
 public int grade;
	public Student(String name,int 나이, int 학년) {
		this.name=name;
		this.age=나이;
		this.grade=학년;
	}
	public void info() {
		System.out.println("이름 : " + name+"\n 나이:" +age+"\n 학년 : "+grade);
	}
	public static void main(String[] args) {
		Student student1 = new Student("김철수",18,3);
		Student student2 = new Student("박영희",20,2);
		student1.info();
		student2.info();
}
}