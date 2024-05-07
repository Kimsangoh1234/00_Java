package com.kh.operatorPre;

import java.util.Scanner;

public class SwitchIfPre {
	//표기법 - 코드를 작성할 때 개발자 사이에 있는 코드를 명확하게 보여주기 위해 작성하는 방법
	//스네이크 케이스 - 변수명에 언더바가 들어있는 표현방식을 뱀처럼 생겼다해서 붙여진이름
	//snake_case
	//파스칼 케이스 - 첫글자와 중간 글자를 대문자로 사용하는 표현방식
	//PascalCase
	//OneTwoThree
	//GenderCode
	//카멜 케이스 - 중간글자만 대문자로 시작해서 표현하는 방식
	//Camelcase
	//케밥표기법 - 중간에 대시(-)로 구분해서 변수명을 작성해주는 표기 방법
	//kebab_case
	public static void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 - 포함해서 입력해주세요. : ");
		String idNumber = sc.next();
		//charAt 7번째 자리에 있는 값을 가지고 와서 여자인지 남자인지 구분해서 출력
		//990101-1234567
		//990101-2345678
		//주민번호 뒷자리의 첫 번째 숫자를 가지고 옵니다.
		//주민번호를 - 제외하고 주민번호 숫자만 입력한다면 6번째 자리에 있는 값을 가지고 와야함.
		
		char genderCode = idNumber.charAt(7);// - 포함해서 7자리
		
		//주민번호 뒷 자리 첫 번째 숫자로 성별을 판별
		String gender; // 나중에 여자인지 남자인지 확인해주는 결과 보여주기
		//만약에 1이나 3이 들어온다면 남자
		// "String ''char char를 사용해서 숫자값을 가져오기 때문에 ''사용
		if(genderCode == '1'|| genderCode=='3') {
			gender = "남자";			
		}else if(genderCode == '2' || genderCode =='4') {
			gender = "여자";
		}else {
			System.out.println("올바른 주민번호가 아닙니다.");
			//1. gender = "올바른 주민번호가 아닙니다."
			//2. else에서 돌려보내는 return
			return;
		}
		System.out.println("입력한 주민번호는" + gender + "입니다.");
	}
	public static void castingPractice1() {
		//키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요 : ");
		char inputChar = sc.next().charAt(0);
		
		//유니코드 출력 16진수
		//전 세계의 모든 글자나 문자를 컴퓨터에서 일관되게 표현하는 방식
		//글자에 숫자를 붙여서 컴퓨터가 읽을 수 있도록 해주는 방식
		int nuicode = inputChar; //char 2byte int 8byte
		System.out.println("입력한 문자" + inputChar+ "의 유니코드는" +nuicode + "입니다.");
		
	}
	public static void castingPractice3() {
		//주어진 코드에서 빈칸을 채우고 출력 결과가 나오도록 만든 것
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;//기본값이 double 이기 때문에 float으로 변경해주는 f 붙여줌
		double dNum = 2.5;
		char ch = 'A';
		System.out.println(iNum1/iNum2); //2 몫 2로 떨어진다면?\
		System.out.println((int)dNum); //2//double 실수로 되어있는 것을 정수로 변경
		//double 8byte int 4byte 강제 형변환을 (int) 변경하겠다는 표시를 작성후 시켜줄 것
		System.out.println((double)iNum2 * dNum); //10.0
		//작은 값과 큰 값이 만나면 자동으로 큰 값으로 변경되기 때문에 (double)필수가 아님
		System.out.println((double)iNum1);
		System.out.println(iNum1 /iNum2);
		System.out.println(dNum);
				System.out.println((int)fNum); //3 실수 -> 정수형
		System.out.println((int)iNum1 /fNum);
		//int와 float은 같은 크기의 byte 정수인지 실수인지 표기
		//float 소수점 이하 6자리 까지만 보여줌 기본으로
		System.out.println(iNum1/fNum); //3.3333333
		
		System.out.println((double)iNum1 /fNum);
		System.out.println(ch);//'A'
		System.out.println(ch);//65
		System.out.println(ch + iNum1);//75
		//'A'값이 (int)ch를 통해 65
		//큰 byte와 작은 byte가 만나면 자동으로 큰 byte 담겨짐
		//65+(int iNum1=10)=75
		System.out.println((char)(ch + iNum1));
	}
	public static void controlPractice( ) {
		//키보드로 입력받고 입력 수정 조회 삭제 종료 버튼눌러서 실행하기
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. 종료");
		
		System.out.println("메뉴 번호를 입력하세요.");
		int menuNumber = sc.nextInt();
		
		switch(menuNumber) {
		case 1 :
			System.out.println("입력 메뉴입니다.");
			break;
		case 2 :
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 5:
			System.out.println("로그인 메뉴입니다.");
			break;
		case 6:
			System.out.println("권환 확인 메뉴입니다.");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			break;
		
		default:
			System.out.println("잘못된 메뉴 번호입니다.");
		}
		
	}
	public static void controlpractice5() {
		String userId="myId";
		String userPw="mypassword12";
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력해주세요. : ");
		String ID = sc.next();
		System.out.print("비밀번호를 입력해주세요. :");
		String PW = sc.next();
	
		if(ID.equals(userId) &&PW.equals(userPw));{
			System.out.println("로그인 되었습니다.");
	}if(!ID.equals(userId)) {
			System.out.println("아이디가 틀렸습니다.");
	}else if(!PW.equals(userPw)) {
		System.out.println("비밀번호가 틀렸습니다.");
	}else {
		System.out.println("잘못 입력된 값입니다.");
	}
	}
	
	public static void controlPractice6() {
		Scanner sc= new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급");
		String userRole = sc.next();
		
		System.out.println("해당 회원 등급의 권한");
		
		switch(userRole) {
		case "관리자" :
			System.out.println("-회원관리 \n"
					+ "-게시글관리\n"
					+ "-게시글작성\n"
					+ "-게시글조회\n"
					+ "-댓글작성");
			break;
		case "회원" :
			System.out.println("-게시글 작성"
					+ "게시글 조회"
					+ "댓글 작성\n");
			break;
		case "비회원":
			System.out.println("-게시글조회"
					+ "-게시글관리"
					+ "-게시글작성"
					+ "-게시글 조회"
					+ "-댓글 작성\n");
			break;
		}
	}
	public static void controlPractice8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("num1값을 입력해주세요. : ");
		int num1 = sc.nextInt();
		System.out.println("num2값을 입력해주세요. : " );
		int num2 = sc.nextInt();
		System.out.println("연산자를 입력(+,-,*,/,%) :");
		String operator = sc.next();
		
		double result;
		switch(operator) {
		case "+":
			result = num1+num2;
			break;
		case "-":
			result = num1-num2;
			break;
		case "*":
			result = num1*num2;
			break;
			/*
			  / % 0으로 나눌 수 없기 때문에 if문으로 값이 될 경우 처리를 해줘야함
			 */
		case "/":
			if(num2==0) {
				System.out.println("0으로 나눌 수 없습니다. 프로그램을 종료합니다");
				return;
			}
			result = num1/num2;
			break;
		case "%" :
			if (num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 프로그램을 종료합니다.");
				return;
			}
			result = num1%num2;
		default:
			System.out.println("잘못 입력했습니다. 프로그램을 종료합니다.");
			return;
		}
		System.out.println(num1 + " "+operator+ " " +num2+ "=" + result);
	}
	public static void main(String[] args) {
		//practice8();
		//castingPractice1();
		//castingPractice3();
		//controlPractice();
		//controlpractice5();
		controlPractice6();
		//controlPractice8();
	}

}
