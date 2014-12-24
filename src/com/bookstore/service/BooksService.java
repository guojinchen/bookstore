package com.bookstore.service;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore.bean.Books;
import com.bookstore.util.Pager;

public interface BooksService {
	/**
	 * 添加书籍
	 * @param books
	 */
	public void addBooks(Books books);
	/**
	 * 删除书籍
	 * @param books
	 */
	public void removeBooks(Books books);
	/**
	 * 修改书籍
	 * @param books
	 */
	public void updateBooks(Books books);
	/**
	 * 根据id查询返回唯一结果
	 * @param id
	 * @return
	 */
	public Books queryBooksById(Long id);
	/**
	 * 通过查询语句返回结果集,多个表的联合查询
	 * @param sqls
	 * @return
	 */
	public Pager queryBook(String sqls,int pageSize,int currentPage);
	
	/**
	 * 通过书名查找图书,无分页,带参
	 */
	public List<Books> queryBook(String hql,String name);
	/**
	 * 通过查询语句返回同表的结果集，一个表
	 */
	public List<Books> queryBooks(String hql,int first,int max);
	
	/**
	 * 通过书名查找图书,无分页,不带参
	 */
	public List<Books> queryBook(String hql);
}
