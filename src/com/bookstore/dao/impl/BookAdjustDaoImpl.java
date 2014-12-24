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
	 * ����鼮����
	 */
	public void addBookAdjust(BookAdjust bookAdjust) {
		this.getHibernateTemplate().save(bookAdjust);
	}

	/**
	 * ���ݲ�ѯ��估ҳ���ÿҳ�����ʾ����ѯ�����ؽ������
	 */
	public List<BookAdjust> queryBookAdjust(String sqls,int firstResult, int maxResult) {
		HibernateCallback pagerQuery=new PageQuery(sqls,firstResult,maxResult);	
		List<BookAdjust> bookAdjusts=this.getHibernateTemplate().executeFind(pagerQuery);
		return bookAdjusts;
	}
	
	/**
	 * ����id��ѯ����Ψһ�鼮����
	 */
	public BookAdjust queryBookAdjustById(Long id) {
		BookAdjust bookAdjust=(BookAdjust)this.getHibernateTemplate().get(BookAdjust.class, id);
		return bookAdjust;
	}

	/**
	 * ɾ���鼮����
	 */
	public void removeBookAdjust(BookAdjust bookAdjust) {
		this.getHibernateTemplate().delete(bookAdjust);
	}

	/**
	 * �����鼮����
	 */
	public void updateBookAdjust(BookAdjust bookAdjust) {
		this.getHibernateTemplate().update(bookAdjust);
	}

	/**
	 * ��ѯ���м�¼��
	 */
		public int getAllRowCount(String hql) {
			return this.getHibernateTemplate().find(hql).size();
		}

}
