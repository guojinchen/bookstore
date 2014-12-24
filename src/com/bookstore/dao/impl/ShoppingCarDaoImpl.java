package com.bookstore.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bookstore.bean.ShoppingCar;
import com.bookstore.dao.ShoppingCarDao;
import com.bookstore.util.PageQuery;

public class ShoppingCarDaoImpl extends HibernateDaoSupport implements ShoppingCarDao{
	/**
	 * ��ӹ�����Ϣ
	 */
	public void addShoppingCar(ShoppingCar shoppingCar) {
		this.getHibernateTemplate().save(shoppingCar);
	}

	/**
	 * ���ݲ�ѯ��䷵�ؽ������
	 */
	public List<ShoppingCar> queryShoppingCar(String sqls,Long vip) {
		List<ShoppingCar> shoppingCars=this.getHibernateTemplate().find(sqls,vip);
		return shoppingCars;
	}
	
	/**
	 * ����id��ѯ����Ψһ������Ϣ
	 */
	public ShoppingCar queryShoppingCarById(Long id) {
		ShoppingCar shoppingCar=(ShoppingCar)this.getHibernateTemplate().get(ShoppingCar.class, id);
		return shoppingCar;
	}

	/**
	 * ɾ��������Ϣ
	 */
	public void removeShoppingCar(ShoppingCar shoppingCar) {
		this.getHibernateTemplate().delete(shoppingCar);
	}

	/**
	 * ���¹�����Ϣ
	 */
	public void updateShoppingCar(ShoppingCar shoppingCar) {
		this.getHibernateTemplate().update(shoppingCar);
	}
/**
 * ȫ��ѯ
 */
	public List<ShoppingCar> queryShoppingCar(String sqls) {
		List<ShoppingCar> list=this.getHibernateTemplate().find(sqls);
		return list;
	}

}
