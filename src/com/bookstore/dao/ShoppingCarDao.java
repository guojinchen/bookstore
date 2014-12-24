package com.bookstore.dao;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore.bean.Orders;
import com.bookstore.bean.ShoppingCar;

public interface ShoppingCarDao {
	/**
	 * ��ӹ�����Ϣ
	 * @param books
	 */
	public void addShoppingCar(ShoppingCar shoppingCar);
	/**
	 * ɾ��������Ϣ
	 * @param books
	 */
	public void removeShoppingCar(ShoppingCar shoppingCar);
	/**
	 * �޸Ĺ�����Ϣ
	 * @param books
	 */
	public void updateShoppingCar(ShoppingCar shoppingCar);
	/**
	 * ����id��ѯ����Ψһ���
	 * @param id
	 * @return
	 */
	public ShoppingCar queryShoppingCarById(Long id);
	/**
	 * ͨ����ѯ��䷵�ؽ����
	 * @param sqls
	 * @return
	 */
	public List<ShoppingCar> queryShoppingCar(String sqls,Long vip);
	
	/**
	 * ͨ����ѯ��䷵�ؽ����
	 * @param sqls
	 * @return
	 */
	public List<ShoppingCar> queryShoppingCar(String sqls);
}
