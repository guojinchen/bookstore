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
 * 添加会员信息
 */
	public void addVips(Vips vips) {
		this.getHibernateTemplate().save(vips);
		
	}
/**
 * 删除会员信息
 */
	public void deleteVips(Vips vips) {
		this.getHibernateTemplate().delete(vips);
	}
	/**
	 * 查询会员信息，修改前
	 */

	public Vips queryVips(Long id) {
		Vips vip=(Vips) this.getHibernateTemplate().get(Vips.class, id);
		return vip;
	}
	/**
	 * 查询所有会员信息，
	 * hql传入的hql，first第一条记录号，max显示的记录条数
	 */

	public List<Vips> queryVips(String hql, int first, int max) {
		
		PageQuery page=new PageQuery(hql,first,max);
		List<Vips> viplist=this.getHibernateTemplate().executeFind(page);
		
		return viplist;
	}
/**
 * 更新会员信息
 */
	public void updateVips(Vips vips) {
		//Date date = new Date();
		//SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		//Timestamp ts = new Timestamp(date.getTime());
		//vips.setRegistertime(ts);
		
		this.getHibernateTemplate().saveOrUpdate(vips);
		
		
	}
	/**
	 * 无分页查询，根据姓名，带参
	 */
public List<Vips> queryone(String hql, String name) {
	List<Vips> vip= (List)this.getHibernateTemplate().find(hql,name);
	return vip;
}
/**
 * 查询所有记录数
 */
	public int getAllRowCount(String hql) {
		return this.getHibernateTemplate().find(hql).size();
	}
public List<Vips> queryAll(String hql) {
	      
	return this.getHibernateTemplate().find(hql);
}

}
