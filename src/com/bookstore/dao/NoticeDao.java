package com.bookstore.dao;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore.bean.Notices;

public interface NoticeDao {
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
 * @param frist
 * @param max
 * @return
 */
public List<Notices> queryAll(String hql,int frist,int max);
/**
 * 查询所有记录数
 */
public int getAllRowCount(String hql);
}
