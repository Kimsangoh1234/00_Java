package com.kh.ConditionEX;

import java.util.Scanner;

public class ConditionPre {
	//public static void method1() {
		/*Scanner sc = new Scanner(System.in);
		int num 1= sc.nextInt();
		int num 2= sc.nextInt
		같다면 같습니다. 출력하고
		같지 않다면 같지않습니다. 출력하기
		 * 숫자 값 2개를 받아서 숫자 두 개가 일치하는지 확인
		 */
		/*public static void method2() {
		 * if문 활용 문자 값 2개를 받아서 문자 두개가 일치하는지 확인
		/*Scanner sc = new Scanner(System.in);
		int num 1= sc.nextInt();
		int num 2= sc.nextInt
		같다면 같습니다. 출력하고
		같지 않다면 같지않습니다. 출력하기
		 * 
		 */
public static void method1() {
	Scanner sc = new Scanner(System.in);
	System.out.print("num1값을 입력하시오. : ");
	int num1 = sc.nextInt();
	System.out.print("num2값을 입력하시오. : ");
	
	int num2 = sc.nextInt();
	if(num1==num2) {
		System.out.println("같습니다.");
	}else {
		System.out.println("같지 않습니다.");
	}
}
public static void method2()	{
	Scanner sc = new Scanner(System.in);
	System.out.print("str1값을 입력하시오. : ");
	String str1 = sc.nextLine();
	System.out.print("str2값을 입력하시오. : ");
	String str2 = sc.nextLine();
	
	if(str1.equals(str2)) {
		System.out.println(str1 +"과" + str2 + "는 같습니다.");
	}else {
		System.out.println(str1 +"과" + str2 + "는 같지 않습니다.");
	}
}
public static void method3()	{
	Scanner sc = new Scanner(System.in);
	System.out.println("double1값을 입력하시오. : ");
	double double1 = sc.nextDouble();
	System.out.println("double2값을 입력하시오. : ");
	double double2 = sc.nextDouble();
	
	if(double1==double2) {
		System.out.println(double1+"와"+double2+"는 같습니다.");
	}else{
		System.out.println(double1+"와"+double2+"는 같지 않습니다.");
	}
}
	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();

	}

}
