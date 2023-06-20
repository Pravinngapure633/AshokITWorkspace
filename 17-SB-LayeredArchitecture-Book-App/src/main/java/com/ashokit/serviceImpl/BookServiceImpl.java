package com.ashokit.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.entity.Book;
import com.ashokit.repository.BookRepository;
import com.ashokit.service.BookService;
@Service
public class BookServiceImpl  implements BookService{

	@Autowired
	private BookRepository bookRepo;
	@Override
	public boolean saveBook(Book book) {
	
		Book save = bookRepo.save(book);
		
		if(save.getId()!=null)
		{
			return true;
		}
		
		return false;
	}

	@Override
	public List<Book> getAllBooks() {
		
		return bookRepo.findAll();
	}
	
	

}
