package com.kh.oop.constructor;

public class Cafe {
	//필드 선언
		//카페 이름 지역 테이블수
	public String name;
	public String location;
	public 	  int tableNum;
	
	//기본 생성자와 필수 생성자
	public Cafe( ) {
		
	}
	public Cafe(String name, String location, int tableNum) {
		this.name=name;
		this.location=location;
		this.tableNum=tableNum;
	}
	public void CafeInfo() {
		System.out.println("이름 : "+name	);
		System.out.println("위치 : "+location);
		System.out.println("테이블 갯수 : "+tableNum);
		System.out.println("---------------");
	}
	public static void main(String[] args) {
		System.out.println("안녕하세요.kh민족입니다.");
		System.out.println("=== 카페 조회하기 ===");

		Cafe 카페1 = new Cafe();
		카페1.name="감성카페";
		카페1.tableNum=8;
		카페1.CafeInfo();
		
		Cafe 카페2 = new Cafe();
		카페2.location="성수";
		카페2.tableNum=6;
		카페2.CafeInfo();
		
		Cafe 카페3 = new Cafe("메가커피", "장안동", 9);
		카페3.CafeInfo();
	}

}
