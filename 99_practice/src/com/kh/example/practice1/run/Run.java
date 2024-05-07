package com.kh.example.practice1.run;

import com.kh.example.practice7.model.ve.Employee;

public class Run {

	public static void main(String[] args) {
		// 멤버가 정보를 작성할 수 있는 공간을 만들고
		// 공간에 멤버에 대한 정보를 작성할 수 있는
		//Member 객체 생성
		Member member1 = new Member();
		
		member1.changeName("동글뱅이");
		
		member1.printName(null);
	}
	

}
