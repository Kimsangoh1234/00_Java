package com.kh.oop.basic;

public class Main {
	
	//생성자 (필수로 값을 넣어야 하거나 초기에 담을 공간을 생성하는 메서드)
	
	public Main() {
		
	}
	public void 쿠키확인() {
		System.out.println("쿠키의 크기는 ");
	}
	
	//내가 만든 파일 중에서 최종적으로 출시할 파일만 실행
	public static void main(String[] args) {
		//public static void practice2() {}
		//무조건 메모리공간에 고정으로 있어야 하지만
		//현재 static이 아니라 담을 공간
		Main main = new Main();
		
		
		Nation 국민 = new Nation();
		국민.name="홍길동";
		국민.age=55;
		국민.male="F";
		국민.number="550101-2345678";
		
		System.out.println("이름 : "+국민.name);
		System.out.println("나이 : "+국민.age);
		System.out.println("성별 : "+국민.male);
		System.out.println("주민번호 :"+국민.number);
		
		국민.speakkorean();
			
		Nation 국민2=new Nation();
		국민2.name = "신짱구";
		국민2.age=5;
		국민2.male="여";
		System.out.println("이름 :"+국민2.name);
		System.out.println("나이 : "+국민2.age);
		
		//홍길도 신짱구 납세의 의무
		국민.납세의의무();
		국민2.납세의의무();
		
		
}
	
	public void practice1() {
		
	}
}