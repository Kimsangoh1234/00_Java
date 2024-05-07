package com.kh.ConditionEX;

import java.util.Scanner;

public class ConditionEX2 {
	public static void method1()	{
		Scanner sc = new Scanner(System.in);
		System.out.print("안녕하세요. kh티켓나라입니다.");
		System.out.print("나이를 입력해주세요. : ");
		int age = sc.nextInt();
		
		if(age<=13) {
			System.out.println("어린이");
		}else if(age <=18) {
			System.out.println("청소년");
		}else {
			System.out.println("성인");
		}
	}
	public static void method4() {
		//13세 이하 어린이 14~18 청소년 19세 성인
		Scanner sc = new Scanner(System.in);
		System.out.println("몇살이신가요?");
		int age = sc.nextInt();
		//변수의 기능을 활용해서 마지막에 나이에 따른 표기를 출력
		String result;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
		if(age<=13) {
			result ="어린이";
		}else if(age>= 14&& age<=18) {
			result="청소년";
		}else {
			result="성인";
		}
		System.out.println(result);
	}
	public static void method5( ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("중간고사점수는 몇점인가요?");
		double middle = sc.nextDouble();
		
		System.out.println("기말고사 점수는 몇점인가요?");
		double fin = sc.nextDouble();
		
		System.out.println("과제 점수는 몇점인가요?");
		double homework = sc.nextDouble();
		
		System.out.println("출석 횟수는 몇번인가요?");
		double check = sc.nextDouble();
		
		double attedscore=check/20*100;
		double midscore = middle*0.2;
		double fiscore = fin*0.3;
		double asscore = homework*0.3;
		double totalscore= midscore+fiscore+asscore+attedscore;
		
		
		if(totalscore>70 && attedscore>=14) {
			System.out.println("pass입니다.");
		}else {
			System.out.println("fail입니다.");
		}
		System.out.println("====== 결과 =======");
		System.out.println("중간고사 점수(20점 만점) : " +midscore);
		System.out.println("기말고사 점수(30점 만점) : " +fiscore);
		System.out.println("과제 점수(30점 만점) : "+asscore);
		System.out.println("출석 점수(20점 만점) : "+attedscore);
	}	
	
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 작성하세요. :");
		int month = sc.nextInt();
		
		String result;
		if(month>=3 && month<=5) {
			result = "봄";
		}else if(month>=6 && month<=8) {
			result = "여름";
		}else if(month>=9 && month<=11) {
			result = "가을";
		}else if(month==1 || month==2 || month==12) {
			result = "겨울";
		}else {
			result = "해당하는 계절이 없습니다.";
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		/*
		 if - else if - else
		 사용방법
		 if (조건) {
		 	조건1이 참일 경우 실행할 코드 작성
		 	
		 } else if(조건2){
		 
		 	조건1이 거짓이고 
		 	조건2가 참일경우 경우 실행할 코드 작성
		 	
		 } else{
		 	조건 1과 조건2가 모두 거짓일 경우 실행할 코드
		 }
		 
		 */
		//만약에 돈이 2000원 이상 있을 경우 택시를 탄다
		//만약에 돈이 1500~1900 이하 있을 경우 대중교통을 이용한다.
		//만약에 돈이 없을경우 걸어간다.
		
		//method1();
		//method2();
		//method4();
		method5();
	}
	

}
