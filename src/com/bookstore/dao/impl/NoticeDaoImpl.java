package com.bookstore.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bookstore.bean.Notices;
import com.bookstore.dao.NoticeDao;
import com.bookstore.util.PageQuery;

public class NoticeDaoImpl extends HibernateDaoSupport implements NoticeDao {

	
	/**
	 * ��ӹ�����Ϣ
	 */
	public void addNotice(Notices notice) {
		this.getHibernateTemplate().save(notice);
		
	}
/**
 * ɾ��������Ϣ
 */
	public void deleteNotice(Notices notice) {
	this.getHibernateTemplate().delete(notice);
		
	}
/**
 * �޷�ҳ��ѯ���еĹ�����Ϣ
 */
	public List<Notices> queryAll(String hql) {
		List<Notices> list=this.getHibernateTemplate().find(hql);
		return list;
	}
/**
 * ��ҳ��ѯ���й�����Ϣ
 */
	public List<Notices> queryAll(String hql, int first, int max) {
		HibernateCallback pagequery=new PageQuery(hql,first,max);
		List<Notices> list=this.getHibernateTemplate().executeFind(pagequery);
		return list;
	}
/**
 * ����ID��ѯָ���Ĺ�����Ϣ
 */
	public Notices queryOne(Long id) {
		Notices notice=(Notices) this.getHibernateTemplate().get(Notices.class, id);
		return notice;
	}
/**
 * ���¹�����Ϣ
 */
	public void updateNotice(Notices notice) {
		this.getHibernateTemplate().update(notice);
		
	}
	/**
	 * ��ѯ���м�¼��
	 */
		public int getAllRowCount(String hql) {
			return this.getHibernateTemplate().find(hql).size();
		}

}
