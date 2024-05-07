package com.kh.oop.basic;

public class Bank {
	// 이름, 계좌번호 잔액 비밀번호 마케팅수신동의
	public String name;
	public String accountNumber;
	public    int balance;
	public String Password;
	public boolean agree;
	
	//생성자 메서드
	//1. 필수가 아닌 생성자 = 클래스명 같아야함
	public Bank() {
		
		
		
		
	}
	//2. 필수인 생성자 이름 계좌번호 잔액 패스워드
	public Bank(String 이름,String 계좌번호,int 잔액, String 비밀번호) {
		this.name=이름;
		this.accountNumber=계좌번호;
		this.balance=잔액;
		this.Password=비밀번호;
	
	}
	//3. 출력 생성자
	public void info() {
		System.out.println("이름 : "+name);
		System.out.println("계좌번호 : "+accountNumber);
		System.out.println("잔액 : "+balance);
		System.out.println("비밀번호 : "+Password);
		System.out.println("마케팅수신동의 : "+agree);
	}
	//4.최종 메인 출력 메서드
	public static void main(String[] args) {
		Bank customer1 = new Bank("jor","11-222-3333",123,"0000");
		customer1.info();
		
		Bank customer2 = new Bank("dan","110-110-1234",100,"1234");
		customer2.info();
		
		Bank customer3 = new Bank("마이클","111-252-6978",300,"8459");
		customer3.agree=true;
		customer3.info();
	}
	//필수 생성자를 활용해서 마이클 씨의 은행 통장
	//이름 계쫘번호 잔액 비밀번호를 입력하고 
	//마케팅 수신동의를 true 변경해서 출력하기
}
