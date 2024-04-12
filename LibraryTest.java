package assignment3;

import java.util.Arrays;

class Book {
	private String title;
	private String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' + '}';
	}
}

class Library {
	private Book[] books;
	private int size;

	public Library(int capacity) {
		this.books = new Book[capacity];
		this.size = 0;
	}

	public void addBook(Book book) {
		if (size < books.length) {
			books[size++] = book;
			System.out.println("Book added successfully.");
		} else {
			System.out.println("Library is full. Cannot add more books.");
		}
	}

	public void removeBook(String title) {
		for (int i = 0; i < size; i++) {
			if (books[i].getTitle().equals(title)) {
				for (int j = i; j < size - 1; j++) {
					books[j] = books[j + 1];
				}
				books[size - 1] = null; 
				size--;
				System.out.println("Book removed successfully.");
				return;
			}
		}
		System.out.println("Book not found.");
	}

	public void displayBooks() {
		if (size == 0) {
			System.out.println("Library is empty.");
		} else {
			System.out.println("Books in the library:");
			for (int i = 0; i < size; i++) {
				System.out.println(books[i]);
			}
		}
	}
}

public class LibraryTest {
	public static void main(String[] args) {
		Library library = new Library(5);

		library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
		library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
		library.addBook(new Book("1976", "George Orwell"));

		library.displayBooks();

		library.removeBook("To Kill a Mockingbird");

		library.displayBooks();
	}
}
