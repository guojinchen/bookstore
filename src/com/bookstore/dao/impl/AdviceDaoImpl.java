package com.bookstore.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


import com.bookstore.bean.Advice;
import com.bookstore.dao.AdviceDao;
import com.bookstore.util.PageQuery;

public class AdviceDaoImpl extends HibernateDaoSupport implements AdviceDao {

	public void addAdvice(Advice advice) {
		this.getHibernateTemplate().save(advice);
		
	}

	public void deleteAdvice(Advice advice) {
		this.getHibernateTemplate().delete(advice);
		
	}

	public int getAllRowCount(String hql) {
		return this.getHibernateTemplate().find(hql).size();
	}

	public List<Advice> queryAdvice(String hql, int first, int pagerow) {
		PageQuery page=new PageQuery(hql,first,pagerow);
		List<Advice> advicelist=this.getHibernateTemplate().executeFind(page);
		return advicelist;
	}

	public Advice queryAdvice(Long id) {
		Advice advice=(Advice) this.getHibernateTemplate().get(Advice.class, id);
		return advice;
	}

	public void updateAdvice(Advice advice) {
		this.getHibernateTemplate().update(advice);
		
	}

}
