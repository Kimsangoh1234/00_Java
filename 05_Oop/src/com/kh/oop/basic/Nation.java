package com.kh.oop.basic;

public class Nation {

	public String name;
	public int age;
	public String male;
	public String number;
	 
public void speakkorean() {
	System.out.println("이름 : "+name);
}
	public void 납세의의무() {
		if( age >= 19) {
			System.out.println(name+"님은 세금 납부 대상자입니다.");
		}else {
			System.out.println(name+"님은 미성년자로 세금 납부 대상자가 아닙니다.");
		}
	}
}












