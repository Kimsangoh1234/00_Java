package com.kh.practice.chap01;

import java.util.Random;
import java.util.Scanner;

public class ControlPractice {

	//메소드
	public void practice11(){
		//비밀번호는 정해진 게 아니라 입력해서 정해야함.
		Scanner sc = new Scanner(System.in);
		//비밀번호를 우리가 만족할 때까지 출력(반복한다는 의미)
		while(true) {
			System.out.print("비밀번호 입력(1000~9999) : ");
			int password = sc.nextInt();
			if(password <1000 || password>9999) {
				System.out.println("4자리가 아닙니다.");
				//자리 수가 안 맞으면 '자리 수 안맞음' 출력
				System.out.println("자리 수 안 맞음");
				continue;
			}
			int[]digits = new int[4];
			digits[0] = password/1000;
			digits[1]= (password/100)%10;
			digits[2]= (password/10)%10;
			digits[3]= password%10;
			//중복여부
			boolean isTrue = true;
			//length : 크기
			for(int i =0; i<digits.length; i++) {
				for(int j= i +1; j<digits.length; j++) {
					if(digits[i] == digits[j]) {
						isTrue = true;
						break;
					}
			if(!isTrue) {
				System.out.println("중복값이 있음.");
			}else {
				System.out.println("비밀번호 생성 성공");
			
				}
			}
		}
		//정수를 이용해서 4자리 비밀번호를 만들려고한다
		//4자리 정수를 입력받아 각 자리 수에 중복되는 값이 없을 경우 성공
		//중복 값이 있으면 중복 값 있음
	
		//단, 제일 맨 앞자리 수의 값은 1~9사이의 정수
		
		
	}
}
	public void oddNum() {
		for (int num=1; num<=10; num++) {
			//만약에 숫자가 홀수라면 출력하기 2%2=0
			if(num%2 !=0) {
				System.out.println(num);
			}
		}
	}
	//짝수만 1~10까지 출력하기
	public void evenNum() {
		for(int num=1; num<=10; num++)	{
			if (num%2==0) {
				System.out.println(num);
			}
		}
	}
	//정사각형 모양의 별 출력
	public void squareStar() {
		int star = 3;
		for(int i=0; i <star; i++) {//한줄출력 0 1 2
			
			for(int j = 0; j < star; j++) {
				System.out.print("* ");
			}
			System.out.println(); //가로로 별을 출력한다음 줄바꿈
		}
	}
	//정사각형 모양의 별 가로로 5개씩 출력
	public void fivestar()	{
		int star = 5;
		for (int i=0; i<star; i++) {
			
			for(int j= 0; j<star; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	//LoopForEX.java
	public void numberGame() {
		Scanner sc = new Scanner(System.in);
		
		Random random = new Random();
		int randomNumber = random.nextInt(50)+1;
		System.out.println("숫자를 맟춰보세요요 : ");
		
		int guest = sc.nextInt();
			int randomNuber = random.nextInt(50)+1;
			if(guest == randomNuber) {
				System.out.println("축하합니다!! 숫자를 맞췄습니다!");
			}else {
				System.out.println("틀렸습니다.");
				System.out.println("정답은" + randomNumber + "입니다.");
			}
		}
	public void attackgame() {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		while(true) {
			int randomNumber = random.nextInt(3)+1;
			System.out.println("숫자를 맞춰보세요!!!!! :" );
			for(int attack=1; attack<=2; attack++) {
				System.out.println("공격을" + attack + "회 시도합니다.(숫자적기)");
				
				int guest = sc.nextInt();
				
				if(guest==randomNumber) {
					System.out.println("축하합니다!! 숫자를 맞췄습니다.");
					break;
				}else if(guest<randomNumber) {
					System.out.println("정답보다 입력한 숫자가 작습니다.");
				}else if(guest>randomNumber) {
					System.out.println("정답보다 입력한 숫자가 큽니다.");
				}
			}
			
		System.out.println("게임을 다시 시작하겠습니까? (1번 yes /2번 no)");
		int playAgain = sc.nextInt();
		if(playAgain==2) {
			System.out.println("게임을 종료합니다.");
			break;
		}
		}
		}
	public void practice2() {
		//사용자로부터 한 개의 값을 입력받아 1부터 그 숫자까지의 숫자들을 모두 출력
		//단, 입력한 수는 1보다 크거나 같아야하고 만일 1미만의 숫자를 입력했다면
		//1이상의 숫자를 입력해주세요 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("한 개의 숫자를 입력하세요. : ");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
			return;
		}
	
	for(int i=1; i<=num; i++) {
		System.out.print(i +" ");
		
	}
	//마무리로 줄바꿈을 해주길 원한다면
	System.out.println();
	}
	public void practice4() {
		//1미만의 숫자가 입력되면 1이상의 숫자를 입력해주세요 출력되면서
		//사용자가 값을 입력하도록 하기
		//숫자를 입력받은 숫자부터 1까지 출력하기
		Scanner sc = new Scanner(System.in);
	
		int num; //practice4 안에서 어디서든 num을 알 수 있도록 바깥으로 호출해줌
		
		//do - while : 조건이 참이 아니어도 무조건 최초 1회는 실행
		do {
			System.out.print("숫자를 입력해주세요.");
			num = sc.nextInt();
			//1미만의 숫자가 들어오면 !
			if(num<1) {
				System.out.println("1이상의 숫자를 입력해주세요.");
				//조건에 관계없이 do로 인해 무조건 1회 실행되는 것이기때문에 return이나 back을
				//작성해주지 않아도 될 경우가 많음.
			}
		}while(num>1);
		
		//만약에 1보다 커서 밑으로 내려온다면 
		//num부터 1까지 거꾸로 출력해주는 for문 작성해주기
		
		for(int i = num; i >= 1; i--) {
			System.out.print(i+" ");
		}
	}
	public void practice5() {
		//1부터 사용자에게 입력받은 수까지의 정수들의 합을 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		// 입력받은 수의 총 합이 들어갈 바구니
		int result = 0;
		
		//숫자가 들어왔을 때 1부터 입력받은 숫자까지 더해서 총합 구하기
		for(int i = 1; i<=num; i++) {
			result += i; 
			//더해지는 숫자 출력하기
			if(i <num) {
				System.out.print(i + "+");
			}else {
				System.out.print(i+"=");
			}
		}
		System.out.println(result);
	}
	public void practice7() {
		/*
		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자 출력하기
		만일 1미만의 숫자가 입력됐다면 1이상의 숫자를 입력해주세요 출력하기
		다시 사용자가 값을 입력해서 출력하기
		 */
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("첫 번째 숫자 : ");
			int firstNum = sc. nextInt();
			
			System.out.println("두 번째 숫자 : ");
			int secondNum = sc.nextInt();
			
			//만약에 첫 번째 숫자와 두 번째 숫자 모두 1보다 크거나 같을 경우
			if(firstNum>=1 && secondNum >=1) {
				
				int 최소값 = Math.min(firstNum, secondNum);
				
				int 최대값 = Math.max(firstNum, secondNum);
				//Math(수학 파일에서) 가장 작은 값을 찾는 min을 활용해서
				//알아서 비교하고 작은 값을 구하게 하기
				//Math에도 random이 있던데요
				//Random 파일 math.랜덤파일
				//Math에 있는 random보다 random에 있는 랜덤 기능이 더
				//많지만 둘다 사용하는데 큰 차이는 없음
				for(int i= 최소값; i <= 최대값; i++) {
					System.out.print(i+ " ");
				}
				break;
			}else {
				System.out.println("1이상의 숫자를 입력해주세요. ");
			}
		}
		
		
	}
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수수를 입력하세요. : ");
		int num = sc.nextInt();
		
		//입력받은 수만큼 세로줄 출력 ex2) 2.세로로 +이 한자 2칸
		for(int 세로줄 =1; 세로줄<=num; 세로줄++) {
			for(int 별=1; 별<=세로줄; 별++)
				System.out.println("*");
		}
		System.out.println();
		
	}
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 " );
		int num = sc.nextInt();
		
		
		for(int line =num; line>=1; line--) {
			for(int star =0;star<=line;star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
}
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		//키보드로 입력받은 수를 size 안에 넣어줌
		int size = sc.nextInt();
		//line은 세로로 된 줄의 번호를 나타냄
		for(int line = 0; line < size; line++) {
			for(int blank = 0; blank < line; blank++) {
				System.out.print(" ");
			}
			
			for(int star = size; star>line; star--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}