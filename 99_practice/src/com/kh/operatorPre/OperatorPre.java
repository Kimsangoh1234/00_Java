package com.kh.operatorPre;

import java.util.Scanner;

// 패키지 : 내가 만든 클래스가 들어있는 폴더 위치

// 클래스 : 실행하고자 하는 코드를 작성하는 공간
public class OperatorPre {
	//기본 출력 메서드
	//최종으로 출력하는 메서드가 아니지만 상황에 따라
	//최종 메서드에서 호출에 사용할 수 있는 메서드 중 하나
	//static : 메모리에서 고정
	public static void practice1() {// 모든 사람이 사탕을 골고루 나눠갖기
		//스캐너를 이용해서 키보드로 입력받은 내용을 컴퓨터에 출력
		//System.in 키보드로 입력 받을 수 있게 해주는 출력 시스템
		//Scanner : 키보드로 입력받은 내용을 컴퓨터로 출력
		//기본으로 갖춰져있기는 하지만 라이브러리에서 가져와야하기 때문에
		//import를 이용해서 가지고 옴
		Scanner sc = new Scanner(System.in);
		//스캐너를 불러온 다음에 바로 sc로 스캐너 기능을 불러와도 되긴 하지만
		//System.out.print 를 이용해서 어떤 행동을 진행하고 있는지
		//확인하는 작업을 진행할 것
		//인원 수 입력 받기
		System.out.print("인원 수를 입력하세요 : ");
		int people = sc.nextInt();
		// 사탕 개수 입력 받기
		System.out.print("사탕 개수를 입력하세요 : ");
		int candies = sc.nextInt();
		
		//1인당 나눠줄 사탕 개수 계산
		int getCandies = candies/people;
		
		//나눠주고 남은 사탕 개수 계산
		int reMain = candies%people;
		
		//결과 출력
		System.out.println("참여 인원 : "+people);
		System.out.println("캔디 총 개수 : "+people);
		System.out.println("동일하게 나눠가진 캔디 개수 : "+getCandies);
		System.out.println("남은 캔디 개수 : "+reMain);
	}		
	//이름 학년(숫자만) 반(숫자만) 번호(숫자만) 성별(M/F) 성적(소수점 아래 둘째 자리까지
	public static void practice2() {//키보드로 정보 입력받기 + 남 여 확인
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		//학년 입력 받기
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) :	 ");
		int classNum = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		//성별 입력 받기 String -> char
		//스캐너로 char 값을 입력받고자 할 경우에는
		//charAt을 사용해서 문자열 위치를 읽어오는 작업을 진행해야한다.
		//Scanner ->next _> charAt(숫자만적음)
		//charAt(0) : 맨 앞 글자를 보기
		//charAt(1) : 맨 앞 글자를 보기	
		//charAt(2) : 맨 앞 글자를 보기
		//charAt(3) : 맨 앞 글자를 보기
		//charAt(4) : 맨 앞 글자를 보기
		//charAt() : 맨 앞 글자를 보기
		//charAt(0) : 맨 앞 글자를 보기
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		//성적 입력 받기 (소수점 둘째 자리 까지만 입력받음)
		System.out.println("점수 : ");
		double score = sc.nextDouble();
	
		//전체자리 입력받음
		//성별에 따라 출력 문자열 설정
		//삼항 연산자 출력 문자열 설정
		System.out.println("이름 : "+name);
		System.out.println("반 : "+grade);
		System.out.println("번호 : "+num);
		System.out.println("성별 : "+gender);
		System.out.printf("성적 : %.2f "+score);
		//System.out.println("점수 : "+score);
	}	
		//printf +
		//printf +,
		//printf로 출력할때는 소주점 자리를 지정해줘도 되고
		// 지정해주지 않아도 된다.
		//다만 만약에 소수점 자리 위치를 지정해서 출력하길 원한다면
		
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요. : ");
		int korean = sc.nextInt();
		
		System.out.println("영어 점수를 입력하세요. : ");
		int english = sc.nextInt();
		
		System.out.println("수학 점수를 입력하세요. : ");
		int math = sc.nextInt();
		
		int total = math + english + korean;
		
		double average = (double) total/3.0;

		System.out.println("국어 점수 : "+korean);
		System.out.println("영어 점수 : "+english);
		System.out.println("수학 점수 : "+math);
		System.out.println("토탈 점수 : "+total);
		System.out.println("국어 영어 수학 평균점수 : "+average);
	}
	//2개의 수를 키보드로 입력 받아 입력받은수가 모두같으면 
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수를 입력하세요. :");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 수를 입력하세요. :");
		int num2 = sc.nextInt();
		
		boolean result = num1 != num2;
		System.out.println("num1의 값 : "+num1);
		System.out.println("num2의 값 : "+num2);
		System.out.println("num1 != num2 :"+result);
		
		// == true == 양쪽에 있는 값이 같으면 true
		// 3==5 false라고 표현
		// 5==5 true
		// ! = 양쪽에 있는값이 다르지만 다른게 맞아! true
		// 3 !=5 true라고 표현
		// 3 ! = 3 false라고 표현
		// boolean을 사용해서 표현을함
		
	
	}
	// 실습문제 4번 응용
	//2개의 수를 키보드로 입력 받아 입력 받은수가 모두 다르면 true
	//모두 같으면 false 출력
	//메인 메서드 : 최종으로 실행하는 메서드
	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력하세요 : ");
		int num3 = sc.nextInt();
		System.out.println("두 번째 숫자를 입력하세요 : ");
		int num4 = sc.nextInt();
		System.out.println("세 번째 숫자를 입력하세요 : ");
		int num5 = sc.nextInt();
		//ampersand && and
		// 구분1 && 구분2 = true
		// (true)&&(true) = false
		// (true)&&(true) = false
		// (false)&&(false) = false
		//				num1이랑 num2가 같을때 &&num2랑 num3가 같을때
		
		
		boolean result = (num3 != num4) && (num4 != num5);
		
		//││ Vertical bar or
		//구분 1 or 구분2
		//(true) or (false) = true
		//(false) or (true) = true
		//(true) or (true) = true
		//(false) or (false) = false
		
		boolean isOR = (num3 != num4) || (num4 != num5);
		System.out.println("num3 : "+num3 + ", num4 : "+num4+ ", num5 : "+num5 );
		System.out.println("result : "+result);
		System.out.println("isOR : "+isOR);
	}	
	public static void main(String[] args) {
		//practice1();
		//practice2();
		//practice3();
		//practice4();
		practice5();
	}
	
}
