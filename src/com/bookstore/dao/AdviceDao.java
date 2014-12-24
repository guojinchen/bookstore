package com.bookstore.dao;

import java.util.List;

import com.bookstore.bean.Advice;


public interface AdviceDao {
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
public  List<Advice> queryAdvice(String hql,int first,int pagerow );

/**
 *根据ID查询管理员信息，在更新管理员信息时查询用
 * @param id
 * @return
 */
public Advice queryAdvice(Long id);
/**
 * 查询所有记录数
 */
public int getAllRowCount(String hql);

}
