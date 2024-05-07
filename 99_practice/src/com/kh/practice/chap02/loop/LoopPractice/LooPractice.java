package com.kh.practice.chap02.loop.LoopPractice;

import java.util.Scanner;

public class LooPractice {
//Geeting : 안녕하세요 인사를 출력하는 메서드
	//1미만의 숫자가 입력됐다면
			//1이상의 숫자를 입력해주세요
			//다시 사용자가 값을 입력하도록 하기
	public void practice2() {
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("1이상의 숫자를 입력하세요.");
		}else {
			break;
		}System.out.println("1부터" + num + "까지의 숫자들");
		int i =1;
		while(i<=num) {
			System.out.println(i+"");
		++i;
		}
		System.out.println();
	}
}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("**** practice 3 시작****");
		while(true) {
			System.out.println("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			if(num<1) {
				System.out.println("1이상의 숫자를 다시 입력해주세요");
			}else {
				break;
			}
		}System.out.println(num + " 부터 1까지의 숫자들을 거꾸로 출력합니다.");
		while(num>=1) {
			System.out.println(num + " ");
			num--;
		}
		System.out.println();
	}
	public void Geeting( ) {
		System.out.println("안녕하세요.");
	}
	public void Geeting2() {
		System.out.println("반갑습니다.");
	}
	public void practice12() {
	}}
