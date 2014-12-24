package com.bookstore.service;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore.bean.BookTypes;

public interface BookTypesService {
	/**
	 * 添加书籍类型
	 * @param books
	 */
	public void addBookTypes(BookTypes bookTypes);
	/**
	 * 删除书籍类型
	 * @param books
	 */
	public void removeBookTypes(BookTypes bookTypes);
	/**
	 * 修改书籍类型
	 * @param books
	 */
	public void updateBookTypes(BookTypes bookTypes);
	/**
	 * 根据id查询返回唯一结果类型
	 * @param id
	 * @return
	 */
	public BookTypes queryBookTypesById(Long id);
	/**
	 * 通过查询语句返回结果集类型，分页
	 * @param sqls
	 * @return
	 */
	public List<BookTypes> queryBookTypes(String sqls,int firstResult,int maxResult);
	
	/**
	 * 通过查询语句返回结果集类型，无分页
	 * @param sqls
	 * @return
	 */
	public List<BookTypes> queryBookTypes(String sqls);
	
	/**
	 * 通过查询语句返回结果集类型，无分页，带参
	 * @param sqls
	 * @return
	 */
	public List<BookTypes> queryBookTypes(String sqls,String typename);
	
}
