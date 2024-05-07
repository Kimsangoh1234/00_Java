package com.kh.operatorPre;

import java.util.Scanner;

//99_Practice
public class ControlPre {
	//실습문제 1번 홀수 짝수 나타내기
	public static void practice1( ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. :");
		int num1 = sc.nextInt();
		//만약에 숫자가 양수일경우에만 홀 짝을 나타낼 것이다.
		//잘라내기 ctrl+x 복사 ctrl+c 붙여넣기 ctrl+v 
		if(num1>0) {
			if (num1 % 2==0) {
				System.out.println("짝수입니다.");
			}else if(num1 %2 ==1){
				System.out.println("홀수입니다.");
			}else {
				System.out.println("양수가 아닙니다.");
			}
			}
		}
	public static void practice2( ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력해주세요. : ");
		int korean = sc.nextInt();
		
		System.out.println("영어 점수 : ");
		int english = sc.nextInt();
		
		System.out.println("수학 점수 : ");
		int math = sc.nextInt();
		
		int totalscore = korean+english+math;
		int everage = totalscore/3;
		
		if(korean>=40 && english >=40 && math>=40 && everage>=60){
		System.out.println("국어 점수 :"+korean);
		System.out.println("영어 점수 : "+english);
		System.out.println("수학 점수 : "+math);
		System.out.println("합   계 : "+totalscore);
		System.out.println("평   균 : "+everage);
		System.out.println("축하합니다. 합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
	
}
	public static void practice3() {
		
	}
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해주세요. : ");
		double height = sc.nextDouble();
		
		System.out.println("몸무게(kg)를 입력해주세요. :");
		double weight = sc.nextDouble();
		
		double BMI = weight/(height*height);
		//BMI계산 = 체질량지수 비만도를 확인하는것
		if(BMI<18.5) {
			System.out.println("저체중");
		}else if(BMI<23) {
			System.out.println("정상체중");
		}else if(BMI<25) {
			System.out.println("과체중");
		}else if(BMI<30) {
			System.out.println("비만");
		}else {
			System.out.println("고도비만");
		}
	}

		//평가 비율에 따른 총점계산
		//중간 20 기말 30 과제 30 출석 20 = 100점
		
	public static void main(String[] args) {
		//practice1();
		practice2();
		practice3();
		practice4();
		// 키보드로 입력받은 정수가 양수이면서 짝수일 때만 짝수입니다 출력
	}

}
