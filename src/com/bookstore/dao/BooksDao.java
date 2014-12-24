package com.bookstore.dao;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore.bean.Books;

public interface BooksDao {
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
	 * 通过查询语句返回结果集,多个表之间的查询，筛选结果集
	 * @param sqls
	 * @return
	 */
	public List<Object[]> queryBook(String sqls,int firstResult,int maxResult);
	/**
	 * 在BOOK表中查询，查询结果为本表的，为本对象
	 * @param sqls
	 * @param firstResult
	 * @param maxResult
	 * @return
	 */
	
	public List<Books> queryBooks(String sqls,int firstResult,int maxResult);
	/**
	 * 通过HQL查找图书,无分页，带参
	 */
	public List<Books> queryBooksByName(String hql,String name);
	/**
	 * 通过HQL查找图书,无分页，不带参
	 */
	public List<Books> queryBooksByName(String hql);
	
	/**
	 * 查询所有记录数
	 */
	public int getAllRowCount(String hql);
}
