package com.kh.oop.method;

public class MethodEx {
	/*
	 메서드
	 클래스 내부에 존재
	 특정 기능을 하는 코드를 묶어서 나타낸것
	 
	 1. 메인메서드
	 자바 프로그램을 시작할 때 사용하는 메서드
	 작성한 메서드나 변수를 호출해서 최종으로 실행하는 메서더
	 public static void main(String[] args) {
	 
	 }
	3. 생성자메서드
	 생성자는 메서드라는 이름을 붙여서 많이 사용하지는 않니잠 
	 3. void메서드
	 반환하는 값이 없는 메서드
	 매서드가 실행은 되지만 실행 후 어떤 값도 반환하지 않음
	 1) 매개변수가 없는 void메서드
	 1)매ㅐㅕ        
	 4. return메서드
	 
	 값을 반환하는 메서드
	 메서드가 실행되며 결과를 반환하고,
	 메서드를 호출한 곳에 봔환된 값을 제공
	 public method(자료형 매개변수){
	 		return 자료형에 해당하는 변수명;
	 
	 }
	 
	 1)return 값이 string일 때
	 public String method(String str){
	 	retrun str;
	 	
	 2) return 값이 int일 때
	 public int method(int num)	{
	 	int abc = num;
	 	return abc;
	 	
	3) return 값이 필드에 있을때
	
	 */
	public int a;
	public int b;
	
	public void 숫자합1번(int a, int b) {
		int 합의결과 = a+b;
		System.out.println("숫자합은 :" +합의결과+"입니다.");
	}
	public int 숫자합2번(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		MethodEx set = new MethodEx();
		set.숫자합1번(5, 3);
		
		int 결과 = set.숫자합2번(7, 4);
		
		//숫자합2번을 통해서 계산을 하고 계산한 값을 결과라는 변수명에
		//넣어준 것
		System.out.println("결과는 : "+결과);
	}

}
