package com.kh.arrays.ex;

import java.util.Arrays;

/*
Arrays 
	배열과 관련된 다양한 작업을 쉽게 처리할 수 있도록 도와줌
	정렬, 복사, 비교
메소드
sort() : 배열을 정렬
copyOf() : 배열을 복사해서 똑같은 배열을 만들어줌	
equals() : 두 배열이 똑같은지 비교
fill() : 배열을 모두 지정된 값으로 채우기
toString() : 배열을 문자열로 변경해서 보여줌

asList():배열을 리스트로 변환해서 추가 배열을 수정하지 않고 배열의 내용을 감싸서 보여줌

String[] 배열 = {"사과","바나나"
 * */
public class ArraysEx {
	public static void main(String[] args) {
		//숫자 배열을 생성
		int[] num = {6,4,2,3,5,7,9};
		
		//정렬핫기
		Arrays.sort(num);
		//배열을 오름순으로 정렬한 것을 문자열로 변경해서 출려거
		System.out.println(Arrays.toString(num));
		
		int[] abc = Arrays.copyOf(num, num.length);
		boolean same = Arrays.equals(num, abc);
		System.out.print(same);
		int[] 채우기 = new int[3];
		Arrays.fill(채우기, 6);
		System.out.println();
	}
	
}
