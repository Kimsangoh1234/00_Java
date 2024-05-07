package com.kh.IteratorEx;

/*
파일 위치를 가져올 때
동일한 폴더 위치에서 많은 파일을 가져올 때는
* 사용해서 모두 가져오기를 해준다.
 */
import java.util.*;

public class IteratorPre {
	public static void main(String[] args) {
		//100,10,20,30,50,70
		ArrayList<Integer>숫자들 = new ArrayList<>(Arrays.asList(100,10,20,30,50,70));
		//숫자들 추가하는 방법 1탄
		숫자들.add(100);
		숫자들.add(70);
		숫자들.add(10);
		숫자들.add(20);
		숫자들.add(30);
		숫자들.add(50);
		System.out.println(숫자들);
		//숫자들.add(100); add사용
		//숫자를 추가하는 방법 2
		//Arrays.asList(); 
	
		//Iterator 생성
		Iterator<Integer> 반복하기 = 숫자들.iterator();
		while(반복하기.hasNext()) {
			Integer 반복결과 = 반복하기.next();
			System.out.println(반복결과);
		}
	}
}
