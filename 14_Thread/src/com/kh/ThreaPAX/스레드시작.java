package com.kh.ThreaPAX;

public class 스레드시작 {
	public static void main(String[] args) {
		
		for(int i=0;i<2;i++) {
			스레드연습 t = new 스레드연습(i);
			t.start();
		}
		System.out.println("메인종료");
	}
	
}
