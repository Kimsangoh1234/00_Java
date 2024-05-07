package com.kh.loop.ex;

import java.util.Scanner;

public class LoopForEX {

			//기본 메서드
			
			//LoopForEx에서 출력하길 원한다면
			//public static void gugudan 으로 static을 추가해준 다음에
			//public static void main(String[] args){
			//	gugudan();
			// }
			//static을 붙이지 않고 출력하길 원한다면
			//출력용 클래스를 만들어서 출력하기 LoopForRun
			public void guguDan() {
				//사용자로부터 숫자를 입력받고 숫자에 해당하는 구구단을 출력하기
				Scanner sc = new Scanner(System.in);
				System.out.println("구구단 세계로 오신 것을 환영합니다.");
				
				while(true)	{
					System.out.println("종료를 원하면 0 입력하기");
					System.out.println("원하는 수를 입력해주세요.");
				int dan = sc.nextInt();
				
				//만약에 숫자 0이 들어오면 프로그램 종료하기
				if(dan==0) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				//받은 수를 for 문 이용해서 출력
				for(int num=1; num<=9; num++)
				
				for(int a= 1; a <=9;a++) {
					System.out.println(dan + "단*"+a+"="+(dan*a));
					
					
				}
				
		}
}
}