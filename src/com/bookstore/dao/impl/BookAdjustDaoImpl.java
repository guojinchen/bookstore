package com.bookstore.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bookstore.bean.BookAdjust;
import com.bookstore.dao.BookAdjustDao;
import com.bookstore.util.PageQuery;

public class BookAdjustDaoImpl extends HibernateDaoSupport implements BookAdjustDao{

	/**
	 * 添加书籍评语
	 */
	public void addBookAdjust(BookAdjust bookAdjust) {
		this.getHibernateTemplate().save(bookAdjust);
	}

	/**
	 * 根据查询语句及页码和每页最大显示数查询，返回结果集合
	 */
	public List<BookAdjust> queryBookAdjust(String sqls,int firstResult, int maxResult) {
		HibernateCallback pagerQuery=new PageQuery(sqls,firstResult,maxResult);	
		List<BookAdjust> bookAdjusts=this.getHibernateTemplate().executeFind(pagerQuery);
		return bookAdjusts;
	}
	
	/**
	 * 根据id查询返回唯一书籍评语
	 */
	public BookAdjust queryBookAdjustById(Long id) {
		BookAdjust bookAdjust=(BookAdjust)this.getHibernateTemplate().get(BookAdjust.class, id);
		return bookAdjust;
	}

	/**
	 * 删除书籍评语
	 */
	public void removeBookAdjust(BookAdjust bookAdjust) {
		this.getHibernateTemplate().delete(bookAdjust);
	}

	/**
	 * 更新书籍评语
	 */
	public void updateBookAdjust(BookAdjust bookAdjust) {
		this.getHibernateTemplate().update(bookAdjust);
	}

	/**
	 * 查询所有记录数
	 */
		public int getAllRowCount(String hql) {
			return this.getHibernateTemplate().find(hql).size();
		}

}
