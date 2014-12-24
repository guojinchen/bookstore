package com.bookstore.dao;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore.bean.Vips;

public interface VipsDao {
	/**
	 * 增加会员信息
	 * @param vips
	 */
public void addVips(Vips vips);
/**
 * 对会员信息进行全查询
 * 
 */
public List<Vips> queryAll(String hql);


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
public List<Vips> queryVips(String hql,int first,int max);
/**
 * 根据姓名查询
 * 无分页，带参
 */
public List<Vips> queryone(String hql,String name);
/**
 * 查询所有记录数
 */
public int getAllRowCount(String hql);
}
