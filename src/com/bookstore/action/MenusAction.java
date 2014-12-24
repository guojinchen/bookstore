package com.bookstore.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.bookstore.bean.Books;
import com.bookstore.service.BooksService;

public class MenusAction {
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


	public String newbooks(){
		 String hql="select b from Books b where b.publishtime>to_timestamp('2011-1-1','yyyy-mm-dd')";
		list=booksService.queryBook(hql);
		return"success";
	}
	
	public String specialbook(){
		String hql="select b from Books b where b.discountprice>5";
		list=booksService.queryBook(hql);
		return"success";
	}
	public String sortbook(){
		String hql="select b from Books b order by sellsum asc";
		list=booksService.queryBook(hql);
		return"success";
	}
}
