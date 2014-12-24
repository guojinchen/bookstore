package com.bookstore.dao.impl;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bookstore.bean.Admins;
import com.bookstore.dao.AdminsDao;
import com.bookstore.util.PageQuery;

public class AdminsDaoImpl extends HibernateDaoSupport implements AdminsDao{
/**
 * 添加管理员信息
 */
	public void addAdmins(Admins admins) {
	this.getHibernateTemplate().save(admins);		
	}
/**
 * 删除管理员信息
 */
	public void deleteAdmins(Admins admins) {
	this.getHibernateTemplate().delete(admins);
		
	}

/**
 * 根据ID查询管理员信息，因于ID唯一，所以返回的是单个管理员，更新前查询
 */
	public Admins queryAdmins(Long id) {		
		Admins admins=(Admins) this.getHibernateTemplate().get(Admins.class,id);
		return admins;
	}
/**
 * 查询所有管理员信息，
 * hql 为要查询的语句，first为起始记录，pagerow为每页显示记录数
 */
	public List<Admins> queryAdmins(String hql, int first, int pagerow) {
		PageQuery page=new PageQuery(hql,first,pagerow);
		List<Admins> adminslist=this.getHibernateTemplate().executeFind(page);
		return adminslist;
	}
	
	
/**
 * 更新管理员信息
 */
	public void updateAdmins(Admins admins) {
		this.getHibernateTemplate().update(admins);
		
	}

	/**
	 * 查询所有记录数
	 */
		public int getAllRowCount(String hql) {
			return this.getHibernateTemplate().find(hql).size();
		}
		
		
		/**
		 * 带参查询
		 */
	public List<Admins> queryAdmins(String hql, String s) {
		List<Admins> adminlist=this.getHibernateTemplate().find(hql,s);
		return adminlist;
	}

}
