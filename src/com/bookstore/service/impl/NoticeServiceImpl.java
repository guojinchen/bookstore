package com.bookstore.service.impl;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore.bean.Notices;
import com.bookstore.bean.Vips;
import com.bookstore.dao.NoticeDao;
import com.bookstore.service.NoticeService;
import com.bookstore.util.Pager;

public class NoticeServiceImpl implements NoticeService{
  
	private NoticeDao noticeDao;	
	
	public NoticeDao getNoticeDao() {
		return noticeDao;
	}

	public void setNoticeDao(NoticeDao noticeDao) {
		this.noticeDao = noticeDao;
	}

/**
 * ��ӹ�����Ϣ
 */
	public void addNotice(Notices notice) {
		noticeDao.addNotice(notice);
		
	}
/**
 * ɾ��������Ϣ
 */
	public void deleteNotice(Notices notice) {
		noticeDao.deleteNotice(notice);
	}
/**
 * �޷�ҳ��ѯ���й�����Ϣ
 */
	public List<Notices> queryAll(String hql) {
		List<Notices> list=noticeDao.queryAll(hql);
		return list;
	}
/**
 * ��ҳ��ѯ��ҳ��Ϣ
 */
	public Pager queryAll(String hql, int pageSize, int page) {
		int allRow=noticeDao.getAllRowCount("from Notices");//�ܼ�¼��
		int totalPage=Pager.countTotalPage(pageSize,allRow);//��ҳ��
		final int offset=Pager.countOffset(pageSize,page);//��ǰҳ��ʼ��¼
		final int length=pageSize;//ÿҳ��¼��
		final int currentPage=Pager.countCurrentPage(page);
		List<Notices> vips=noticeDao.queryAll(hql, offset,length);//"һҳ"�ļ�¼

		//�ѷ�ҳ��Ϣ���浽Bean��
		Pager pager=new Pager();
		pager.setPageSize(pageSize);
		pager.setCurrentPage(currentPage);
		pager.setAllRow(allRow);
		pager.setTotalPage(totalPage);
		pager.setList(vips);
		pager.init();
		return pager;

	}
/**
 * ����ID��ѯ������Ϣ
 */
	public Notices queryOne(Long id) {
		Notices notice=noticeDao.queryOne(id);
		return notice;
	}
/**
 * ���¹�����Ϣ
 */
	public void updateNotice(Notices notice) {
		noticeDao.updateNotice(notice);
		
	}

}
