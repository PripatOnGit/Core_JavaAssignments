package com.java;

public class Book {
	String title, publisher;
	int pages;
	float price;
	String[] authors = new String[10];
	
	Book(String title, String publisher,int pages,String[] authors,float price ) {
		this.title = title;
		this.publisher = publisher;
		this.authors = authors;
		this.price = price;
		this.pages = pages;
	}
	
	public void showBooks() {
		System.out.println(this.title + " " + this.publisher + " " +this.pages+" "+ "[" + String.join(" ", this.authors) + "]" + " " +this.price);
		//String print = this.title + " " + this.publisher + " " +this.pages;		
		//System.out.println(print);
	}
	public String toString() {
		return this.title + " " + this.publisher + " " +this.pages+ " "+ "[" + String.join(" ", this.authors) + "]" + " " +this.price;
		
	}
}
  