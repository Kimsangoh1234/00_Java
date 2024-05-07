package com.kh.javaAPIEx;
/*
 
 String: 변할 수 없음;
 문자나 문자열을 사용할 때 사용 후 변수명에 다른값을 넣어주는 것이지
  
 StringBuffer : 여러 쓰레드에서 동시에 사용되어도 안전하게 작업을 처리(동기화)
 StringBuilder : 하나의 쓰레드에서 사용하는 것이 효율(비동기, 추천)
 
 Thread : 컴퓨터 내에서 실행되는 독립적인 실행 흐름
 동기 : 요청과 결과가 동시에 일어난 것을 이야기함
 비둘기 : 요청과 결과가 한자리에서 동시에 일어나지 않음
 */
public class BufferBuilder {
	public static void main(String[] args) {
		//1.String Buefffer
		StringBuffer buffer = new StringBuffer();
		buffer.append("Hello");
		buffer.append("World");
		
		//2. String Builder
		StringBuilder builder = new StringBuilder();
		builder.append("Hello");
		builder.append("World");
		System.out.println(builder.toString());
	}

}
