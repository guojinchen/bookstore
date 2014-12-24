package com.bookstore.action;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

import com.bookstore.bean.Books;
import com.bookstore.dao.BooksDao;
import com.bookstore.dao.impl.BooksDaoImpl;
import com.bookstore.service.BooksService;
import com.bookstore.service.impl.BooksServiceImpl;

public class Test extends TestCase{
	private BooksService booksService;

	
	
	public BooksService getBooksService() {
		return booksService;
	}



	public void setBooksService(BooksService booksService) {
		this.booksService = booksService;
	}



	public String execute(){
		BeanFactory factory=new ClassPathXmlApplicationContext("applicationContext*.xml");
		booksService=(BooksService)factory.getBean("BooksService");
		Books books=booksService.queryBooksById(130004l);
		System.out.println(books.getBookAuthor());
		List<Books> list=booksService.queryBooks("from Books", 0, 10);
		for(Books b:list){
			System.out.println(b.getBookName());
		}
		System.out.println("Books Action...");
		return "success";
	}

}
