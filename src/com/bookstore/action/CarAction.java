package com.bookstore.action;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.struts2.ServletActionContext;

import com.bookstore.bean.Books;

import com.bookstore.service.BooksService;


public class CarAction {
private Books book;
private BooksService booksService;


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

/**
 * 添加到购物车,使用session暂时存储购物信息
 * @return
 */

public String addCar(){
	Map session=ServletActionContext.getContext().getSession();
	Set<Books>  bookset;
	book=booksService.queryBooksById(book.getBookId());
	try {
		bookset=(Set<Books>) session.get("set");
		bookset.add(book);
		session.put("set",bookset);
	} catch (NullPointerException e) {
		bookset=new HashSet<Books>();
		bookset.add(book);
		session.put("set",bookset);
		session.put("item",bookset.size());
	}
	count();
	return"success";
}

/**
 * 删除对应的商品项目，重写了Books的 equals方法。
 * @return
 */
public String delCar(){
	Map session=ServletActionContext.getContext().getSession();
	Set<Books>  bookset=(Set<Books>) session.get("set");
	book=booksService.queryBooksById(book.getBookId());
	System.out.println(book.getBookName()+"----");
	bookset.remove(book);
	for(Books b:bookset){
	System.out.println(b.getBookName());	
	}
	session.put("set",bookset);
	session.put("item",bookset.size());
	count();
	return"success";
}

/**
 * 计算总价,默认数量为1时。
 */

public void count(){
	double amount=0.00f;
	Map session=ServletActionContext.getContext().getSession();
	Set<Books>  bookset=(Set<Books>) session.get("set");
	for(Books b:bookset){
		amount=amount+b.getPrice()-b.getDiscountprice();
		System.out.println("--------"+b.getPrice());
		System.out.println("伤不起"+b.getDiscountprice());
		System.out.println("++++++++++"+amount);
	}
	
	session.put("amount", amount);
}
	
}
