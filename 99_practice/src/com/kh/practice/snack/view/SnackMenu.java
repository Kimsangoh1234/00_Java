package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {

	
	//고객이 메뉴를 입력하고 보는 장
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	public void menu() {
		System.out.println("종류 : ");
		String kind = sc.next();
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("맛 : ");
		String flavor =sc.next();
		System.out.println("개수 : ");
		int numOf = sc.nextInt();
		System.out.println("가격 : ");
		int price = sc.nextInt();
		
		System.out.println("저장한 내용을 확인하시겠습니까?(y/n)");
		String answer = sc.next();
		//저장변수
		//equalsIgnoreCase 대소문자 상관없이 두 문자열을 비교하는데 사용
		if(answer.equalsIgnoreCase("Y")){
			
		System.out.println(scr.saveData(kind, name, flavor, numOf, price));
		System.out.println(scr.confirmData());
		}
	}
}
