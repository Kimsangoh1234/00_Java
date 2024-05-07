package com.kh.hw.person.view;

import java.util.Scanner;

public class PersonMenu {
	//사용자한테 숫자를 입력받고
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		while(true) {
			System.out.println("===메인메뉴===");
			System.out.println("1. 학생 메뉴");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴선택  : ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				//학생 메뉴
				//break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
	}
		public void studentMenu() {
			while(true) {
				
			}
		}
	//학생을 추가하거나 조회할 것

}
