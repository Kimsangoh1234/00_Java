package com.kh.example.practice4;

import com.kh.oop.method.Students;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students student = new Students();
		
		student.setName("홍길동");
		student.setGrade(3);
		student.setClassroom(2);
		student.setHeight(200.5);
		student.setGender('남');
		
		student.information();
	}

}
