package com.kh.javaAPIEx;

/*
String : 문자열을 나타내는 클래스
		 문자열을 생성하고 조작하는데 사용
		 
String str = new String(); - String에서 이 방식은 사용하지 않음
String str = "";
 */
public class StringEx {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";
		String str3 = str1+" "+str2;
		System.out.println(str3);
		
		//가비지 컬렉션
		//코딩에서 사용하고 사용되지 않는 것을 자동으로 없애는 것
		//Garbage 쓰레기 -> 사용되지 않아 그럼 필요가없네?
		//버리자!
		String phone = "010";
		phone += "1234-5678";
		System.out.println(phone);

	}

}
