package com.kh.ConditionEX;

import java.util.Scanner;

// 패키지 : 작성한 파일의 폴더 위치

//조건문 기능용 클래스

public class ConditionEX {
	/*
	if 주어진 조건이 참일 때 실행되는 코드
	else 조건이 거짓일 때 실행되는 코드 블록(필수가 아님)
	
	사용방법
	if (조건문)
		조건이 참일 경우 실행할 코드 작성
		만약에 조건문의 조건이 참인 경우
		자동으로 실행종료
	  메서드 1
	 //메서드 1 : 19세 이상은 성인입니다.
	*/
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("고객님의 나이를 입력하세요. : ");
		int age = sc.nextInt();
		//만약에 고객의 나이가 19세 이상이라면
		if (age >=19) {
			//age의 값이 19 이상이면 성인입니다 출력되게 하기
			System.out.println("성인입니다.");
		}
		
		else {
		//만약에 성인이 아니라면 성인이 아닙니다. 출력하게 하기
		System.out.println("성인이 아닙니다.");
		}
		//성인입니다.를 출력할 것
		
	}
	public static void method2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("num 값을 입력하세요.");
		int num = sc.nextInt();
		
	//만약에 num이 짝수일 경우 짝수입니다. 출력하기
	if (num % 2==0)
		System.out.println("짝수입니다!!");
	else {
		System.out.println("홀수입니다.");
	}
	}
	public static void method3() {
		//0~13어린이
		Scanner sc=new Scanner(System.in);
		System.out.print("나이를 입력하세요.");
		int age=sc.nextInt();
		
		if(age >0 && age<14) {
			System.out.println("어린이입니다.");
		}
		else {
			System.out.println("어린이가 아닙니다.");
		}
		//14부터는 어린이가 아닙니다.
	}
	//Scanner 활용해서 진행하기
	public static void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요.");
		int age = sc.nextInt();
		//나이가 10세이상 20세 미만일 때는 10대
		if (age>10 && age<20)	{
			System.out.println("10대입니다.");
		}
		//이 외는 10대가 아님 출력
		else {
			System.out.println("10대가 아닙니다.");
		}
	}
	
	public static void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("고객님의 나이를 입력하세요.");
		int age = sc.nextInt();
		//나이가 80세 이상이면 80세 이상입니다. 출력하기
		if (age >80)	{
			System.out.println("80세 이상입니다.");
		}
		else {
			System.out.println("80세 이상이 아닙니다.");
		}
	}
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력해주세요.");
		int num1 = sc.nextInt();
		
		if (num1 % 2 ==0)	{
		System.out.println("짝수입니다.");
		}
	}
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력해주세요.");
		int num1 = sc.nextInt();
		
		if (num1 % 2 ==1)	{
		System.out.println("홀수입니다.");
		}
	}
	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력해주세요.");
		int num1 = sc.nextInt();
		
		if (num1<0)	{
		System.out.println("양수만 입력해주세요.");
		}
	}
	public static void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력해주세요.");
		int korean = sc.nextInt();
		
		System.out.println("영어 점수를 입력해주세요.");
		int english = sc.nextInt();
		
		System.out.println("수학 점수를 입력해주세요.");
		int math = sc.nextInt();
		
		int sum = (korean+english+math);
		
		int everage = (korean+english+math)/3;
		
		if (math > 40 && korean>40 && english >40 && everage >60)	{
			System.out.println("축하합니다. 합격입니다.");
		}
		else {
			System.out.println("불합격입니다.");
		}
		System.out.println("국어 : "+ korean);
		System.out.println("영어 : "+ english);
		System.out.println("수학 : "+ math);
		System.out.println("합계 : "+ sum);
		System.out.println("평균 : "+ everage);
	}
	public static void practice7()	{
		Scanner sc = new Scanner(System.in);
		System.out.println("키(m)를 입력해주세요.");
		double height = sc.nextDouble();
		
		System.out.println("몸무게(kg)를 입력해주세요.");
		double kg = sc.nextDouble();
		
		double BMI = kg/(height*height);
		
		if (BMI<18.5) {
			System.out.println("저체중입니다.");
		}
		else if(BMI<23) {
			System.out.println("정상체중입니다.");
		}
		else if(BMI<25) {
			System.out.println("과체중입니다.");
		}
		else if(BMI<30) {
			System.out.println("비만입니다.");
		}
		else{
			System.out.println("고도 비만입니다.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method1();
		//method2();
		//method3();
		//practice1();
		//practice2();
		//practice3();
		//practice4();
		//practice5();
		//practice6();
		practice7();
	}

}