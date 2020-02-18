/**
 * 
 */
package io.arun.learning.springbootjsonresponsefilter.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.arun.learning.springbootjsonresponsefilter.model.Book;
import io.arun.learning.springbootjsonresponsefilter.model.User;
import io.arun.learning.springbootjsonresponsefilter.util.FilterUtil;
import io.arun.learning.springbootjsonresponsefilter.util.ResponseModel;

/**
 * @author Arun Kumar
 *
 */
@RestController
@RequestMapping("/api")
public class FilterController {
	
	private ResponseModel response;
	
	@GetMapping("/users/{id}")
	public ResponseEntity<?> usersFilter1() {
		User user = new User("Arun", "Kumar", "Male", "Developer", 10000);
		response = new ResponseModel("User Details", 200, new Date());
		response.setUser(user);
		MappingJacksonValue mappingJacksonValue = FilterUtil.filterFields(response, new String[] {"message","statusCode","timestamp","user"});
		return ResponseEntity.ok(mappingJacksonValue);
	}
	
	@GetMapping("/users")
	public ResponseEntity<?> usersFilter2() {
		List<User> users = Arrays.asList(new User("Arun", "Kumar", "Male", "Developer", 10000), new User("Vijay", "Vikas", "Male", "Tester", 12000));
		response = new ResponseModel("List of Users", 200, new Date());
		response.setUsers(users);
		MappingJacksonValue mappingJacksonValue = FilterUtil.filterFields(response, new String[] {"message","statusCode","timestamp","users"});
		return ResponseEntity.ok(mappingJacksonValue);
	}
	
	@GetMapping("/books/{id}")
	public ResponseEntity<?> booksFilter1() {
		Book book = new Book("The Complete Reference Java", "Herbert Schlidet", "JAVA123123", 540);
		response = new ResponseModel("Book Details", 200, new Date());
		response.setBook(book);
		MappingJacksonValue mappingJacksonValue = FilterUtil.filterFields(response, new String[] {"message","statusCode","timestamp","book"});
		return ResponseEntity.ok(mappingJacksonValue);
	}
	
	@GetMapping("/books")
	public ResponseEntity<?> booksFilter2() {
		List<Book> books = Arrays.asList(new Book("The Complete Reference Java", "Herbert Schlidet", "JAVA123123", 540), new Book("C++", "Balagurusamy", "C1231321313", 350));
		response = new ResponseModel("List of Books", 200, new Date());
		response.setBooks(books);
		MappingJacksonValue mappingJacksonValue = FilterUtil.filterFields(response, new String[] {"message","statusCode","timestamp","books"});
		return ResponseEntity.ok(mappingJacksonValue);
	}
	
}
