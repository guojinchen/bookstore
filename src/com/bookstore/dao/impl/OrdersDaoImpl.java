package com.bookstore.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bookstore.bean.Orders;
import com.bookstore.dao.OrdersDao;
import com.bookstore.util.PageQuery;

public class OrdersDaoImpl extends HibernateDaoSupport implements OrdersDao {
	/**
	 * ���ݲ�ѯ��估ҳ���ÿҳ�����ʾ����ѯ�����ؽ������
	 */
	public List<Orders> queryOrders(String sqls,int firstResult, int maxResult) {
		HibernateCallback pagerQuery=new PageQuery(sqls,firstResult,maxResult);	
		List<Orders> orderses=this.getHibernateTemplate().executeFind(pagerQuery);
		return orderses;
	}
	
	/**
	 * ����id��ѯ����Ψһ����
	 */
	public Orders queryOrdersById(Long id) {
		Orders orders=(Orders)this.getHibernateTemplate().get(Orders.class, id);
		return orders;
	}

	/**
	 * ɾ������
	 */
	public void removeOrders(Orders orders) {
		this.getHibernateTemplate().delete(orders);
	}

	/**
	 * ���¶���
	 */
	public void updateOrders(Orders orders) {
		this.getHibernateTemplate().update(orders);
	}

	/**
	 * ��Ӷ���
	 */
	public void addOrders(Orders orders) {
		this.getHibernateTemplate().save(orders);
	}
	/**
	 * ����ѯ���������ж���
	 */

	public List<Object[]> mulqueryOrders(String sqls, int firstResult,
			int maxResult) {
		HibernateCallback pagerQuery=new PageQuery(sqls,firstResult,maxResult);	
		List<Object[]> orderses=this.getHibernateTemplate().executeFind(pagerQuery);
		return orderses;
	}
	/**
	 * ��ѯ�ܼ�¼��
	 */
	public int getAllRowCount(String hql) {
		return this.getHibernateTemplate().find(hql).size();
	}

	/**
	 * ����VIPID��ѯ������Ϣ
	 */
	public List<Orders> myOrders(String hql, Long id) {
		List<Orders> list=this.getHibernateTemplate().find(hql,id);
		return list;
	}
}
