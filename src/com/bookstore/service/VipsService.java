package com.bookstore.service;

import java.util.List;

import com.bookstore.bean.Vips;
import com.bookstore.util.Pager;

public interface VipsService {
	
	/**
	 * 对会员信息进行全查询
	 * 
	 */
	public List<Vips> queryAll(String hql);
	
	
	
	
	/**
	 * 增加会员信息
	 * @param vips
	 */
public void addVips(Vips vips);

/**
 * 删除会员
 * @param vips
 */
public void deleteVips(Vips vips);

/**
 * 更新会员信息
 * @param vips
 */
public void updateVips(Vips vips);

/**
 * 根据ID查询会员信息，一般用于更新前查询
 * @param id
 * @return
 */
public Vips queryVips(Long id);

/**
 * 根据会员姓名查询会员信息
 * @param name
 * @return
 */
public Pager queryVips(String hql,int pageSize,int currentPage);

/**
 * 根据姓名查询
 * 无分页，带参
 */
public List<Vips> queryone(String hql,String name);

}
