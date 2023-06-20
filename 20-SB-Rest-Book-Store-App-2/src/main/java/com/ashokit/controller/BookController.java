package com.ashokit.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.binding.Book;
import com.ashokit.binding.Books;

@RestController
public class BookController {

	@PostMapping(value ="/books", consumes = {"application/json","application/xml"})
	public ResponseEntity<String> addBooks(@RequestBody Books bookList){
		
		List<Book> bList = bookList.getBookList();
		bList.forEach(System.out::println);
		
		return new ResponseEntity<>("Book Added!!!",HttpStatus.CREATED);
		
	}
	
	@GetMapping(value ="/books", produces = {"application/json","application/xml"})
	public ResponseEntity<Books> getBooks(){
		Books books=new Books();
		Book b1=new Book(101, "Spring", 523.20);
		Book b2=new Book(102, "Java", 352.20);
		Book b3=new Book(103, "Adv-Java", 203.20);
		
		List<Book> bList = Arrays.asList(b1,b2,b3);
		
		books.setBookList(bList);
		
		return new ResponseEntity<>(books,HttpStatus.OK);
		
	}
}
