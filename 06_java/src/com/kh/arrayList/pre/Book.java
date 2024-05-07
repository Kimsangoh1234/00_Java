package com.kh.arrayList.pre;

public class Book {
//필드
	//책이름
	private String bookname;
	//저자
	private String author;
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	//메서드
	//setter
	//Getter
	public String getBookname() {
		return bookname;
	}
	public String getAuthor() {
		return author;
	}
	public Book() {
		
	}
	public Book(String bookname, String author) {
		this.bookname=bookname;
		this.author=author;
	}
	//void 책 정보를 출력하는 메서드
	public void showBook() {
		System.out.println(bookname+" , "+author);
	}
}
