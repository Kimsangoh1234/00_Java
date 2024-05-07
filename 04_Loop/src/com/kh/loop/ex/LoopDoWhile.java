package com.kh.loop.ex;

public class LoopDoWhile {
	/*
	do-While : do에서 while조건에 상관없이 무조건 한번은 실행 
			 조건이 false 여도 최초 1회는 무조건 실행
	 사용 예제 : 
	do {
		수행될 문장;
	}while(조건식);
	
	
	
	 */
	public static void main(String[] args) {
		int count =1;
		
		do {
			System.out.println("숫자값 : "+count);
			count++;
		}while(count <=5);
	}
}
