package com.ashokit.binding;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Books {

	private List<Book> bookList;

	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Books(List<Book> bookList) {
		super();
		this.bookList = bookList;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	
}
