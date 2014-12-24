package com.bookstore.dao;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore.bean.Notices;

public interface NoticeDao {
/**
 * ��ӹ���
 */
public void addNotice(Notices notice);
/**
 * ɾ������
 */
public void deleteNotice(Notices notice);
/**
 * ���¹���
 * @param notice
 */
public void updateNotice(Notices notice);
/**
 * ����ID��ѯ����
 * @param id
 * @return
 */
public Notices queryOne(Long id);
/**
 * ����HQL��ѯ���棬�޷�ҳ
 * @param hql
 * @return ����һ��LIST
  */
public List<Notices> queryAll(String hql);
/**
 * ����HQL��ѯ���棬��ҳ
 * @param hql
 * @param frist
 * @param max
 * @return
 */
public List<Notices> queryAll(String hql,int frist,int max);
/**
 * ��ѯ���м�¼��
 */
public int getAllRowCount(String hql);
}
