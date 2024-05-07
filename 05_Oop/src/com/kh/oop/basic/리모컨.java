package com.kh.oop.basic;

public class 리모컨 {

	//1.필드
	public boolean powerOn; //전원 상태
	public int voloume; 
	
	//2.생성자(공간 생성자. 필수 생성자)
	public 리모컨() {
		
	}
	public 리모컨(int vol) {
	this.voloume=vol;
}
	
	public void 상태(){
	System.out.println("음량 : "+ voloume);	
	}
	
	//최종 출력할 메인 메서드를 만들어서
	//리모컨 음량을 200으로 만들어서 음량이 200이 맞는지 확인하기

public static void main(String[] args) {
	리모컨 rmc = new 리모컨();
	rmc.powerOn=true;
	rmc.voloume=100;
	System.out.println("리모컨의 전원은 "+ rmc.powerOn+"이고,"
			+"볼륨은"+rmc.voloume+"입니다.");
	리모컨 orderRmc = new 리모컨(200);
	orderRmc.상태();
	
	
}
}
