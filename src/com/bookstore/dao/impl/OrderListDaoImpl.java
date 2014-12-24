package com.bookstore.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.bookstore.bean.OrderList;
import com.bookstore.dao.OrderListDao;
import com.bookstore.util.PageQuery;

public class OrderListDaoImpl extends HibernateDaoSupport implements OrderListDao{
	/**
	 * ���ݲ�ѯ��估ҳ���ÿҳ�����ʾ����ѯ�����ؽ������
	 */
	public List<OrderList> queryOrderList(String sqls,int firstResult, int maxResult) {
		HibernateCallback pagerQuery=new PageQuery(sqls,firstResult,maxResult);	
		List<OrderList> orderLists=this.getHibernateTemplate().executeFind(pagerQuery);
		return orderLists;
	}
	
	/**
	 * ����id��ѯ����Ψһ������ϸ
	 */
	public OrderList queryOrderListById(Long id) {
		OrderList orderList=(OrderList)this.getHibernateTemplate().get(OrderList.class, id);
		return orderList;
	}

	/**
	 * ɾ��������ϸ
	 */
	public void removeOrderList(OrderList orderList) {
		this.getHibernateTemplate().delete(orderList);
	}

	/**
	 * ���¶�����ϸ
	 */
	public void updateOrderList(OrderList orderList) {
		this.getHibernateTemplate().update(orderList);
	}

	/**
	 * ��Ӷ�����ϸ
	 */
	public void addOrderList(OrderList orderList) {
		this.getHibernateTemplate().save(orderList);
	}
/**
 * ����ҳ������HQL�����β�ѯ
 */
	public List<Object[]> queryOrderList(String sqls, Long orderId) {
		List<Object[]> orderList=(List<Object[]>)this.getHibernateTemplate().find(sqls,orderId);
		return orderList;
	}
	
	/**
	 * ����ҳ������HQL�����β�ѯ,��ɾ��ORDERSǰ��ORDERLIST
	 */
		public List<OrderList> queryOrder(String sqls, Long orderId) {
			List<OrderList> orderList=(List<OrderList>)this.getHibernateTemplate().find(sqls,orderId);
			return orderList;
		}
}
