package com.kh.AddressEX;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressPre {
	//www.google.com 호스트명과 Ip주소 가져오기
	public static void main(String[] args) {
		try {
			
			InetAddress 구글 = InetAddress.getByName("www.google.com");
			System.out.println("구글 주소 : " + 구글.getHostAddress());
			System.out.println("호스트명 : " + 구글.getHostName());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		// 나의 컴퓨터 이름과 자리번호 확인하기
		//get localhost
		try {
			InetAddress 로컬호스트 = InetAddress.getLocalHost();
			System.out.println("내집주소" + 로컬호스트);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// www.facebook.com 페이스북 호스트이름 호스트주소
		
		// www.instagram.com 인스타그램 호스트이름 호스트주소 검색
		
		
		
		
		
		
	}
}