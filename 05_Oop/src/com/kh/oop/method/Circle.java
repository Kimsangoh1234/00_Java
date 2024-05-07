package com.kh.oop.method;

public class Circle {
//필드
	private double pi=3.14;
	private int radius=1;
	
	public void setPi(double pi) {
		this.pi = pi;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	//Setter Getter
	public double getPi() {
		return pi;
	}
	public int getRadius() {
		return radius;
	}
	
	//생성자 : 기본
	public Circle() {
		
	}
	public void incrementRadius() {
		radius++;
	}
	public void getAreaOfCircle() {
		double area=pi*radius*radius;
		System.out.println("원의 넓이 : "+area);
	}
	public void getSizeOfCircle() {
		double size = 2*pi*radius;
		System.out.println("원의 둘레 : "+size);
	}
	public static void main(String[] args) {
		Circle 원 =new Circle();
		
		//1씩 증가하기 전에 원의 둘레와 넓이 출력하기
		System.out.println("원의 초기 둘레와 넓이");
		원.getSizeOfCircle();
		원.getAreaOfCircle();
		//반지름 원이 1씩 증가한다면
		원.incrementRadius();
		System.out.println("반지름 1증가 후 원의 둘레와 넓이");
		원.getSizeOfCircle();
		원.getAreaOfCircle();
	}
}

