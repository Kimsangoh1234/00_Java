package com.kh.MapEx;

import java.util.TreeMap;

public class TreeMapPre {
	public static void main(String[] args) {
		/*
	
		 */
		TreeMap <String,String> tm = new TreeMap<>();
		
		String [] keys = {"사과","바나나","오렌지","포도","수박"};
		
		String[]values = {"apple","banana","orange","grape","watermelon"};
		
		for(int i=0; i<keys.length;i++) {
			tm.put(keys[i],values[i]);
		}
		System.out.println(tm);
		System.out.println(tm.get("바나나"));
		System.out.println(tm.size());
		System.out.println(tm.containsKey("포도"));
		System.out.println(tm.containsValue("grape"));
		System.out.println(tm.keySet());
		System.out.println(tm.values());
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		tm.clear();
		System.out.println(tm);
	}
}
