package com.kh.oop.method;

public class PizzaStore {
	public PizzaStore() {
		
	}

	private int pizzaPrice;
	private String pizzaName;
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	public void setPizzaPrice(int pizzaPrice) {
		this.pizzaPrice = pizzaPrice;
	}
	public String getPizzaName() {
		return pizzaName;
	}
	public int getPizzaPrice() {
		return pizzaPrice;
	}
	//메서드 : 생산자 : 필수 피자의 이름 가격
	public PizzaStore(String pizzaName, int pizzaPrice) {
		this.pizzaName=pizzaName;
		this.pizzaPrice=pizzaPrice;
		
	}
	public void inforpisza() {
		System.out.println("피자이름 : "+pizzaName);
		System.out.println("피자가격 : "+pizzaPrice);
	}
	public static void main(String[] args) {
		PizzaStore pizza1 = new PizzaStore("페퍼로니 피자",12000);
		pizza1.inforpisza();
		
		System.out.println("----------------");
		
		PizzaStore pizza2 = new PizzaStore("치즈 피자",13000);
		pizza2.inforpisza();
	}
}

