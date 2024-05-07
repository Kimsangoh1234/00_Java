package com.kh.practice.Employee.view;

import com.kh.practice.Employee.mode.vo.Employee;
import com.kh.practice.Employee.mode.vo.EmployeeController;
import com.kh.practice.student.controller.StudentController;

public class EmployeeMenu {
	private EmployeeController ep = new EmployeeController();

	public EmployeeMenu() {

	}

	public void printEmployeeMenu() {
		System.out.println("직원 이름 과목 점수");
		System.out.println("----------------");
		for (Employee EP : ep.printEmployee()) {
			System.out.println(EP.inform());
		}
		System.out.println("---------------");
		System.out.println("총점 :" + ep.sumScore());
		System.out.printf("평균 : %.2f \n", ep.avgScore()[1]);
		System.out.println("합격여부 : " + (ep.avgScore()[1] >= StudentController.CUT_LINE));
	}

}
