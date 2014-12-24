package com.bookstore.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.bookstore.bean.Books;
import com.bookstore.service.BooksService;

public class publisherBookAction {
private List<Books> list;
private Books book;
private BooksService booksService;
public List<Books> getList() {
	return list;
}
public void setList(List<Books> list) {
	this.list = list;
}
public Books getBook() {
	return book;
}
public void setBook(Books book) {
	this.book = book;
}


public BooksService getBooksService() {
	return booksService;
}
public void setBooksService(BooksService booksService) {
	this.booksService = booksService;
}


public String execute(){
	String hql="select b from Books b where b.publisher =?";
	String pb ="";
	
	
	try {

		pb= new String(book.getPublisher().getBytes("ISO-8859-1"),"utf-8");
	} catch (UnsupportedEncodingException e) {
		
	}
	System.out.println(pb);
	list=booksService.queryBook(hql,pb);
	
	//System.out.println(list.get(0));
	return"success";
}

public String findbook(){
	String hql="select b from Books b where b.bookName=?";
	String pb ="";
	
	try {
		pb= new String(book.getBookName().trim().getBytes("ISO-8859-1"),"utf-8");
	} catch (UnsupportedEncodingException e) {
		
	}
	//System.out.println(pb);
	list=booksService.queryBook(hql,pb);
	
	//System.out.println(list.get(0));
	return"success";
}

}
