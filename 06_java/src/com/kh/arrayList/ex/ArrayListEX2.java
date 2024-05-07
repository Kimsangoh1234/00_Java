package com.kh.arrayList.ex;

import java.util.ArrayList;

public class ArrayListEX2 {
		public static void method1() {
			int[]num= {6,4,2,3,5,7,9};
			
			}
		
//기본생성자
	//숫자 정렬하기 Arrays.sort
	//정렬된 내용 출력하기 Arrays.toString
	//num과 abc가 같은지 비교하기 Arryas.copyOf(num,num.length)"
	//num과 abc가 같은지 비교하기 Arrays.donpyOF
	
	public static void method2() {
		ArrayList<String> animal = new ArrayList<>();
		//add 사자 호랑이 고양이 강아지 //단축키 ctrl +alt+↓
		animal.add("사자");
		animal.add("호랑이");
		animal.add("고양이");
		animal.add("강아지");
		//size()동물이 몇 마리 있는지 확인
		System.out.println(animal.size());
		//get으로 동물 확인
		System.out.println("동물 0 : "+animal.get(0));
		System.out.println("동물 1 : "+animal.get(1));
		System.out.println("동물 2 : "+animal.get(2));
		System.out.println("동물 3 : "+animal.get(3));
		//set 고양이 ->토끼로 변경;
		animal.set(2, "토끼로 변경");
		//remove 강아지 삭제
		animal.remove("강아지");
		//for 문을 활용해서 get출력
		for(String name : animal) {
			System.out.println("동물! :" + name);
		}
		//isEmpty()모두 삭제가 됐는지 확인
		System.out.println("모두 이사합니다.");
		System.out.println("동물들이 모두 비어있나요?" + animal.isEmpty());
	}
	public static void method3() {
		ArrayList<String> pizza = new ArrayList<>();
		
		System.out.println("====피자메뉴=====");
		//add 고구마 포테이토 페페로니
		pizza.add("고구마");
		pizza.add("포테이토");
		pizza.add("페페로니");
		//get을 활용해서 출력
		System.out.println("피자0: " +pizza.get(0));
		System.out.println("피자1: " +pizza.get(1));
		System.out.println("피자2: " +pizza.get(2));
		//set활용해서 페페로니 -> 파인애플
		pizza.set(2,"파인애플로 변경");
		//remove 파인애플
		pizza.remove("파인애플");
		
		for(String name : pizza) {
			System.out.println("피자"+name);
		}
		System.out.println("피자가게가 사라졌습니다.");
		pizza.clear();
		System.out.println("메뉴가 모두 삭제됐나요?"+pizza.isEmpty());
		}
	
		//메뉴 모두 삭제 clear()
		
		//메뉴 모두 삭제됐는지 확인 isEmpty()
	public static void main(String[] args) {
		//thod2();
		method3();
	}
}
