package com.kh.loop.ex;

import java.util.Scanner;

public class LoopWhileEx {
	/*
	public static void method1() {
	Scanner sc = new Scanner(System.in);
	1. 게임하기 2. 수영하기 3.잠자기 4. 프로그램 종료
	int menu
	while(true) {
		System.out.println("~~프로그램 작성");
		Systmm.out.praitln(원하는 프로그램을 입력해주세요 :");
		switch(menu) {
			case 1:
			
			case 4:



	 */
	public static void method1( ) {
		Scanner sc = new Scanner(System.in);
		
	while(true) {
		System.out.println("1.아메리카노 2. 카페라떼 3. 카라멜마끼야또 4. 주문취소");
		System.out.print("원하는 프로그램 번호를 입력해주세요 : ");
		int menu =sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("아메리카노.");
			break;
		case 2:
			System.out.println("카페라떼");
			break;
		case 3:
			System.out.println("카라멜마끼야또");
			break;
		case 4:
			System.out.println("주문취소");
			return;
		default:
			System.out.println("주문을 잘못 했습니다.");
		}
	}
	}
	
	
	public static void kh카페() {
		Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println("kh카페에 오신걸 환영합니다. ^^*"
				+ "원하는 메뉴를 입력해주세요."
				+ "1 아메리카노 2 카페라떼 3 녹차 4 흑당버블티 5 주문취소 \n");
		String menu=sc.next();
	switch(menu) {
	case "1" : case "아메리카노" :
		System.out.println("아메리카노 주문 추가되었습니다.");
		break;
	case "2" : case "카페라떼" :
		System.out.println("카페라떼 주문 추가되었습니다.");
		break;
	case "3" : case "녹차" :
		System.out.println("녹차 주문 추가되었습니다.");
		break;
	case "4" : case "흑당버블티" :
		System.out.println("흑당버블티 주문 추가되었습니다.");
		break;
	case "5" : case "주문취소" :
		System.out.println("주문취소되었습니다.");
		return;
	default:
		System.out.println("잘못된 주문입니다.");
	}

	}
	}
	
	public static void getMoney( ) {
		//커피 10잔 가진돈 300원
		int coffee = 999;
		int money = 300;
		
		//만약에 커피값보다 가진돈이 더많다면 커피를 구매하고
		//커피가 다 소진되면 판매를 중지한다.
		
		while(money>0) {
			System.out.println("돈을 받았으니 커피를 제공");
			//커피가 10잔인데 1잔 제공했다면 -1
			coffee--;
			System.out.println("남은 커피의 양은 "+ coffee +" 잔 입니다.");
			//커피가 모두 소진됐다면 판매를 중지하자
			if(coffee==0 ) {
				System.out.println("커피가 다 소진됐습니다. 판매를 중지합니다.");
				return;
			}
		}
	}
	
	//10번 찍어서 안넘어가는 나무 없습니다.~!
	public static void tree() {
		int hit=0;
		
		while(hit<10) {
			hit++;
			System.out.println("나무를" + hit +"번 찍었습니다");
		if(hit==10 ){
			System.out.println("나무가 넘어갑니다~!!! 성공!!!");
		}
		}
	}
	
	/*
	사용자로부터 1개의 값을 입력받아 1부터 그 숫자까지의 숫자를 모두 출력
	단 입력한 수는 1보다 크거나 같아야함
	만약에 1미만의 숫자가 입력됐다면 1이상의 숫자를 입력해주세요 출력하기
	
	 */
	// 1부터 5까지 숫자를 출력
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1이상의 숫자를 입력해주세요.");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("1이상의 숫자만 입력가능합니다.");
		}else {
			System.out.println("1부터" + num +"까지의 값");
			int abc =1;
			while(abc<=num) {
				System.out.println(abc);
				abc++;
		}

		}
	}
	
	public static void getCoffee() {
		Scanner sc = new Scanner(System.in);
		System.out.print("카페에 오신걸 환영합니다.");
		System.out.println("현재 가지고 있는 금액은 얼마인가요? : ");
		int Coffeeprice=100;
		int money=sc.nextInt();
		
		while(money<Coffeeprice) {
			System.out.println("돈이 부족합니다. "
					+ "커피를 구매하기 위해 더 많은 돈을 넣어주세요.");
			System.out.println("현재 가진 돈을 입력해주세요.");
			money = sc.nextInt();
		}
		System.out.println("커피를 구매했습니다. 거스름돈은"
				+ (money-Coffeeprice) +"입니다.");
		}
	//10000원 이상 돈이 없을 경우 탕수육을 시키지 못하는 예제
	public static void iLovePork() {
		System.out.println("안녕하세요. 탕수육집입니다.");
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 보유하고 있는 금액은 얼마인가요?");
		int money = sc.nextInt();
		int tangsuyuk = 10000;
		
		while(money<tangsuyuk) {
			System.out.println("돈이 부족합니다."
					+ "탕수육을 구매하기 위해는 더 많은 돈을 넣어주세요.");
			System.out.println("현재 가진 돈을 입력해주세요.");
			money = sc.nextInt();
		}	
		System.out.println("주문이 완료되었습니다. 현재 잔액은 "
				+ (money-tangsuyuk)+"원 입니다.");
	
	}
	public static void allNumber() {
		int num=1;
		while(num<=5) {
			System.out.println(num);
			num++;
		}
	}
	/*
	 public 어디서든 접근 가능한 전체공개
	 protect 같은 폴더안에서만 접근가능
	 default 같은 폴더안에서 접근가능
	 private한 class안에서만 접근가능 작성한 공간안에서만 접근가능
	 */
	public static void main(String[] args) {
		//method1();
		//kh카페();
		//getMoney();
		//allNumber();
		//tree();
		method2();
		//getCoffee();
		//iLovePork();
	}

}
