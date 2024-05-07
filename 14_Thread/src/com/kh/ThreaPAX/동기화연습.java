package com.kh.ThreaPAX;

public class 동기화연습 {
	private static int 숫자 = 0;
	public static void main(String[] args) {
		Thread thread = new Thread();
		for(int i=0; i<8; i++) {
			Thread t = new Thread(() -> {
				synchronized(동기화연습.class) {
					숫자++;
					System.out.println("숫자 : "+숫자);
				}
			
			});
			t.start();
		}
	}
	
}
