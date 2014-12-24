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
	 * 添加购物信息
	 */
	public void addShoppingCar(ShoppingCar shoppingCar) {
		this.getHibernateTemplate().save(shoppingCar);
	}

	/**
	 * 根据查询语句返回结果集合
	 */
	public List<ShoppingCar> queryShoppingCar(String sqls,Long vip) {
		List<ShoppingCar> shoppingCars=this.getHibernateTemplate().find(sqls,vip);
		return shoppingCars;
	}
	
	/**
	 * 根据id查询返回唯一购物信息
	 */
	public ShoppingCar queryShoppingCarById(Long id) {
		ShoppingCar shoppingCar=(ShoppingCar)this.getHibernateTemplate().get(ShoppingCar.class, id);
		return shoppingCar;
	}

	/**
	 * 删除购物信息
	 */
	public void removeShoppingCar(ShoppingCar shoppingCar) {
		this.getHibernateTemplate().delete(shoppingCar);
	}

	/**
	 * 更新购物信息
	 */
	public void updateShoppingCar(ShoppingCar shoppingCar) {
		this.getHibernateTemplate().update(shoppingCar);
	}
/**
 * 全查询
 */
	public List<ShoppingCar> queryShoppingCar(String sqls) {
		List<ShoppingCar> list=this.getHibernateTemplate().find(sqls);
		return list;
	}

}
