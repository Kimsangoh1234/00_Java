package com.kh.MapEx;

import java.util.HashMap;
import java.util.Map;

public class MapPre {
	//기본생성자 ctrl space enter
	public MapPre() {
	}
	public void practice1() {
		Map<Integer,String> map = new HashMap<>();
		map.put(2, "에그마요");
		map.put(3, "로티세리바베큐");
		map.put(1, "스파이쉬림프");
		System.out.println(map);
	}
	public void practice2() {
		Map<String, String> map = new HashMap<String,String>();
		map.put("학원", "서울시 강남구");
		map.put("등산", "서울시 관악구");
		map.put("롯데타워","서울시 송파구");
		System.out.println(map);
		System.out.println(map.get("롯데타워"));
		map.remove("등산");
		System.out.println(map);
		for(String 목록 : map.keySet()) {
			String 명칭 = map.get(목록);
			System.out.println("Value : " + 목록);
		}
	}
	public void practice3() {
		//특정 값이 존재하는지 확인
		//String Integer 과일 - 가격
		Map<String, Integer>map = new HashMap<>();
		map.put("사과", 100);
		map.put("바나나",200);
		map.put("체리", 300);
		
		System.out.println("200원 과일이 존재하는가? "+map.containsKey("체리"));
		
		System.out.println("현재 map의 크기" + map.size());
	}
	public void practice4() {
		//put을 이용해서 1-에그마요 2-로티세리바베큐 3-스테이크앤치즈 4-스파이시취림프
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "에그마요");
		map.put(2, "로티세리바베큐");
		map.put(3, "스테이크앤치즈");
		map.put(4, "스파이시쉬림프");
		System.out.println(map);
		System.out.println(map.get(3));
		System.out.println(map.size());
		map.remove(4);
		System.out.println(map);
		System.out.println(map.isEmpty());
		for(Integer num : map.keySet()) {
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		MapPre mp = new MapPre();
		mp.practice2();
		mp.practice3();
		mp.practice4();
	}
	
}
