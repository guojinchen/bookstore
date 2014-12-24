package com.bookstore.dao;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore.bean.Orders;
import com.bookstore.bean.ShoppingCar;

public interface ShoppingCarDao {
	/**
	 * 添加购物信息
	 * @param books
	 */
	public void addShoppingCar(ShoppingCar shoppingCar);
	/**
	 * 删除购物信息
	 * @param books
	 */
	public void removeShoppingCar(ShoppingCar shoppingCar);
	/**
	 * 修改购物信息
	 * @param books
	 */
	public void updateShoppingCar(ShoppingCar shoppingCar);
	/**
	 * 根据id查询返回唯一结果
	 * @param id
	 * @return
	 */
	public ShoppingCar queryShoppingCarById(Long id);
	/**
	 * 通过查询语句返回结果集
	 * @param sqls
	 * @return
	 */
	public List<ShoppingCar> queryShoppingCar(String sqls,Long vip);
	
	/**
	 * 通过查询语句返回结果集
	 * @param sqls
	 * @return
	 */
	public List<ShoppingCar> queryShoppingCar(String sqls);
}
