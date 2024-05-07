package com.kh.example.practice7.run.Run;

import com.kh.example.practice7.model.ve.Employee;

public class Run {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.empNo=1;
		emp1.empName="김재식";
		emp1.gender='남';
		System.out.println("=== 직원1 ===");
		System.out.println("사원번호 : "+emp1.empNo);
		System.out.println("사원이름 : "+emp1.empName);
		System.out.println("사원성별 : "+emp1.gender);
		
		//직원 2 필수로 번호 이름 필수 넣자
		//객체 생성한 후 필수생성자로 작성하기
		Employee emp3 = new Employee(3,"가나다","사무직",20,'남',
				5000,1000,"010-0002-0000","서울시 광남구");
		System.out.println("=== 직원 3 ===");
		System.out.println("사원번호 : "+emp3.empNo);
		System.out.println("사원이름 : "+emp3.empName);
		System.out.println("사원나이 : "+emp3.age);
		System.out.println("사원성별 : "+emp3.gender);
		System.out.println("사원연봉 : "+emp3.salary);
		System.out.println("사원보너스 : "+emp3.bonuspoint);
		System.out.println("사원번호 : "+emp3.phone);
		System.out.println("사원주소 : "+emp3.address);
	}

}
