package com.kh.oop.basic;

public class Car {

	
		//필드
		public String color;
		public int speed;
		public String door;
		public String window;
		public String sunRoof;
		public String insurance;
		//생성자 = 필수옵션
		//생성자는 클래스 이름과 똑같아야 합니다.
		//생성자이름 = 클레스 이름= 
		public Car() {
			
		}
		
		public Car(String inputcolor, int inputspeed) {
			this.color=inputcolor;
			this.speed=inputspeed;
		
			
		}
		public void displayIfoInfo() {
			System.out.println("차 정보 :");
			System.out.println("color : "+color);
			System.out.println("speed : "+speed);
		}
		

		//메서드
	public static void main(String[] args) {
	Car orderCar = new Car("white",100);
	orderCar.displayIfoInfo();
	
	Car storecar = new Car("white",100);
	storecar.displayIfoInfo();

	}

}
