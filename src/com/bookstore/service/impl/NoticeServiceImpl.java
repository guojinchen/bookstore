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
 * 添加公告信息
 */
	public void addNotice(Notices notice) {
		noticeDao.addNotice(notice);
		
	}
/**
 * 删除公告信息
 */
	public void deleteNotice(Notices notice) {
		noticeDao.deleteNotice(notice);
	}
/**
 * 无分页查询所有公告信息
 */
	public List<Notices> queryAll(String hql) {
		List<Notices> list=noticeDao.queryAll(hql);
		return list;
	}
/**
 * 分页查询分页信息
 */
	public Pager queryAll(String hql, int pageSize, int page) {
		int allRow=noticeDao.getAllRowCount("from Notices");//总记录数
		int totalPage=Pager.countTotalPage(pageSize,allRow);//总页数
		final int offset=Pager.countOffset(pageSize,page);//当前页开始记录
		final int length=pageSize;//每页记录数
		final int currentPage=Pager.countCurrentPage(page);
		List<Notices> vips=noticeDao.queryAll(hql, offset,length);//"一页"的记录

		//把分页信息保存到Bean中
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
 * 根据ID查询公告信息
 */
	public Notices queryOne(Long id) {
		Notices notice=noticeDao.queryOne(id);
		return notice;
	}
/**
 * 更新公告信息
 */
	public void updateNotice(Notices notice) {
		noticeDao.updateNotice(notice);
		
	}

}
