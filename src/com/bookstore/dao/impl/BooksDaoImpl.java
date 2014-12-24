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
	 * ����鼮
	 */
	public void addBooks(Books books) {
		this.getHibernateTemplate().save(books);
	}

	/**
	 * ���ݲ�ѯ��估ҳ���ÿҳ�����ʾ����ѯ�����ؽ�����ϣ����������ϲ�ѯ��
	 */
	public List<Object[]> queryBook(String sqls,int firstResult, int maxResult) {
		HibernateCallback pagerQuery=new PageQuery(sqls,firstResult,maxResult);	
		List<Object[]> bookses=this.getHibernateTemplate().executeFind(pagerQuery);
		return bookses;
	}
	
	/**
	 * ����id��ѯ����Ψһ�鼮
	 */
	public Books queryBooksById(Long id) {
		Books books=(Books)this.getHibernateTemplate().get(Books.class, id);
		return books;
	}

	/**
	 * ɾ���鼮
	 */
	public void removeBooks(Books books) {
		this.getHibernateTemplate().delete(books);
	}

	/**
	 * �����鼮
	 */
	public void updateBooks(Books books) {
		this.getHibernateTemplate().update(books);
	}
/**
 * ����Hql����ͼ�飬����ҳ,����
 */
	public List<Books> queryBooksByName(String hql,String name) {
		HibernateTemplate  ht =this.getHibernateTemplate();
		List<Books> list=ht.find(hql,name);
		return list;
	}
/**
 * ��ѯ������������ݣ����ؽ����Ϊ������
 */
public List<Books> queryBooks(String sqls, int firstResult, int maxResult) {
	HibernateCallback pagerQuery=new PageQuery(sqls,firstResult,maxResult);	
	List<Books> books=this.getHibernateTemplate().executeFind(pagerQuery);
	return books;
}
/**
 * ����Hql����ͼ�飬����ҳ��������
 */
	public List<Books> queryBooksByName(String hql) {
		List<Books> list=this.getHibernateTemplate().find(hql);
		return list;
	}
/**
 * ��ѯ���е��ܼ�¼��
 */
public int getAllRowCount(String hql) {
	
	return this.getHibernateTemplate().find(hql).size();
}

	
}
