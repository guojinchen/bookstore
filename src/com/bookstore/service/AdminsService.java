package com.bookstore.service;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore.bean.Admins;

public interface AdminsService {
	
	
	/**
	 * 添加管理员信息
	 * @param admins
	 */
public void addAdmins(Admins admins);

/**
 * 删除管理员信息
 * @param admins
 */
public void deleteAdmins(Admins admins);

/**
 * 更新管理员信息
 * @param admins
 */
public void updateAdmins(Admins admins);

/**
 * 查询管理员信息，根据传入hql
 * @param name
 * @return返回所有的用户列表，
 */
public  List<Admins> queryAdmins(String hql,int first,int pagerow );

/**
 *根据ID查询管理员信息，在更新管理员信息时查询用
 * @param id
 * @return
 */
public Admins queryAdmins(Long id);
/**
 * 查询管理员信息，根据传入的hql,带参
 * @param name
 * @return返回所有的用户列表，
 */
public  List<Admins> queryAdmins(String hql,String s );

}
