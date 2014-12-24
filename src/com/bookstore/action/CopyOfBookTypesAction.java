	package com.bookstore.action;
	
	import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
	
	import com.bookstore.bean.BookTypes;
import com.bookstore.bean.Books;
import com.bookstore.service.BookTypesService;
import com.bookstore.service.BooksService;
import com.opensymphony.xwork2.ActionContext;
import com.sun.xml.internal.ws.wsdl.writer.document.OpenAtts;
	
	public class CopyOfBookTypesAction {
	private int first=0;
	private int max=12;
	private BookTypesService bookTypesService;
	private BooksService booksService;
	private BookTypes bookTypes;
	private List<BookTypes> list;
	private List<Books> set;
	private List<Books> newset;
	
	private Books books1;
	private List<Books> books2;
	public int getFirst () {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public BookTypesService getBookTypesService() {
		return bookTypesService;
	}
	public void setBookTypesService(BookTypesService bookTypesService) {
		this.bookTypesService = bookTypesService;
	}
	public BookTypes getBookTypes() {
		return bookTypes;
	}
	public void setBookTypes(BookTypes bookTypes) {
		this.bookTypes = bookTypes;
	}
	public List<BookTypes> getList() {
		return list;
	}
	public void setList(List<BookTypes> list) {
		this.list = list;
	}
	
	public BooksService getBooksService() {
		return booksService;
	}
	public void setBooksService(BooksService booksService) {
		this.booksService = booksService;
	}
	
	

	public List<Books> getSet() {
		return set;
	}
	public void setSet(List<Books> set) {
		this.set = set;
	}
	
	
	public List<Books> getNewset() {
		return newset;
	}
	public void setNewset(List<Books> newset) {
		this.newset = newset;
	}
	
	
	public Books getBooks1() {
		return books1;
	}
	public void setBooks1(Books books1) {
		this.books1 = books1;
	}

	
	public List<Books> getBooks2() {
		return books2;
	}
	public void setBooks2(List<Books> books2) {
		this.books2 = books2;
	}
	/**
	 * 添加图书类型信息
	 * @return
	 */
	public String addBookType(){
	bookTypesService.addBookTypes(bookTypes);
	return"success";
	}
	
	/**
	 * 删除图书类型信息
	 * @return
	 */
	public String deleteBookType(){
		bookTypesService.removeBookTypes(bookTypes);
		return"success";
	}
	/**
	 * 更新图书类型信息
	 * @return
	 */
	public String updateBookType(){
		bookTypesService.updateBookTypes(bookTypes);
		return"success";
	}
	/**
	 * 根据Id查询图书类型信息
	 * @return
	 */
	public String queryOneBookType(){
		bookTypes=bookTypesService.queryBookTypesById(bookTypes.getBooktypeId());
		return"success";
	}
	/**
	 * 分页查询所有图书类型信息,在页面第一次加载的时候就执行该方法
	 * @return
	 */
	public String queryAllBookType(){
		String sqls1="from BookTypes";//查询所有图书类型
		list=bookTypesService.queryBookTypes(sqls1, 0,20);
	ServletActionContext.getServletContext().setAttribute("type",list);
	
		
		
		String sqls2="from Books";//查询所有图书所在的出版社及推荐图书
		set=booksService.queryBooks(sqls2, first, max);
		ServletActionContext.getServletContext().setAttribute("publisher",set);
		
		//最新图书推荐
	   String sql3="select b from Books b where b.publishtime>to_timestamp('2011-1-1','yyyy-MM-dd')";
	   newset=booksService.queryBook(sql3);
	   ServletActionContext.getServletContext().setAttribute("newbook", newset);

	   //特别推荐 和最新图书
	   Long b=130035l;
		   books1=booksService.queryBooksById(b);
		   ServletActionContext.getServletContext().setAttribute("choose",books1);
		   
		   String sql4="select b from Books b where b.publishtime=(select max(b1.publishtime) from Books b1)";
	   books2=booksService.queryBook(sql4);
	   ServletActionContext.getServletContext().setAttribute("newone",books2 );
	   
	   
	   return"success"; 
		 }
	/**
	 * 根据书类查询
	 */
	public String queryBookTypeByName(){
		String sqls="select b from BookType b where b.booktypeName='"+bookTypes.getBooktypeName()+"'";
		list=bookTypesService.queryBookTypes(sqls, first, max);
		return"success";
	}

	}
