package com.kh.oop.method.ex;

//커피만들기
public class CoffeeMaker {
	//필드
	private String coffeeType;
	private int sugar;
	private boolean milk;
	public void setCoffeeType(String coffeeType) {
		this.coffeeType = coffeeType;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	//getter - boolean 같은 경우 get이 아니라 is로 표기
	public String getCoffeeType() {
		return coffeeType;
	}
	public int getSugar() {
		return sugar;
	}
	public boolean isMilk() {
		return milk;
	}
	
//메서드
	//setter
	//getter
	//생성자 : 기본
	public CoffeeMaker() {
		
	}
	public CoffeeMaker(String coffeeType, int sugar, boolean milk) {
		this.coffeeType=coffeeType;
		this.sugar=sugar;
		this.milk=milk;
	}
	public void makeCoffee() {
		System.out.println("커피를 제공합니다.");
		System.out.println("종류 : "+coffeeType);
		System.out.println("설탕 : "+sugar+"g");
		if(milk) {
			System.out.println("우유가 들어가있습니다.");
		}else {
			System.out.println("우유가 들어가 있지 않습니다.");
		}
		System.out.println("커피가 준비되었습니다.");
	}
	
	public static void main(String[] args) {
		CoffeeMaker coffee1 = new CoffeeMaker();
		coffee1.setCoffeeType("아메리카노");
		coffee1.setSugar(1);
		coffee1.setMilk(false);
		coffee1.makeCoffee();
		System.out.println("-------------");
		
		CoffeeMaker coffee2 = new CoffeeMaker("디카페인아메리카노",5,false);
		coffee2.makeCoffee();
		
	}
	//생성자 : 필수
	//void
	
}
