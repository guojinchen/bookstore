package com.bookstore.service.impl;

import java.math.BigDecimal;
import java.util.List;
import com.bookstore.bean.Admins;
import com.bookstore.dao.AdminsDao;
import com.bookstore.service.AdminsService;

public class AdminsServiceImpl implements AdminsService {
 
	private AdminsDao adminsDao;
 
	public AdminsDao getAdminsDao() {
	return adminsDao;
}

public void setAdminsDao(AdminsDao adminsDao) {
	this.adminsDao = adminsDao;
}
/**
 * 添加管理员信息
 */
	public void addAdmins(Admins admins) {
	adminsDao.addAdmins(admins);		
	}
	/**
	 * 删除管理员信息
	 */

	public void deleteAdmins(Admins admins) {
		adminsDao.deleteAdmins(admins);
	}

	/**
	 * 根据ID查询管理员信息，修改前
	 */
	public Admins queryAdmins(Long id) {
		Admins admins=adminsDao.queryAdmins(id);
		return admins;
	}
/**
 * 更新管理员信息
 */

	public void updateAdmins(Admins admins) {
		adminsDao.updateAdmins(admins);
		
	}

	public List<Admins> queryAdmins(String hql, int first, int pagerow) {
		List<Admins> adminslist=adminsDao.queryAdmins(hql, first, pagerow);
		return adminslist;
	}
	/**
	 * 查询管理员信息，根据传入的hql,带参
	 * @param name
	 * @return返回所有的用户列表，
	 */
	public List<Admins> queryAdmins(String hql, String s) {
		List<Admins> list=adminsDao.queryAdmins(hql, s);
		return list;
	}

}
