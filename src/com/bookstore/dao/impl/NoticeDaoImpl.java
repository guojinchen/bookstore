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
	 * 添加公告信息
	 */
	public void addNotice(Notices notice) {
		this.getHibernateTemplate().save(notice);
		
	}
/**
 * 删除公告信息
 */
	public void deleteNotice(Notices notice) {
	this.getHibernateTemplate().delete(notice);
		
	}
/**
 * 无分页查询所有的公告信息
 */
	public List<Notices> queryAll(String hql) {
		List<Notices> list=this.getHibernateTemplate().find(hql);
		return list;
	}
/**
 * 分页查询所有公告信息
 */
	public List<Notices> queryAll(String hql, int first, int max) {
		HibernateCallback pagequery=new PageQuery(hql,first,max);
		List<Notices> list=this.getHibernateTemplate().executeFind(pagequery);
		return list;
	}
/**
 * 根据ID查询指定的公告信息
 */
	public Notices queryOne(Long id) {
		Notices notice=(Notices) this.getHibernateTemplate().get(Notices.class, id);
		return notice;
	}
/**
 * 更新公告信息
 */
	public void updateNotice(Notices notice) {
		this.getHibernateTemplate().update(notice);
		
	}
	/**
	 * 查询所有记录数
	 */
		public int getAllRowCount(String hql) {
			return this.getHibernateTemplate().find(hql).size();
		}

}
