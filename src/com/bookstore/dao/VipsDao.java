package com.bookstore.dao;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore.bean.Vips;

public interface VipsDao {
	/**
	 * ���ӻ�Ա��Ϣ
	 * @param vips
	 */
public void addVips(Vips vips);
/**
 * �Ի�Ա��Ϣ����ȫ��ѯ
 * 
 */
public List<Vips> queryAll(String hql);


/**
 * ɾ����Ա
 * @param vips
 */
public void deleteVips(Vips vips);

/**
 * ���»�Ա��Ϣ
 * @param vips
 */
public void updateVips(Vips vips);

/**
 * ����ID��ѯ��Ա��Ϣ��һ�����ڸ���ǰ��ѯ
 * @param id
 * @return
 */
public Vips queryVips(Long id);

/**
 * ���ݻ�Ա������ѯ��Ա��Ϣ
 * @param name
 * @return
 */
public List<Vips> queryVips(String hql,int first,int max);
/**
 * ����������ѯ
 * �޷�ҳ������
 */
public List<Vips> queryone(String hql,String name);
/**
 * ��ѯ���м�¼��
 */
public int getAllRowCount(String hql);
}
