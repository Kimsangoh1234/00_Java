package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	ArrayList<Book> list = new ArrayList<>();
	
	//생성자 ctrl space enter
	public BookController() {
	}
	
	//책 추가하기 
	public void insertBook(Book bk) {
		 list.add(bk);
	}
	
	//책 전체보기
	public void selectList() {
		//만약에 책이 없다면 등록된 도서가 없습니다. 
		if(list.isEmpty()) {
			System.out.println("등록된 도서가 없습니다.");
		} else {//책이 있다면 책 목록을 보여주자
			//for - each 활용해서 전체보기
			for(Book b : list) {
				//b.
				System.out.println(b.toString());
				//com.kh.practice.list.library.model.vo.Book@96532d6
			}
			
		}
		public void searchBook(String keyword) {
			List<Book> 검색결과 = new ArrayList<>();
			for(Book b : list) {
				if(b.getTitle().contains(keyword)) {
					검색결과.add(b);
					
				}
			}
			if(검색결과.isEmpty()) {
				System.out.println("검색 결과가 없습니다.");
			}else {
				for(Book bb : 검색결과) {
					System.out.println(bb);
				}
			}
		}
		
	}

	public void deleteBook(Book book) {
		// TODO Auto-generated method stub
		
	}
}