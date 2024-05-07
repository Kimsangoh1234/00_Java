package com.kh.oop.method.ex;

public class IceCreamRun {

	public static void main(String[] args) {
		IceCream ice = new IceCream();
		ice.setName("월드콘");
		ice.setSugar(0);
		ice.setMilk(false);
		ice.makeIceCream();
		
		IceCream ice1 = new IceCream("바닐라",1,true);
		ice1.makeIceCream();
		
		IceCream ice2 = new IceCream("월트콘",3,false);
		ice2.makeIceCream();
	}
}
