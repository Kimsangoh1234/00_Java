package com.kh.variable.pre;

public class EnumPre {
	public enum Enume {
		빨강, 주황, 노랑, 초록, 파랑, 남색, 보라
		// enum으로 소비자{학생, 직장인, 연장자}
		// enum으로 판매자{소매업,도매업,중매업}
	}

	public enum 소비자 {
		학생, 직장인, 연장자
	}

	public enum 판매자 {
		소매업, 도매업, 중매업
	}

	public void 메서드2() {
		System.out.println("===소비자====");
		소비자[]소비자들 = 소비자.values();
		for(소비자 소 : 소비자들) {
			System.out.println(소);
		}
		
		System.out.println("=== 판매자 ===");
		판매자[] 판매자들 = 판매자.values();
		for(판매자 판 : 판매자들) {
			System.out.println(판);
		}
		소비자 c = 소비자.학생;
		System.out.println("소비자의 등급 : 0");
		판매자 s = 판매자.소매업;
		System.out.println("판매자의 등급 : 0");
		if(c.ordinal()>s.ordinal()) {
			System.out.println("소비자의 등급이 더 높습니다.");
		}else if(c.ordinal()==s.ordinal()) {
			System.out.println("소비자와 판매자의 등급이 같습니다.");
		}else if(c.ordinal()<s.ordinal()) {
			System.out.println("판매자의 등급이 더 높습니다.");
		}
		//void 메서드 2를 만들어서 소비자와 판매자를 for-each 사용해서 각각 출력
		//소비자 학생 판매자 소매업 ordinal() if문 사용해서 비교하는 문장을 메서드 2작성
	}
//enum 무지개 {빨강~보라}

	public static void main(String[] args) {
		EnumPre ep = new EnumPre();
		ep.메서드2();

	}

	// main
	// 빨~보 출력

	// 장바구니 = 배열에 담기
	// enum 밑에있는 메서드

}
