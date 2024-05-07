package com.kh.practice.book.model.vo;

import java.util.Date;

public class Book {
	private String title;
	private String author;
	private int price;
	private Date Calendar;
	private double discount;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(String title, String author, int price, Date Calendar, double discount) {
		this.title=title;
		this.author=author;
		this.price=price;
		this.Calendar=Calendar;
		this.discount=discount;
	}
	
}
