package com.bookstore.dao.impl;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bookstore.bean.Vips;
import com.bookstore.dao.VipsDao;
import com.bookstore.util.PageQuery;

public class VipsDaoImpl extends HibernateDaoSupport implements VipsDao{
/**
 * ��ӻ�Ա��Ϣ
 */
	public void addVips(Vips vips) {
		this.getHibernateTemplate().save(vips);
		
	}
/**
 * ɾ����Ա��Ϣ
 */
	public void deleteVips(Vips vips) {
		this.getHibernateTemplate().delete(vips);
	}
	/**
	 * ��ѯ��Ա��Ϣ���޸�ǰ
	 */

	public Vips queryVips(Long id) {
		Vips vip=(Vips) this.getHibernateTemplate().get(Vips.class, id);
		return vip;
	}
	/**
	 * ��ѯ���л�Ա��Ϣ��
	 * hql�����hql��first��һ����¼�ţ�max��ʾ�ļ�¼����
	 */

	public List<Vips> queryVips(String hql, int first, int max) {
		
		PageQuery page=new PageQuery(hql,first,max);
		List<Vips> viplist=this.getHibernateTemplate().executeFind(page);
		
		return viplist;
	}
/**
 * ���»�Ա��Ϣ
 */
	public void updateVips(Vips vips) {
		//Date date = new Date();
		//SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
		//Timestamp ts = new Timestamp(date.getTime());
		//vips.setRegistertime(ts);
		
		this.getHibernateTemplate().saveOrUpdate(vips);
		
		
	}
	/**
	 * �޷�ҳ��ѯ����������������
	 */
public List<Vips> queryone(String hql, String name) {
	List<Vips> vip= (List)this.getHibernateTemplate().find(hql,name);
	return vip;
}
/**
 * ��ѯ���м�¼��
 */
	public int getAllRowCount(String hql) {
		return this.getHibernateTemplate().find(hql).size();
	}
public List<Vips> queryAll(String hql) {
	      
	return this.getHibernateTemplate().find(hql);
}

}
