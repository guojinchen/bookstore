package com.bookstore.service;

import java.util.List;

import com.bookstore.bean.Admins;
import com.bookstore.bean.Advice;
import com.bookstore.util.Pager;

public interface AdviceService {
	/**
	 * 添加建议信息
	 * @param admins
	 */
public void addAdvice(Advice advice);

/**
 * 删除建议信息
 * @param admins
 */
public void deleteAdvice(Advice advice);

/**
 * 更新建议信息
 * @param admins
 */
public void updateAdvice(Advice advice);

/**
 * 查询管理员信息，根据传入的hql
 * @param name
 * @return返回所有的用户列表，
 */
public  Pager queryAdvice(String hql,int pageSize,int currentPage );

/**
 *根据ID查询管理员信息，在更新管理员信息时查询用
 * @param id
 * @return
 */
public Advice queryAdvice(Long id);


}
