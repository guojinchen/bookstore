package com.bookstore.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bookstore.bean.Books;
import com.bookstore.dao.BooksDao;
import com.bookstore.util.PageQuery;

public class BooksDaoImpl extends HibernateDaoSupport implements BooksDao{

	/**
	 * 添加书籍
	 */
	public void addBooks(Books books) {
		this.getHibernateTemplate().save(books);
	}

	/**
	 * 根据查询语句及页码和每页最大显示数查询，返回结果集合，多个表的联合查询，
	 */
	public List<Object[]> queryBook(String sqls,int firstResult, int maxResult) {
		HibernateCallback pagerQuery=new PageQuery(sqls,firstResult,maxResult);	
		List<Object[]> bookses=this.getHibernateTemplate().executeFind(pagerQuery);
		return bookses;
	}
	
	/**
	 * 根据id查询返回唯一书籍
	 */
	public Books queryBooksById(Long id) {
		Books books=(Books)this.getHibernateTemplate().get(Books.class, id);
		return books;
	}

	/**
	 * 删除书籍
	 */
	public void removeBooks(Books books) {
		this.getHibernateTemplate().delete(books);
	}

	/**
	 * 更新书籍
	 */
	public void updateBooks(Books books) {
		this.getHibernateTemplate().update(books);
	}
/**
 * 根据Hql查找图书，不分页,带参
 */
	public List<Books> queryBooksByName(String hql,String name) {
		HibernateTemplate  ht =this.getHibernateTemplate();
		List<Books> list=ht.find(hql,name);
		return list;
	}
/**
 * 查询本表的所有内容，返回结果仍为本对象
 */
public List<Books> queryBooks(String sqls, int firstResult, int maxResult) {
	HibernateCallback pagerQuery=new PageQuery(sqls,firstResult,maxResult);	
	List<Books> books=this.getHibernateTemplate().executeFind(pagerQuery);
	return books;
}
/**
 * 根据Hql查找图书，不分页，不带参
 */
	public List<Books> queryBooksByName(String hql) {
		List<Books> list=this.getHibernateTemplate().find(hql);
		return list;
	}
/**
 * 查询所有的总记录数
 */
public int getAllRowCount(String hql) {
	
	return this.getHibernateTemplate().find(hql).size();
}

	
}
