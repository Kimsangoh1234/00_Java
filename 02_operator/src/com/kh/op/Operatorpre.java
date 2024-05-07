package com.kh.op;

import java.util.Scanner;

public class Operatorpre {
	//최종 출력해주는 메인 메서드
	public static void main(String[] args) {
		수정1();
	}
	//최종으로 출력하는 메서드는 아님
	//내가 필요할 때 꺼내서 사용하는 메서드
	//메서드 : 특정 상태나 기능을 정리해놓은 집합
	//static : 고정된 이라는 뜻을 가지고 있음
	// static이 붙는 것은 자료형이나 변수에 담아서 쓰는게 아니라
	// 단독으로 고정적으로 메모리에서 사용할 수 있음을 나타내는 표현
	public static void 수정1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("안녕하세요 계산기입니다.");
		System.out.print("num1값을 입력하세요.");
		// 1. int num1 = 10 int num2 =3
		// 더하기 빼기 곱하기 나누기 결과를 출력하기
		int num1 = sc.nextInt();
		System.out.print("num2값을 입력하세요.");
		int num2 = sc.nextInt();
		System.out.println("짜잔");
		
		int op = num1 + num2;
		System.out.println("덧셈 결과 : "+ op);
		
		int oi = num1 - num2;
		System.out.println("뺄셈 결과 : "+ oi);
		
		int ok = num1 * num2;
		System.out.println("곱셈 결과 : "+ ok);
		
		int ol = num2/num1;
		System.out.println("나눗셈 결과 : " +ol);
		// 2. double num3 = 2.5 double num4 = 3.5
		// 더하기 빼기 곱하기 나누기 결과를 출력하기
		double num3 = 2.5;
		double num4 = 3.5;
		double io = num3 + num4;
		System.out.println("2번째 문제 덧셈 결과 :"+ io);
		
		double ip = num3 - num4;
		System.out.println("2번째 문제 뺄셈 결과 :"+ ip);
		
		double il = num3 * num4;
		System.out.println("2번째 문제 곱셈 결과 :"+il);
		
		double iu = num3 / num4;
		System.out.println("2번째 문제 나눗셈 결과 :"+ iu);
	}

}