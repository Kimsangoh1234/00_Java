package com.kh.op;

import java.util.Scanner;

public class Operatorpre2 {
	
	public static void method1( ) {
	//스캐너로 입력한 값이 true인지 false 인지 해볼 것
	Scanner sc = new Scanner(System.in);
	System.out.print("a의 값을 입력하세요. : ");
	int a = sc.nextInt();
	
	System.out.print("b의 값을 입력하세요. : ");
	int b = sc.nextInt();
	
	System.out.println("a : " + a + ", b : "+ b);
	System.out.println("a와 b가 같으면 ==true가 나올 것");
	System.out.println("a == b : " + (a==b));
	System.out.println("a와 b가 다르면 !=false가 나올 것");
	System.out.println("a != b : " + (a !=b));
	}
	
	//method2를 만들어서 중간 연산자를 사용한 다음
	// 비교연산자를 사용해서 값이 같은지 틀린지 확인해볼 것
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("c의 값을 입력하세요. : ");
		int c = sc.nextInt();
		System.out.print("d의 값을 입력하세요. : ");
		int d = sc.nextInt();
		
		int e = ++c; // c + 1 = c 넣겠다 해줬기 때문에 c=12
		
		// int f = ++c;를 한다면 f의 값은 어떻게 나오는지
		//System.out.println("f : " + f); f값 출력해보기
		System.out.println("c :" + c + ", d : " + d + ", e : " + e);
		System.out.println("c == d : " + (c==d));
		System.out.println("c == e : " + (c==d));
		
		int f = ++c;
		System.out.println("f : " + f);
	}
	//method3 만들어서 사용하기
	public static void method3() {
//최종목표 : 모든 사람이 사탕을 골고루 나눠가지려고 한다.
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수를 입력하세요.");
		int people = sc.nextInt();
		
	
		//인원수와 사탕 개수를 키보드로 입력받기
		System.out.println("사탕 파티에" + people + "명이 참석했습니다.");
		System.out.println("현재 보유하고 있는 총 사탕의 개수를 입력하세요. : ");
		int candies = sc.nextInt();
		System.out.println("현재 가지고 있는 사탕은" + candies + "개 입니다.");
		
		System.out.println("그렇군유, 그렇다면 동일하게 나눠가질 사탕의 갯수는 몇 개입니까?");
		
		//한 사람당 동일하게 나눠가질 사탕의 개수 = 총 사탕의 개수 /총 인원 수
		int perperson = candies / people;
		// 1인당 동일하게 나눠가진 사탕의 개수와
		System.out.println("1인당 동일하게 나눠가진 사탕 개수 : " + perperson);
		//나눠주고 남은 사탕의 개수를 출력하기
		//남은 사탕의 개수 = 총 사탕의 개수 % 사람
		int remain = candies % people;
		System.out.println("나눠갖고 남은 사탕의 개수 : " + remain);
		
	}
	
	public static void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 성적을 입력하시오.");
		int korea = sc.nextInt();
		
		System.out.println("영어 성적을 입력하시오.");
		int English = sc.nextInt();
		
		System.out.println("수학 성적을 입력하시오.");
		int math = sc.nextInt();
		
		int everage = (korea+English+math)/3;
		System.out.println("평균 성적은 "+ everage + "입니다.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method1();
		method2();
		//method3();
		//method4();
	}

}