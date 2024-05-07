package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	private StudentController ssm = new StudentController();
//메서드
	public StudentMenu() {
		
	}
	public void printStudentMenu() {
		System.out.println("학생 이름 과목 점수");
		System.out.println("---------------");
		//for - each
		//String으로 했다면 학생의 이름 or 과목 or 점수
		//Student 이름과 과목 점수를 모두~~가지고 오겠다는 의미
									//김 
		for( Student student :  ssm.printStudent()) {
			System.out.println(student.inform());
		}
		System.out.println("---------------");
		System.out.println("총점 :"+ssm.sumScore());
		System.out.printf("평균 : %.2f \n",ssm.avgScore()[1]);
		System.out.println("합격여부 : " + (ssm.avgScore()[1]>=StudentController.CUT_LINE));
		
		ssm.prnitPass();
		/*
		 * boolean을 써서 true인지 false 인지를 한 적이 없는데
		 * tueㄷ아
		 * 
		 * 
		 * 
		 */
	}
	
	
}
