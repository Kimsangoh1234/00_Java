package com.kh.loop.ex;

import java.util.Random;
import java.util.Scanner;

public class LoopForEX2 {

	public void gugudan2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("거꾸로 세계에 오신 것을 환영합니다.");
	while(true) {
		System.out.println("종료를 원할 경우 0을 입력하기");
		System.out.println("원하는 수를 입력하세요.");
		int dan= sc.nextInt();
		
		if(dan==0) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}	
		if(dan <1 || dan>9) {
			System.out.println("1부터 9까지의 숫자를 입력해주세요.");
			continue;
		}
		//continue 자주 사용되지 않음
		for (int a=9; a>=1; a--) {
			System.out.println(dan+"*"+a+"="+(a*dan));
		}
		//1. 스캐너로 구구단 값 입력받기
		//2. int dan = sc.nextInt();
		//3. for 문을 활용해서 9번부터 1번까지 출력하기
		//	for (int a=1;	조건	;	a--) {
		// System.out.println(거꾸로 출력하기);
		// }
		
		//4. 종료를 원할 경우 0을 입력해주면 종료하기 while문 추가하기
	}
}
	public void gugudan3() {
		//구구단을 1단부터 9단까지 모두출력
		for(int dan=1 ; dan<=9; dan++) {
			for(int num=1; num<=9; num++) {
				System.out.println(dan + "*"+ num+"="+(dan*num));
			}
		}
	}
	 public void gugudan4() {
		 for(int dan=2; dan<=9; dan++) {
			 for(int num=1; num<=9; num++) {
				 System.out.println(dan+"*"+num+"="+(dan*num));
			 }
			 
		 }
		 
		}
	 //10개의 숫자 출력하기 랜덤으로
	 public void randomNumber() {
	
		 Random 랜덤 = new Random();
		//Random 불럴와서 내가 지정한 범위에서 숫자를 랜덤으로 출력하기
		 int 랜덤숫자 = 랜덤.nextInt(5);//0~4사이에 숫자가나옴
		 //nextInt()안에 숫자를 넣어서 어디서부터 어디사이에 랜덤으로 숫자가 나와야 하는지
		 //범위를 지정할 수 있음
		 //랜덤으로 지정한 숫자 -1
		 System.out.println("랜덤숫자 :" + 랜덤숫자);
	 }
		//랜덤으로 숫자 3개 출력하기
	 public void randomFor() {
		 //Random 호출하기
		 Random ran = new Random();
		 //랜덤숫자 3개 출력 1~10 사이의 숫자
		 
		 for(int num=1; num <=3; num++) {
			 //랜덤으로 숫자를 만들어주기
			 //					10을 적어주면 0~9
			 //					10+1		1~10
			 int randomNumber = ran.nextInt(10)+1;
			 System.out.println("랜덤숫자 "+num+" : "+randomNumber);
		 }
	 }
	 /*
	 public void randomFor2(){
	 
	 		//랜덤으로 1~45 번호 6자리 for 문 출력
	 }
	  */
	public void randomFor2() {
		Random ran = new Random();
		for(int num=1; num<=6; num++) {
			int randomNumber = ran.nextInt(45)+1;
			//if 랜덤 숫자가 같다면 번호를 제외하고 출력하기
			System.out.println("랜덤숫자"+num+":"+randomNumber);
		}
	}
		
		
		
		
		
	}
