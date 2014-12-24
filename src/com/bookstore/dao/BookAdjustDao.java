package com.bookstore.dao;

import java.math.BigDecimal;
import java.util.List;
import com.bookstore.bean.BookAdjust;

public interface BookAdjustDao {
	/**
	 * 添加图书评论
	 * @param books
	 */
	public void addBookAdjust(BookAdjust bookAdjust);
	/**
	 * 删除图书评论
	 * @param books
	 */
	public void removeBookAdjust(BookAdjust bookAdjust);
	/**
	 * 修改图书评论
	 * @param books
	 */
	public void updateBookAdjust(BookAdjust bookAdjust);
	/**
	 * 根据id查询返回唯一结果
	 * @param id
	 * @return
	 */
	public BookAdjust queryBookAdjustById(Long id);
	/**
	 * 通过查询语句返回结果集
	 * @param sqls
	 * @return
	 */
	public List<BookAdjust> queryBookAdjust(String sqls,int firstResult,int maxResult);
	/**
	 * 查询所有记录数
	 */
	public int getAllRowCount(String hql);
	
}
