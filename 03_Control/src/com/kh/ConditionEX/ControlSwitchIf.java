package com.kh.ConditionEX;

import java.util.Scanner;

public class ControlSwitchIf {
	
	public static void takeAtaxi( ) {
		//입력받은 돈이 3000원 이상일 경우에만 택시를 탈 것인지 물어볼 것
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 보유하고 있는 금액을 입력하세요 : ");
		int money = sc.nextInt();
		//if 문을 사용해서 금액이 3000원 이상일 경우에만 물어보는 코드를 작성 해줄 것
		if(money>=3000) {
			System.out.println("택시를 탈까요? (예/아니오)");
			String answer = sc.next();
		//answer로 받은 대답에 따라 응답을 처리하기
		switch(answer) {
		case "예" :
			System.out.println("택시를 탔습니다.");
			break;
		case "아니오" :
			System.out.println("택시를 타지 않았습니다.");
			break;
		default:
			System.out.println("잘못된 입력이 아닙니다.");
		
			
		}
		}else {
			System.out.println("3000원 이하이므로 잔액이 부족합니다.");
		}
		
	}
	/*
	 * 사용자로부터 점수를 입력받아 성적 등급을 판별하는 프로그램 작성
	 * 90이상일 경우 A 확정
	 * 80이상일 경우 B 학점
	 * 70이상일 경우 C 학점
	 * 60이상일 경우 D 학점
	 * 60미만일 경우 F 학점
	 *  ->F 학점일 때 재수강 하시겠습니까? (YES / NO)
	 * 만약에 YES NO 이외의 값이 나올 수 있기 때문에
	 *  case YES : case yes:
	 */
	
	/*public static void whatDay
	 *월 수 금 : 헬스
	 *화 목 : 공부
	 *토 일 : 주말인데 집에서 쉴 예정입니까? (예/아니오)
	 *만약에 집에서 쉴 예정이면 네 집에서 쉴 예정입니다.
	 *		아니오 선택하면 어떤 활동을 할 예정인지 선택해주세요.
	 *			활동 1. 등산 2. 독서 3. 수영 선택할 수 있게 만들어줌
	 */	
	public static void whyScore() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해주세요. : ");
		int score = sc.nextInt();
		
		if(score>=90) {
			System.out.println("당신은 A학점입니다.");
		}else if(score>=80) {
			System.out.println("당신은 B학점입니다.");
		}else if(score>=70) {
			System.out.println("당신은 C학점입니다.");
		}else if(score>=60) {
			System.out.println("당신은 D학점입니다.");
		}else if(score<60)	{
			System.out.print("당신은 F학점입니다. 재수강 하시겠습니까?(예/아니오)");
			String reScore = sc.next();
			switch(reScore) {
			case "예" :
				System.out.println("재수강 하겠습니다.");
				break;
			case "아니오" :
				System.out.println("재수강 안하겠습니다.");
				break;
			}
		}
		
	}
	public static void whatDay( ) {
		Scanner sc = new Scanner(System.in);
		System.out.print("무슨 요일인지 입력하세요. : ");
		String day = sc.next();
		
		String result;
		switch(day) {
			case "월" : case "수" : case "금" :
				result ="당신이 헬스하는 날입니다.";
				break;
				
			case "화" : case "목" :
				result="당신이 공부하는 날입니다.";
				break;
				
			case "토" : case "일" :
				System.out.print("주말인데 집에서 쉴 예정입니까? (예/아니오) : ");
				String answer = sc.next();
				
				switch(answer) {
					case "예" :
						result="집에서 쉽니다.";
						break;
					case "아니오" :
						System.out.print("어떤 활동을 할 예정인가요? (1.등산 2.독서 3.수영) : ");
						int active = sc.nextInt();
						switch(active) {
							case 1:
								result="등산";
								break;
							case 2 :
								result="독서";
								break;
							case 3 :
								result="수영";
								break;
							default :
								System.out.println("잘못된 입력");
								return;
						}
						return;
					
				}
			default:
				System.out.println("잘못된 입력");
				return;
				
			}
		System.out.println(result + "를 합니다.");
	}
	public static void main(String[] args) {
		//takeAtaxi();
		//whyScore();
		whatDay();
	}

}
