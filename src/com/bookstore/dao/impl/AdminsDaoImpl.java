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
 * ��ӹ���Ա��Ϣ
 */
	public void addAdmins(Admins admins) {
	this.getHibernateTemplate().save(admins);		
	}
/**
 * ɾ������Ա��Ϣ
 */
	public void deleteAdmins(Admins admins) {
	this.getHibernateTemplate().delete(admins);
		
	}

/**
 * ����ID��ѯ����Ա��Ϣ������IDΨһ�����Է��ص��ǵ�������Ա������ǰ��ѯ
 */
	public Admins queryAdmins(Long id) {		
		Admins admins=(Admins) this.getHibernateTemplate().get(Admins.class,id);
		return admins;
	}
/**
 * ��ѯ���й���Ա��Ϣ��
 * hql ΪҪ��ѯ����䣬firstΪ��ʼ��¼��pagerowΪÿҳ��ʾ��¼��
 */
	public List<Admins> queryAdmins(String hql, int first, int pagerow) {
		PageQuery page=new PageQuery(hql,first,pagerow);
		List<Admins> adminslist=this.getHibernateTemplate().executeFind(page);
		return adminslist;
	}
	
	
/**
 * ���¹���Ա��Ϣ
 */
	public void updateAdmins(Admins admins) {
		this.getHibernateTemplate().update(admins);
		
	}

	/**
	 * ��ѯ���м�¼��
	 */
		public int getAllRowCount(String hql) {
			return this.getHibernateTemplate().find(hql).size();
		}
		
		
		/**
		 * ���β�ѯ
		 */
	public List<Admins> queryAdmins(String hql, String s) {
		List<Admins> adminlist=this.getHibernateTemplate().find(hql,s);
		return adminlist;
	}

}
