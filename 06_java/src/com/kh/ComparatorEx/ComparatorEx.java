package com.kh.ComparatorEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//패키지명이나 파일명 한번에 바꾸는 단축키 F2
/*
 * Comparator : 비교하는 객체
메서드
compare(변수명1, 변수명2):두 객체나 변수를 비교해서 정렬 순서를 변경해

 */
public class ComparatorEx {
	public static void main(String[] args) {
		List<String> 단어들 = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
		
		Comparator<String> 길이비교 = Comparator.comparing(String::length);
		
		단어들.sort(길이비교);
		System.out.println("문자열 길이를 기준으로 정렬된 리스트 : "+단어들);
	}
	
}
