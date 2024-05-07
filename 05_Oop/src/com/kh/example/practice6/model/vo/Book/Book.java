package com.kh.example.practice6.model.vo.Book;

public class Book {

	public String title;
	public String publisher;
	public String author;
	public int price;
	public double discountRate;
	
public Book() {
	
}
public Book(String title, String publisher,
		String author, int price,double discountRate) {
	this.title=title;
	this.publisher=publisher;
	this.author=author;
	this.price=price;
	this.discountRate=discountRate;
	
}
public void BookInfo() {
	System.out.println("책이름 : "+title);
	System.out.println("출판사 : "+publisher);
	System.out.println("지은이 : "+author);
	System.out.println("책가격 : "+price);
	System.out.println("할인률 : "+discountRate);
	System.out.println("---------------");
}
	public static void main(String[] args) {
		System.out.println("kh서점에 오신 것을 환영합니다.");
		Book 책 = new Book();
		책.title = "해저2만리";
		책.publisher = "동아방송";
		책.author="홍길동";
		책.price=9000;
		책.discountRate = 0.3;
		책.BookInfo();
	}
		

}
