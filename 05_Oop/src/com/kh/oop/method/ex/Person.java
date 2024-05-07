package com.kh.oop.method.ex;

public class Person {
	
	private String name;
	private int age;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
//메인 메서드
	public static void main(String[]args) {
		Person person1=new Person();
		
		person1.setName("홍길동");
		person1.setAge(20);
		
		//Getter를 활용해서 속성값 읽기
		System.out.println("이름 : "+person1.getName());
		System.out.println("나이 : "+person1.getAge());
	}
}