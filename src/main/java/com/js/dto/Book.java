package com.js.dto;

public class Book {
	private int book_id;
	private String book_name;
	private String author_name;
	private int no_of_page;
	private double price;
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public int getNo_of_page() {
		return no_of_page;
	}
	public void setNo_of_page(int no_of_page) {
		this.no_of_page = no_of_page;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_name=" + book_name + ", author_name=" + author_name
				+ ", no_of_page=" + no_of_page + ", price=" + price + "]";
	}
	

}
