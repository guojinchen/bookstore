package com.bookstore.action;

import com.bookstore.bean.Notices;
import com.bookstore.service.NoticeService;
import com.bookstore.util.Pager;

public class NoticeAction {
	private int page;//�ڼ�ҳ
	private Pager pager;//�����ֲ���Ϣ��bean
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
	 * ��ҳ��ѯ���еĹ�����Ϣ
	 * @return
	 */
	public String queryAll(){
		String hql="from Notices";
		pager=noticeService.queryAll(hql, 6, page);
		return"success";
		
	}
	/**
	 * ����µĹ�����Ϣ
	 * @return
	 */
	public String addNotice(){
		noticeService.addNotice(notice);
		return"success";
	}
	/**
	 * ɾ��������Ϣ
	 * @return
	 */
	public String delNotice(){
		noticeService.deleteNotice(notice);
		return"success";
	}
	/**
	 * ����ID��ѯ������Ϣ������ǰ��
	 * @return
	 */
	public String queryOne(){
		notice=noticeService.queryOne(notice.getNoticeId());
		return"success";
	}
	/**
	 * ���¹�����Ϣ
	 * @return
	 */
	public String updateNotice(){
		noticeService.updateNotice(notice);
		return"success";
	}
}
