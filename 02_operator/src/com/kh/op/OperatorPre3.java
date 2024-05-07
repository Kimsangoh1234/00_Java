package com.kh.op;

import java.util.Scanner;

public class OperatorPre3 {
	//public static void method1() 을 만들어서
	//Scanner를 이용해 num1 num2의 값을 입력받고
	//<>를 사용해서 입력 받은 값이 < >중 어떤 값에서 true가 나오는지 확인중
	//boolean result1 = num1 > num2;
	//boolean result2 = num1 >= num2;
	//boolean result3 = num1 < num2;
	//boolean result4 = num1 <= num2;

public static void method1() {
	Scanner sc=new Scanner(System.in);
	System.out.print("num1의 값을 입력해주세요 : ");
	int num1=sc.nextInt();
	
	System.out.println("num2의 값을 입력해주세요 : ");
	int num2=sc.nextInt();
	
	boolean result1=num1>num2;
	boolean result2=num1>=num2;
	boolean result3=num1<num2;
	boolean result4=num1<=num2;
	
	System.out.println(result1+" = num1 > num2");
	System.out.println(result2+" = num1 >= num2");
	System.out.println(result3+" = num1 < num2 ");
	System.out.println(result4+" = num1 <= num2");

}
public static void method2( ) {
	Scanner sc = new Scanner(System.in);
	System.out.println("num1값을 입력해주세요.");
	int num1 = sc.nextInt();
	
	System.out.println("num2값을 입력해주세요.");
	int num2 = sc.nextInt();
	
	System.out.println("num3값을 입력해주세요.");
	int num3 = sc.nextInt();
	//&& if while 조건을 체크할 때
	//   두 개의 조건이 모두 만족하는 경우 사용
	// & 비트 단위 연산 특정 비트 패턴을 판단할 때 사용
	//
	boolean result = (num1 < num2) && (num2==num3);
	
	System.out.println("num1값 : "+num1);
	System.out.println("num2값 : "+num2);
	System.out.println("num3값 : "+num3);
	System.out.println("(num1<num2)&&(num2==num3) :"+result);
}
	public static void main(String[] args) {
		//method1();
		method2();	
		
	}
}
