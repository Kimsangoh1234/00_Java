package com.kh.LambdaEx;
/*
람다식(Lambda)
클래스식으로 구분해서 만드는 함수를 하나의 식으로 표현한 것
메서드의 이름이 필요없기 때문에 이름이 없어서 익명 함수

기존에 작성하던 방식
		  void return
			└──┘
			 |
public 		반환타임 		메서드명(매개변수){
		실행문
}

람다 방식
(매개변수 목록) -> {실행될 코드 블록}
(         ) -> "  ";
(         ) -> {  };
예시
public String Hello(){
	return "World";
}

람다식
() -> "  ";

람다식의 장점 : 코드를 간단하게 만들 수 있음
람다식의 단점 : 람다식이 너무 많아지면 코드 사용의 구분이 어려움

:::


 */
public class LambdaEx {
	private static int 숫자=0;
	
	public void 람다스레드() {
		for(int i=0; i<5; i++) {
			Thread t=new Thread(() -> {
				synchronized(LambdaEx.class) {
					숫자++;
					System.out.println("숫자 : "+숫자);
				}
			});
			t.start();
		}
	}
	}
