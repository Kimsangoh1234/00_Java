package com.kh.loop.ex;

public class LoopFor {
	public static void practice3() {
		System.out.println("===== for문 3번 =====");
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		System.out.println("===== for문 3번 =====");
	}
	public static void practice4() {
		System.out.print("===== for문 4번 =====");
		for(int num=2; num<=10; num+=2) {
			System.out.println("num의 값은 : "+num);
		}
		System.out.println("===== for문 4번 =====");
	}
public static void practice5() {
	int dan = 5;
	for(int i=1; i <= 9; i++) {
		System.out.println(dan +"단 *"+ i + "=" + (dan*i));
	}
}
public static void practice6() {
	System.out.println("===== for 6번 =====");
	//구구단에서 3단을 9번까지 출력하기
	int dandan = 3;
	for(int i=1; i <=9; i++) {
		System.out.println(dandan +"단*" +i + "=" +(dandan*i));
	}
	//처음 3*1 =3 마지막은 3*9=27
	//int dandan = 3;
	//int num = 1;
}
public static void gugudan6() {
	
}

	public static void main(String[] args) {
		//practice3();
		//practice4();
		//practice5();
		practice6();
		//int i=1;
		
		/*
		 for(초기 식의 값이기 때문에 i라고 작성을 해줄 수 없음
		 무조건 
		 for( 지정값 변수명 = 변수의 초기숫자; 조건; 증감식)
		 작성해줘야 함
		 for(  i  ;  2  <=2 ; i++) {
		 		System.out.println("i의 값 : " +i);
		 * 
		 */
		//int값을 num=1 로 준 후 
		//num의 값이 1부터 5까지 나오도록 출력
		/*
		for문 : 끝이 정해진 반복을 진행할 때 사용하는 제어문
		특정 조건을 만족하는 동안 { } 코드 블록을 반복해서 실행
		반복 횟수가 일정하게 정해진 경우 많이 사용
		
		사용 예제
		for (초기식 ; 조건식 ; 증감식) {
		
			//조건이 맞을 경우 반복해서 실행될 코드 블록
		}
		
		//for문에서 조건이 맞지 않으면 for문을 탈출
		for~each문
		배열이나 반복 가능한 모든 값에 대해 반복적으로 작업할 때 사용하는 편리한 반복문
		조건이 반복이 처음부터 끝까지 모두 반복 
		
		사용 예제
		
		for(자료형 변수명생성) : 반복해서 보여주고자 하는 변수명 ) {
			//실행하고자 하는 작업 작성
			System.out.println(생성된 변수명 작성);
		
		}
		 
		 
		 
		 
		 
		 
		 */
		// for 끝이 정해져 있는 반복을 진행할때
		//(for 처음으로 지정한 숫자 ; 언제끝날거야? ; 조건이뭐야) {
		//처음부터 숫자가 끝날때까지 실행하는 공간
	}
}
