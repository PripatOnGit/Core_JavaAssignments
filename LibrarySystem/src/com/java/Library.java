package com.java;

public class Library {
	Book[] books = new Book[10];
	int size;
	int price;
	
	public void addBook(Book b) {
		System.out.println("New Book addded:" );
		b.showBooks();
		
		this.books[size]= b;
		size++;
	}
		
	public void removeBook(Book b) {
		for(int i=0;i<size;i++) {
			if(books[i] != b) {
				continue;
				}
			else {
//				System.out.println("Book deleted-- "+ b.toString());
				for(int j = i+1; j<size; j++) {
					books[j-1] = books[j];
					}
				}
				break;
			}
		books[size-1] = null;
		size--;
	}
	
	public float showPrice() {
		for(int i=0;i<size;i++) {
			price += books[i].price;
		}
		return price;
	}
		
	public void printBooks() {
		for(int i=0; i<size; i++) {
			books[i].showBooks();
		}
	}

	
	public static void main(String[] args) {
		Library l1 = new Library();
		String[] author = new String[]{"ABC","CDF","TRH"};
		Book b1 = new Book("Operating System", "SEA Publications", 225, author, 400.0f);
		Book b2 = new Book("DBMS System", "SEA Piblications", 225, author, 600.0f);
		Book b3 = new Book("java programmming", "SEA Piblications", 225, author, 600.0f);
		Book b4 = new Book("Scala programmming", "SEA Piblications", 225, author, 700.0f);
		Book b5 = new Book("React js", "SEA Piblications", 225, author, 500.0f);
		l1.addBook(b1);
		l1.addBook(b2);
		l1.addBook(b3);
		l1.addBook(b4);
		l1.addBook(b5);
		System.out.println("----------------------------------------------------------------");
		l1.removeBook(b2);
//		l1.removeBook(b2);
		l1.removeBook(b5);
		System.out.println("Show all books");
		l1.printBooks();
		
		System.out.println("Price of All books: "+l1.showPrice());
	}
	
}
