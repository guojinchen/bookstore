package com.bookstore.action;

import com.bookstore.bean.Notices;
import com.bookstore.service.NoticeService;
import com.bookstore.util.Pager;

public class NoticeAction {
	private int page;//第几页
	private Pager pager;//包含分布信息的bean
	private NoticeService noticeService;
	private Notices notice;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public Pager getPager() {
		return pager;
	}
	public void setPager(Pager pager) {
		this.pager = pager;
	}
	public NoticeService getNoticeService() {
		return noticeService;
	}
	public void setNoticeService(NoticeService noticeService) {
		this.noticeService = noticeService;
	}
	public Notices getNotice() {
		return notice;
	}
	public void setNotice(Notices notice) {
		this.notice = notice;
	}
	/**
	 * 分页查询所有的公告信息
	 * @return
	 */
	public String queryAll(){
		String hql="from Notices";
		pager=noticeService.queryAll(hql, 6, page);
		return"success";
		
	}
	/**
	 * 添加新的公告信息
	 * @return
	 */
	public String addNotice(){
		noticeService.addNotice(notice);
		return"success";
	}
	/**
	 * 删除公告信息
	 * @return
	 */
	public String delNotice(){
		noticeService.deleteNotice(notice);
		return"success";
	}
	/**
	 * 根据ID查询公告信息，更新前用
	 * @return
	 */
	public String queryOne(){
		notice=noticeService.queryOne(notice.getNoticeId());
		return"success";
	}
	/**
	 * 更新公告信息
	 * @return
	 */
	public String updateNotice(){
		noticeService.updateNotice(notice);
		return"success";
	}
}
