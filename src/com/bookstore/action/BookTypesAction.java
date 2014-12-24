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
	
	public class BookTypesAction {
	private int first=0;
	private int max=12;
	private BookTypesService bookTypesService;
	private List<BookTypes> list;
	private BookTypes bookTypes;
	
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
	public List<BookTypes> getList() {
		return list;
	}
	public void setList(List<BookTypes> list) {
		this.list = list;
	}
	
	
	
	public BookTypes getBookTypes() {
		return bookTypes;
	}
	public void setBookTypes(BookTypes bookTypes) {
		this.bookTypes = bookTypes;
	}
	/**
	 * ���ͼ��������Ϣ
	 * @return
	 */
	public String addBookType(){
	bookTypesService.addBookTypes(bookTypes);
	return"success";
	}
	
	/**
	 * ɾ��ͼ��������Ϣ
	 * @return
	 */
	public String deleteBookType(){
		bookTypesService.removeBookTypes(bookTypes);
		return"success";
	}
	/**
	 * ����ͼ��������Ϣ
	 * @return
	 */
	public String updateBookType(){
		bookTypesService.updateBookTypes(bookTypes);
		return"success";
	}
	/**
	 * ����Id��ѯͼ��������Ϣ
	 * @return
	 */
	public String queryOneBookType(){
		bookTypes=bookTypesService.queryBookTypesById(bookTypes.getBooktypeId());
		return"success";
	}
	/**
	 * ��ҳ��ѯ����ͼ��������Ϣ,��ҳ���һ�μ��ص�ʱ���ִ�и÷���
	 * @return
	 */
	public String queryAllBookType(){
		String sqls1="from BookTypes";//��ѯ����ͼ������
		list=bookTypesService.queryBookTypes(sqls1,first,max);
	   return"success"; 
		 }
	/**
	 * ���������ѯ
	 */
	public String queryBookTypeByName(){
		String sqls="select b from BookType b where b.booktypeName='"+bookTypes.getBooktypeName()+"'";
		list=bookTypesService.queryBookTypes(sqls, first, max);
		return"success";
	}

	}
