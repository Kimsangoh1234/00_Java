package com.kh.Inheritance.OverLoadingEX;

public class Run {
//main 메서드 : main은 오버로딩x 오버라이딩x
	public static void main(String[] args) {
		//사람 1 : 홍길동
		Person 사람1 = new Person();
		사람1.setName("홍길동");
		사람1.setAge(17);
		사람1.displayInfo();
		//사람 2 : 박영희
		Person 사람2 = new Person();
		사람2.setName("박영희");
		사람2.setAge(15);
		사람2.displayInfo();
		Person 사람3 = new Person();
		사람3.setName("김철수");
		사람3.setAge(13);
		사람3.displayInfo();
	}	
}
