package com.bookstore.service.impl;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore.bean.ShoppingCar;
import com.bookstore.dao.ShoppingCarDao;
import com.bookstore.service.ShoppingCarService;

public class ShoppingCarServiceImpl implements ShoppingCarService {

	private ShoppingCarDao shoppingCarDao;
	
	
	public ShoppingCarDao getShoppingCarDao() {
		return shoppingCarDao;
	}

	public void setShoppingCarDao(ShoppingCarDao shoppingCarDao) {
		this.shoppingCarDao = shoppingCarDao;
	}
/**
 * ��ӹ��ﳵ��Ϣ
 */
	public void addShoppingCar(ShoppingCar shoppingCar) {
		shoppingCarDao.addShoppingCar(shoppingCar);
	}
/**
 * ��ҳ��ѯ���ﳵ��Ϣ
 */
	public List<ShoppingCar> queryShoppingCar(String sqls,Long vip) {
		List<ShoppingCar> list=shoppingCarDao.queryShoppingCar(sqls,vip);
		
		return list;
	}
/**
 * ����ID��ѯ���ﳵ��Ϣ
 */
	public ShoppingCar queryShoppingCarById(Long id) {
		ShoppingCar shoppingCar=shoppingCarDao.queryShoppingCarById(id);
		return shoppingCar;
	}
/**
 * ɾ�����ﳵ��Ϣ
 */
	public void removeShoppingCar(ShoppingCar shoppingCar) {
		shoppingCarDao.removeShoppingCar(shoppingCar);
		
	}
/**
 * ���¹��ﳵ��Ϣ
 */
	public void updateShoppingCar(ShoppingCar shoppingCar) {
		shoppingCarDao.updateShoppingCar(shoppingCar);
		
	}

public List<ShoppingCar> queryShoppingCar(String sqls) {
	List<ShoppingCar> list=shoppingCarDao.queryShoppingCar(sqls);
	return list;
}

}
