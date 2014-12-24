package com.bookstore.action;

import java.math.BigDecimal;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.struts.ActionSupport;

import com.bookstore.bean.BookTypes;
import com.bookstore.bean.Books;
import com.bookstore.bean.Notices;
import com.bookstore.service.BookTypesService;
import com.bookstore.service.BooksService;
import com.bookstore.service.NoticeService;

public class FirstAction {
	private int first=0;
	private int max=20;
	private BookTypesService bookTypesService;
	private BooksService booksService;
	private BookTypes bookTypes;
	private List<BookTypes> list;
	private List<Books> set;
	private List<Books> newset;
	private Books books1;
	private List<Books> books2;
	private List<Notices> noticelist;
	private NoticeService noticeService;
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
	
	
	public List<Notices> getNoticelist() {
		return noticelist;
	}
	public void setNoticelist(List<Notices> noticelist) {
		this.noticelist = noticelist;
	}
	
	
	public NoticeService getNoticeService() {
		return noticeService;
	}
	public void setNoticeService(NoticeService noticeService) {
		this.noticeService = noticeService;
	}
	/**
	 * 在页面第一次加载的时候就执行该方法
	 * @return
	 */
	public String execute(){
		String sqls1="from BookTypes order by booktypeId";//查询所有图书类型
		list=bookTypesService.queryBookTypes(sqls1, 0,20);
	ServletActionContext.getServletContext().setAttribute("type",list);
	//System.out.println(list.get(1));
		
		
		String sqls2="from Books";//查询所有图书所在的出版社及推荐图书
		set=booksService.queryBooks(sqls2, first, max);
		ServletActionContext.getServletContext().setAttribute("publisher",set);
		
		//最新图书推荐
	   String sql3="select b from Books b where b.publishtime>to_timestamp('2011-1-1','yyyy-MM-dd')";
	   newset=booksService.queryBook(sql3);
	   ServletActionContext.getServletContext().setAttribute("newbook", newset);

	   //特别推荐 和最新图书
	   Long b=130053l;
		   books1=booksService.queryBooksById(b);
		   ServletActionContext.getServletContext().setAttribute("choose",books1);
		   //最新图书
		   String sql4="select b from Books b where b.publishtime=(select max(b1.publishtime) from Books b1)";
	   books2=booksService.queryBook(sql4);
	   ServletActionContext.getServletContext().setAttribute("newone",books2 );
	   
	   //查询出当天的公告信息
	  String hql="select n from Notices n where n.noticeTime=(select max(n1.noticeTime) from Notices n1)";
	  noticelist=noticeService.queryAll(hql);
	  ServletActionContext.getServletContext().setAttribute("notice",noticelist);	   
	   return"success"; 
		 }


}
