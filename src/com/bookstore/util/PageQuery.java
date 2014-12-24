package com.bookstore.util;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;

public class PageQuery implements HibernateCallback{

	private String sqls;
	private int firstResult;
	private int maxResult;
	public PageQuery(){
		
	}
	public PageQuery(String sqls,int firstResult,int maxResult){
		this.firstResult=firstResult;
		this.maxResult=maxResult;
		this.sqls=sqls;
	}
	public Object doInHibernate(Session session) throws HibernateException,
			SQLException {
		return session.createQuery(sqls).setFirstResult(firstResult).setMaxResults(maxResult).list();
	}
	
}
