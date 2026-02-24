package com.test;

import java.util.List;

// book is a bean class
public class Book {
	private int id;
	private String name;
	private String author;
	private int price;
	private List<BookDetails> bd;
//	private BookDetails bd; // a class having another class object as a data member
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	
//	public BookDetails getBd() {
//		return bd;
//	}
//	public void setBd(BookDetails bd) {
//		this.bd = bd;
//	}
	
	public List<BookDetails> getBd() {
		return bd;
	}
	public void setBd(List<BookDetails> bd) {
		this.bd = bd;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + ", bd=" + bd + "]";
	}
	
	
}
