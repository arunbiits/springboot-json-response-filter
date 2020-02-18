/**
 * 
 */
package io.arun.learning.springbootjsonresponsefilter.model;

/**
 * @author Arun Kumar
 *
 */
public class Book {

	private String name;
	private String author;
	private String isbn;
	private Integer price;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String name, String author, String isbn, Integer price) {
		super();
		this.name = name;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
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

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", isbn=" + isbn + ", price=" + price + "]";
	}
	
}
