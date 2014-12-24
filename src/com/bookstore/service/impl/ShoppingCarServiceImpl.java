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
 * 添加购物车信息
 */
	public void addShoppingCar(ShoppingCar shoppingCar) {
		shoppingCarDao.addShoppingCar(shoppingCar);
	}
/**
 * 分页查询购物车信息
 */
	public List<ShoppingCar> queryShoppingCar(String sqls,Long vip) {
		List<ShoppingCar> list=shoppingCarDao.queryShoppingCar(sqls,vip);
		
		return list;
	}
/**
 * 根据ID查询购物车信息
 */
	public ShoppingCar queryShoppingCarById(Long id) {
		ShoppingCar shoppingCar=shoppingCarDao.queryShoppingCarById(id);
		return shoppingCar;
	}
/**
 * 删除购物车信息
 */
	public void removeShoppingCar(ShoppingCar shoppingCar) {
		shoppingCarDao.removeShoppingCar(shoppingCar);
		
	}
/**
 * 更新购物车信息
 */
	public void updateShoppingCar(ShoppingCar shoppingCar) {
		shoppingCarDao.updateShoppingCar(shoppingCar);
		
	}

public List<ShoppingCar> queryShoppingCar(String sqls) {
	List<ShoppingCar> list=shoppingCarDao.queryShoppingCar(sqls);
	return list;
}

}
