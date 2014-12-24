package com.bookstore.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Notices entity. @author MyEclipse Persistence Tools
 */

public class Notices implements java.io.Serializable {

	// Fields

	private Long noticeId;
	private String noticeContent;
	private Timestamp noticeTime;

	// Constructors

	/** default constructor */
	public Notices() {
	}

	/** full constructor */
	public Notices(String noticeContent, Timestamp noticeTime) {
		this.noticeContent = noticeContent;
		this.noticeTime = noticeTime;
	}

	// Property accessors

	public Long getNoticeId() {
		return this.noticeId;
	}

	public void setNoticeId(Long noticeId) {
		this.noticeId = noticeId;
	}

	public String getNoticeContent() {
		return this.noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public Timestamp getNoticeTime() {
		return this.noticeTime;
	}

	public void setNoticeTime(Timestamp noticeTime) {
		this.noticeTime = noticeTime;
	}

}