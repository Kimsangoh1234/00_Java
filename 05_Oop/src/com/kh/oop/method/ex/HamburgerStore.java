package com.kh.oop.method.ex;

public class HamburgerStore {
	public HamburgerStore() {
		
	}
	public HamburgerStore(String name, int price) {
		this.name=name;
		this.price=price;
	}
	//필드 햄버거 이름 가격
	private String name;
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	private int price;
	
	public void Info() {
		System.out.println("햄버거 이름 : " + name);
		System.out.println("햄버거 가격 : " + price);
	}
	public static void main(String[] args) {
		HamburgerStore hamburger = new HamburgerStore();
		hamburger.setName("불고기버거");
		hamburger.setPrice(2000);
		hamburger.Info();
		
		System.out.println("----------------");
		HamburgerStore hamburger1 = new HamburgerStore("치즈 버거",3000);
		hamburger1.Info();
	}
	//메서드
	//setter
	//getter
	//생성자 : 기본
	//생성자 : 필수 name price
	//main 
	//1.기본생성자 불고기버거 2000
	//2. 
}
