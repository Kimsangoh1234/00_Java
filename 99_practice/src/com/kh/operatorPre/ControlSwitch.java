package com.kh.operatorPre;

import java.util.Scanner;

public class ControlSwitch {
	
public static void practice1() {
	Scanner sc = new Scanner(System.in);
	System.out.println("1부터 12중 하나 입력 : ");
	int month = sc.nextInt();
	
	int daysMonth;
	switch (month) {	
	case 1 :case 3: case 5: case 7: case 8: case 10: case 12:
		daysMonth = 31;
		break;
	case 4 : case 6 :case 9: case 11:
		daysMonth = 30;
		break;
	case 2:
		daysMonth = 28;
		break;
	default :
		System.out.println("존재하지 않는 월입니다.");
		//daysMonth=0;
		return;
	}
}

	public static void main(String[] args) {
		int day =3;
		String dayString;
		
		switch (day) {
		case 1:
			dayString = "일요일";
		case 2:
			dayString = "월요일";
		case 3:
			dayString = "화요일";
		case 4:
			dayString = "수요일";
		default:
			dayString = "잘못된 입력";
			System.out.println("입력한 숫자는 "+ dayString +"입니다.");
		}
		/*
		switch / case
			if문과 비슷하지만 형식이 일정하게 있는 조건 판단문
			
		사용 방법
		switch(입력변수) {
			case 입력값1 : 
		  		실행할 문장
		  		break; // case를 빠져나가기 위한 제어장치
		  		
		  	case 입력값2 :
		  		실행할 문장
		  		break; //만약에 break가 없다면 다음 case를 실행할 것
		  		
			default : //입력변수와 일치하는 값이 없을때 실행되는 옵션
					//선택 사항이며 필요에 따라 생략될 수 있음
					(=else와 비슷한 행위를 진행함
				실행할 문장
				break;
				
				
		사용 방법 2
		case의 경우 다른 번호가 동일한 결과를 갖길 원한다면
		case를 이어서 작성할 수 있음
			case1:case2:case
			System.out.println(케이스 1 2 3에 대한 결과"
			default : 
			systemj.out.println("123이외의 결과")
			
		break; 원하는 case를 만나면 case에 맞는 조건을 실행한 후
		프로그램을 종료하길 원할 때 사용
		case에 관련된 결과를 실행하기 전에 break를 호출하면
		에러가 발생함
		
		break와 return
		break의 경우 switch for문 while문에서 사용
				해당하는 case이외를 종료함
				
		return 어디서든지 사용가능
		 */

	}

}
