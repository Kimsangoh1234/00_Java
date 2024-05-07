package com.kh.Inheritance.OverLoadingEX;

public class Person {
	
//필드 : 변수명을 작성해주는 것
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age;
//메서드 기본
	//Getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Person() {
		
	}
	//생성자 : 기본 오버로딩(똑같은 메서드 이름인데 안에 있는 매개변수가 다를 때 사용)
	//생성자 : 필수 오버로딩
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void displayInfo() {
		System.out.println("이름 : "+ name + " 나이 : "+age);
	}
}
