package com.kh.oop.method;
/*
Setter
	 객체의 속성 값을 설정하는 메서드
	 객체 외부에서 속성 값을 변경할 수 있음
Getter
	  개체의 속성값을 반환하는 메서드
	  객체 외부에서 속성 값을 읽을 수 있음
	  
	  단축키 Alt Shifts 해
*/
public class GetterSetter {
	
	
	//필드
	private String name;
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

	private int age;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
