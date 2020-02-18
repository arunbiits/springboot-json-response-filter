package io.arun.learning.springbootjsonresponsefilter.util;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFilter;

import io.arun.learning.springbootjsonresponsefilter.model.Book;
import io.arun.learning.springbootjsonresponsefilter.model.User;

@JsonFilter("ResponseModelFilter")
public class ResponseModel {

	private String message;
	private int statusCode;
	private Date timestamp;
	private User user;
	private Book book;
	private List<User> users;
	private List<Book> books;
	
	public ResponseModel() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ResponseModel(String message, int statusCode, Date timestamp) {
		super();
		this.message = message;
		this.statusCode = statusCode;
		this.timestamp = timestamp;
	}


	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	
}
 