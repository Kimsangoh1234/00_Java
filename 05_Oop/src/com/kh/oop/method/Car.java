package com.kh.oop.method;

public class Car {
	//필드
	public String brand;
	public String model;
	public 	  int year;
	
	//단축팁 ctrl누른채로 변수명에 마우스를 갖다대면 처음 만들어진 변수명의 위치로감
	public Car() {
		
	}
	public Car(String brand, String model, int year) {
		this.brand=brand;
		this.model=model;
		this.year=year;
	}
	//return메서드
	public String getBrand() {
		return brand;
	}
	public String genModel() {
		return model;
	}
	public int getyear() {
		return year;
	}
	public static void main(String[] args) {
	
		
		Car car1 =new Car("toyota", "carmy", 2022);
		
		System.out.println(car1.getBrand() + "  "+ car1.genModel()+ "  "+car1.getyear());
				

	}

}
