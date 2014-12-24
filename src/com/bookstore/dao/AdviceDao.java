package com.bookstore.dao;

import java.util.List;

import com.bookstore.bean.Advice;


public interface AdviceDao {
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
public  List<Advice> queryAdvice(String hql,int first,int pagerow );

/**
 *����ID��ѯ����Ա��Ϣ���ڸ��¹���Ա��Ϣʱ��ѯ��
 * @param id
 * @return
 */
public Advice queryAdvice(Long id);
/**
 * ��ѯ���м�¼��
 */
public int getAllRowCount(String hql);

}
