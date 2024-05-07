package com.kh.example.practice2.run;

public class Product {

//필드
	public String pName;
	public String getpName() {
		return pName;
	}

	public int getPrice() {
		return price;
	}

	public String getBrand() {
		return brand;
	}
	public int price;
	public String brand;
	
	public void setpName(String pName) {
		this.pName = pName;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Product() {
		
	}
	
	public void Info() {
		System.out.println("물품이름 : "+pName);
		System.out.println("물품가격 : "+price);
		System.out.println("물품브랜드 : "+brand);
	}
	public static void main(String[] args) {
		Product product1 = new Product();
		product1.Info();
	}
}
