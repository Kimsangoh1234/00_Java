package com.kh.op.method.oop;

public class DrinkMaker {
	private String drinkType;
	public void setDrinkType(String drinkType) {
		this.drinkType = drinkType;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public String getDrinkType() {
		return drinkType;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getTemp() {
		return temp;
	}

	private    int quantity;
	private    int temp;
	
public DrinkMaker() {
	
}
public DrinkMaker(String drinkType, int quantity, int temp) {
	this.drinkType=drinkType;
	this.quantity=quantity;
	this.temp=temp;
}
public void makeDrink() {
	System.out.println("안녕하세요 주문하겠습니다.");
	System.out.println("음료종류 : " + drinkType);
	System.out.println("음로 양 : "+quantity+"잔");
	if(temp<5) {
		System.out.println("차갑게");
	}else if(temp<10) {
		System.out.println("미지근하게");
	}else {
		System.out.println("뜨겁게");
	}
}
public static void main(String[] args) {
	DrinkMaker drink = new DrinkMaker();
	drink.setDrinkType("허브티");
	drink.setQuantity(1);
	drink.setTemp(5);
	drink.makeDrink();
}
}
