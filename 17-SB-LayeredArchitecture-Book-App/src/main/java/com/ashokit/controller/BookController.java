package com.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.ashokit.entity.Book;
import com.ashokit.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/book")
	public String loadForm(Model m)
	{
		m.addAttribute("book", new Book());
		
		return "index";
	}
	@PostMapping("/saveBook")
	public String saveBook(Book book,Model m)
	{
		boolean status = bookService.saveBook(book);
		
		if(status)
		{
			m.addAttribute("success", "Book Save");
		}
		else {
			m.addAttribute("failure", "faild to save");
		}
		return "index";
	}
	
	@GetMapping("/viewBooks")
	public String viewBoks(Model m)
	{
		List<Book> allBooks = bookService.getAllBooks();
		m.addAttribute("books", allBooks);
		return "data";
		}
}

