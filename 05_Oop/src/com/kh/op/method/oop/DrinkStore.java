package com.kh.op.method.oop;

import com.kh.oop.basic.Main;

public class DrinkStore {

	private DrinkMaker maker;
	private String location;
	private String name;
	private boolean takeout;
	
	
	public void setMaker(DrinkMaker maker) {
		this.maker = maker;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTakeout(boolean takeout) {
		this.takeout = takeout;
	}
	public DrinkMaker getMaker() {
		return maker;
	}
	public String getLocation() {
		return location;
	}
	public String getName() {
		return name;
	}
	public boolean isTakeout() {
		return takeout;
	}

	public DrinkStore() {
	
	}
	public DrinkStore(DrinkMaker maker, String location, String name,boolean takeout) {
		this.maker=maker;
		this.location=location;
		this.name=name;
		this.takeout=takeout;
		
	}
	public void overDrink() {
		System.out.println("브랜드명 : "+maker);
		System.out.println(location + " "+name+" 에 주문한 정보");
		maker.makeDrink();
		if(takeout) {
			System.out.println("테이크 아웃 주문.");
		}else {
			System.out.println("매장에서 섭취.");
		}
	}
	public static void main(String[] args) {
		DrinkStore drink = new DrinkStore();
		drink.overDrink();
	}
	
}