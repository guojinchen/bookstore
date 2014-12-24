package com.bookstore.service;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore.bean.Notices;
import com.bookstore.util.Pager;

public interface NoticeService {
	/**
	 * 添加公告
	 */
	public void addNotice(Notices notice);
	/**
	 * 删除公告
	 */
	public void deleteNotice(Notices notice);
	/**
	 * 更新公告
	 * @param notice
	 */
	public void updateNotice(Notices notice);
	/**
	 * 根据ID查询公告
	 * @param id
	 * @return
	 */
	public Notices queryOne(Long id);
	/**
	 * 根据HQL查询公告，无分页
	 * @param hql
	 * @return 返回一个LIST
	  */
	public List<Notices> queryAll(String hql);
	/**
	 * 根据HQL查询公告，分页
	 * @param hql
	 * @param pageSize
	 * @param currentPage
	 * @return
	 */
	public Pager queryAll(String hql,int pageSize,int currentPage);
}
