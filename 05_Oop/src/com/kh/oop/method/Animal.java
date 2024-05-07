package com.kh.oop.method;

public class Animal {
	//필드
	public String name;
	public int age;
	
	
//메서드
	//생성자
	public Animal() {
		
	}
	public Animal(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getage() {
		return age;
	}
	//void로 프린트 출력하기
	public void info() {
		System.out.println("동물 이름 : "+name);
		System.out.println("동물 나이 : "+age);
	}
	
	
	//메인메서드
	public static void main(String[] args) {
		Animal dog = new Animal("강아지",1);
		Animal cat= new Animal("고양이",3);
		dog.info();
		cat.info();
	}

}
