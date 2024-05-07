package com.kh.array;

import java.util.Scanner;

public class ArrayEx2 {

	public static void practice2() {
		int numbers1[]=new int[10];
		
		System.out.println("길이 : "+numbers1.length);
		for(int i=0; i<numbers1.length;i++) {
			numbers1[i]=numbers1.length-i;
			System.out.print(numbers1[i]+" ");
	}
	}
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요. : ");
		int size = sc.nextInt();
		
		int[]numbers=new int[size];
		
		for(int i=0;i<size;i++) {
			numbers[i]=i+1;
			System.out.print(numbers[i]+" ");
		}
		
	}
	public static void practice4() {
		String[] fruits = {"사과","귤","포도","복숭아","참외"};
		System.out.println(fruits[1]);
	}
	public static void practice6() {
						//lenght 7
				//index 0	1	2	3	4	5	6
		String[]week = {"월","화","수","목","금","토","일"};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0부터 6까지의 숫자 입력받기 : ");
		int num = sc.nextInt();
		
		//입력한 숫자가 0~6 사이에 있는지 확인 후 사이에 있다면 요일 출력
		if(num>=0 && num<=6) {
			System.out.println(week[num] + "요일");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		}
	
	public static void practice7() {
		//길이가 7인 배열을 생성
		int num[]=new int[7]; //0 1 2 3 4 5 6 length:7
							//num의 최종 길이를 알기 ㅜ이해서 num.lengh
		
		//랜덤으로 숫자 랜덤으로 숫자 출력하기
		//랜덤으로 숫자 출력하는 방법
		// 1. Random 객체 사용 : 조금 더 넓은 범위로 랜덤을 사용
		//2. Math 객체에서 random() 메서드 사용 : 위 Random객체보다 작은 범위로 사용 가능
		
		for(int i = 0; i<num.length; i++) {
			num[i] = (int)(Math.random() * 45); //45 0~44 -> 1~45
			System.out.println("num["+i+"] =" +num[i]);
		}
		
		}
	public static void practice8() {
		//정수 0 1 2 10 20 30 출력하기
		int[] num = new int[3];
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		num[0]=10;
		num[1]=20;
		num[2]=30;
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		//num[1]=
		//문자열 각 자리에 월 화 수 목 금 토 일 각 자리에 어떤 요일이 들어가있는지 출력
		
		//실수 index 2까지 만들어주고 출력 실수 자
		//문자 'A' 'B' 'C'
		//char chr = new chr;
	}
	public static void practice17() {
		//입력한 값이 배열에 있는지 검색
		//있으면 치킨 배달 가능 없으면 없는 치킨입니다. 출력
		
		String[] chickenMenu= {"양념치킨","후라이드치킨","간장치킨"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("치킨 이름을 입력하세요 : ");
		String inputChic = sc.next();
		
		//배열에 사용자가 입력한 치킨이 있는지 검색
		boolean found = false;
		
		//for - each 문을 사용해서 치킨이 있는지 확인하는 작업
		// 만약에 치킨이 존재한다면 found = true; break;
		for(String 치킨 : chickenMenu) {
			//System.out.println(치킨);
			if(치킨.equals(inputChic)) {
				found=true;
				break;
			}
		}
		//만약에 치킨이 존재한다면 배달가능 출력
		if(found) {
			System.out.println(inputChic + "은 배달 가능!합니다.");
		}else {
			System.out.println(inputChic + "은/(는) 없는 메뉴입니다.");
		}
		//존재하지 않는다면 ㅇㅇ치킨은 없는 메뉴입니다. 
		//for(자료형 변수명생성) : 반복해서 보여주고자 하는 변수명 ) {
			//실행하고자 하는 작업 작성
			//System.out.println(생성된 변수명 작성);
	}
	public static void main(String[] args) {
		//practice2();
		//practice3();
		//practice4();
		//practice6();
		practice7();
		//practice8();
		//practice17();
		//for 문을 활용한 배열 출력하기
		//int numbers[] = new int[10];
		
		//1부터 4까지 배열에 숫자를 넣기
		//index 0부터 시작하기 때문에 =0
		//lenght = 길이
		//System.out.println("최대길이 : "+numbers.length);
		//for(int i=0; i<numbers.length;i++) {
			//numbers[i]=i+1;
			//System.out.print(numbers[i]+" ");
		}
			
	}
	

