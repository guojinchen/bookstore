 package com.bookstore.action;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Hibernate;

import com.bookstore.bean.BookTypes;
import com.bookstore.bean.Books;
import com.bookstore.service.BookTypesService;
import com.bookstore.service.BooksService;
import com.bookstore.util.Pager;

public class BooksAction {
private List<Object[]> list;
private Books books;
private BookTypes bookTypes;
private BooksService booksService;
private BookTypesService bookTypesService;
private List<Books> list1;
private List<BookTypes> typelist;

private int page;//�ڼ�ҳ

private Pager pager;//�����ֲ���Ϣ��bean



public int getPage() {
	return page;
}
public void setPage(int page) {
	this.page = page;
}
public Pager getPager() {
	return pager;
}
public void setPager(Pager pager) {
	this.pager = pager;
}
public BookTypes getBookTypes() {
	return bookTypes;
}
public void setBookTypes(BookTypes bookTypes) {
	this.bookTypes = bookTypes;
}
public BookTypesService getBookTypesService() {
	return bookTypesService;
}
public void setBookTypesService(BookTypesService bookTypesService) {
	this.bookTypesService = bookTypesService;
}
public List<BookTypes> getTypelist() {
	return typelist;
}
public void setTypelist(List<BookTypes> typelist) {
	this.typelist = typelist;
}
public List<Object[]> getList() {
	return list;
}
public void setList(List<Object[]> list) {
	this.list = list;
}
public Books getBooks() {
	return books;
}
public void setBooks(Books books) {
	this.books = books;
}


public BooksService getBooksService() {
	return booksService;
}
public void setBooksService(BooksService booksService) {
	this.booksService = booksService;
}


public List<Books> getList1() {
	return list1;
}
public void setList1(List<Books> list1) {
	this.list1 = list1;
}



/**
 * ���ͼ����Ϣ
 * @return
 */
public String addBooks(){
	String type=ServletActionContext.getRequest().getParameter("btype");
	String info=ServletActionContext.getRequest().getParameter("info");
	String content=ServletActionContext.getRequest().getParameter("content");
	String dir=ServletActionContext.getRequest().getParameter("directory");
//	System.out.println(type);
//System.out.println(info);
//���������ͣ��ӽ����ȡ��Ϊ�ַ�������Ҫ����ת�����ܸ��¡�
	byte[] infobytes=new String(info).trim().getBytes();
	byte[] contentbytes=new String(content).trim().getBytes();
	byte[] dirbytes=new String(dir).trim().getBytes();
	books.setInformation(Hibernate.createBlob(infobytes));
	books.setMaincontent(Hibernate.createBlob(contentbytes));
	books.setBookDirectory(Hibernate.createBlob(dirbytes));
	
	//����ѡ���ͼ������ ����ѯ����Ӧ��ͼ�����ͣ����и��¡�
	List<BookTypes> list=bookTypesService.queryBookTypes("select t from BookTypes t where t.booktypeName=?",type);
	//BookTypes type1=list.get(0);
	//books.setBookTypes(type1);
	books.setBookImage("bookimages/20121215.jpg");
	
	booksService.addBooks(books);
	return "success";
}
/**
 * ɾ��ͼ����Ϣ
 * @return
 */
public String deleteBooks(){
	booksService.removeBooks(books);
	queryAllBooks();
	this.page=1;
	return"success";
	
}
/**
 * ����ͼ����Ϣ
 * @return
 */
public String updateBooks(){
	String type=ServletActionContext.getRequest().getParameter("btype");
	String info=ServletActionContext.getRequest().getParameter("info");
	String content=ServletActionContext.getRequest().getParameter("content");
	String dir=ServletActionContext.getRequest().getParameter("directory");
//	System.out.println(type);
//System.out.println(info);
//�ӽ����ȡ��Ϊ�ַ�������Ҫ����ת�����ܸ��¡�
	byte[] infobytes=new String(info).trim().getBytes();
	byte[] contentbytes=new String(content).trim().getBytes();
	byte[] dirbytes=new String(dir).trim().getBytes();
	books.setInformation(Hibernate.createBlob(infobytes));
	books.setMaincontent(Hibernate.createBlob(contentbytes));
	books.setBookDirectory(Hibernate.createBlob(dirbytes));
	
	//book.setContent(Hibernate.createBlob(bytes));
	//session.save(book);

//	String pb="";
//	try {
//		
//		pb= new String(type.trim().getBytes("ISO-8859-1"),"utf-8");
//		System.out.println("---"+pb);
//	} catch (UnsupportedEncodingException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	//����ѡ���ͼ������ ����ѯ����Ӧ��ͼ�����ͣ����и��¡�
List<BookTypes> list=bookTypesService.queryBookTypes("select t from BookTypes t where t.booktypeName=?",type);
BookTypes type1=list.get(0);
books.setBookTypes(type1);

	booksService.updateBooks(books);
	return"success";
}
/**
 * ��ѯͼ����Ϣ������ID������ǰ��
 * @return
 */
public String queryOneBook(){
	typelist=bookTypesService.queryBookTypes("select t from BookTypes t");//��ѯ���е��鼮����
	books=booksService.queryBooksById(books.getBookId());//����ID���鼮
	bookTypes=bookTypesService.queryBookTypesById(books.getBookTypes().getBooktypeId());
	
	Blob blob1=books.getInformation();
	Blob blob2=books.getBookDirectory();
	Blob blob3=books.getMaincontent();

	try {
		InputStream is1=blob1.getBinaryStream();
		InputStream is2=blob2.getBinaryStream();
		InputStream is3=blob3.getBinaryStream();
		StringBuffer info=new StringBuffer();
		StringBuffer directory=new StringBuffer();
		StringBuffer maincontent=new StringBuffer();
		byte[] buf = new byte[2048];
		int len;
		while((len = is1.read(buf)) != -1){
		info.append(new String(buf).trim());
		}
		while((len = is2.read(buf)) != -1){
			directory.append(new String(buf).trim());
			}
		while((len = is3.read(buf)) != -1){
			maincontent.append(new String(buf).trim());
			}
	//	System.out.println("-------"+info);
		ServletActionContext.getServletContext().setAttribute("info1",info);
		ServletActionContext.getServletContext().setAttribute("directory1",directory);
		ServletActionContext.getServletContext().setAttribute("content1",maincontent);
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	return "success";
}

/**
 * ��ҳ��ѯ����ͼ��,��ͼ������
 * @return
 */
public String queryAllBooks(){
	String sqls="select b ,c.booktypeName from Books b left outer join b.bookTypes c";
//	list=booksService.queryBook(sqls, first, max);
//	System.out.println("first"+first);
//	System.out.println("current:"+currentpage);
	this.pager=booksService.queryBook(sqls,7,page);
	return "success";
}
/**
 * ��ѯͼ����Ϣ������ͼ������,�޷�ҳ,wrong
 * @return
 */
public String queryBookByName(){
	String sqls="select b from Books b where b.bookName='"+books.getBookName()+"'";
	list1=booksService.queryBook(sqls);
	return "success";
}

}
