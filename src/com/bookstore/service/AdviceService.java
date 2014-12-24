package com.bookstore.service;

import java.util.List;

import com.bookstore.bean.Admins;
import com.bookstore.bean.Advice;
import com.bookstore.util.Pager;

public interface AdviceService {
	/**
	 * ��ӽ�����Ϣ
	 * @param admins
	 */
public void addAdvice(Advice advice);

/**
 * ɾ��������Ϣ
 * @param admins
 */
public void deleteAdvice(Advice advice);

/**
 * ���½�����Ϣ
 * @param admins
 */
public void updateAdvice(Advice advice);

/**
 * ��ѯ����Ա��Ϣ�����ݴ����hql
 * @param name
 * @return�������е��û��б�
 */
public  Pager queryAdvice(String hql,int pageSize,int currentPage );

/**
 *����ID��ѯ����Ա��Ϣ���ڸ��¹���Ա��Ϣʱ��ѯ��
 * @param id
 * @return
 */
public Advice queryAdvice(Long id);


}
