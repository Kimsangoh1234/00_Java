package com.kh.practice.list.library.view;

import java.util.Collections;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	//키보드 값 입력받을 scanner
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	
	// Book을 실행하자마자 보이는 메인메뉴만들기
	public void mainMenu() {
		//만약에 true 라면 계속 실행
		while(true) {
			System.out.println(" === 도서관리 프로그램 === ");
			System.out.println("1. 도서추가");
			System.out.println("2. 도서 전체 목록 조회");
			System.out.println("6. 종료");
			System.out.print("메뉴선택: ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 :
				insertBook();
				break;

			 case 2 :
				 selectList();
				 break;
			 case 3 :
				 searchBook();
				 break;
			 case 4 :
				 deleteBook();
				 break;
			 case 5 :
				 ascBook();
				 break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
			}
			
		}
	}
	
	public void selectList() {
		bc.selectList();
	}
	
	
	//책 추가하기 위해 키보드로 작성하는 insertBook void 만들기
	public void insertBook() {
		System.out.print("제목 : " );
		String title = sc.nextLine();
		
		System.out.print("저자 : ");
		String author = sc.nextLine();
		
		System.out.print("카테고리 : ");
		String category = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		//책 정보 저장하는 Book 객체 소환
		//import com.kh.practice.list.library.model.vo.Book;
		//					   제목,    저자,   카테고리,  가격) 
		Book book = new Book(title, author, category, price);
		bc.insertBook(book);
		System.out.println("도서 추가가 완료 되었습니다.");
		bc.deleteBook(book);
	}
	public void searchBook() {
		System.out.println("검색할 키워드 입력 : ");
		String keyword = sc.nextLine();
		
		//오름차순 정렬
		public void ascBook() 
		
			Collections.sort(list, Comparator.Comparator.comparing(Book::getTitle));
		}
	
		
		//도서삭제
		public void deleteBook() {
			//true false를 통해 삭제가 됐는지 안 됐는지 확인할 수 있도록 함
			boolean removed = false;
			//책 제목과 저자를 검색해서 삭제할 책 찾기
			//전체목록 for-each
			for(Book bbb: list) {
				//만약에 내가 삭제하고자 하는 책제목과 책저자가 존재한다면 
				//책 제목 가져오기.비교하기(내가 삭제하고자 하는 책제목)
				if(bbb.getTitle().equals(title))   bbb.getAuthor().equals(author);
				list.remove(bbb);
				removed=true;
				break;
			}
		}
		
		//만약에 삭제가 됐으면 삭제됐다를 true false 이용해서 표시하기
		if(removed) {
			System.out.println("도서 삭제가 완료되었습니다.");
		}else {
			System.out.println("해당하는 도서를 찾을 수 없습니다.");
		}
	}
	
	
}