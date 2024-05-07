package com.kh.oop.method.ex;

public class CoffeeRun {
	public static void main(String[] args) {
		
		CoffeeMaker coffee1 = new CoffeeMaker();
		coffee1.setCoffeeType("아메리카노");
		coffee1.setSugar(1);
		coffee1.setMilk(false);
		coffee1.makeCoffee();
		System.out.println("------------------");
		
		CoffeeMaker coffee2= new CoffeeMaker("디카페인아메리카노",4,true);
		coffee2.makeCoffee();
	}	
}
