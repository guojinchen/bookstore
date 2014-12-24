package com.bookstore.bean;


/**
 * Advice entity. @author MyEclipse Persistence Tools
 */

public class Advice implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 5319049455815376841L;
	private Long adviceId;
	private String adviceContent;
	private String phone;
	private String email;
	private String adviceName;

	// Constructors

	/** default constructor */
	public Advice() {
	}

	/** full constructor */
	public Advice(String adviceContent, String phone, String email,
			String adviceName) {
		this.adviceContent = adviceContent;
		this.phone = phone;
		this.email = email;
		this.adviceName = adviceName;
	}

	// Property accessors

	public Long getAdviceId() {
		return this.adviceId;
	}

	public void setAdviceId(Long adviceId) {
		this.adviceId = adviceId;
	}

	public String getAdviceContent() {
		return this.adviceContent;
	}

	public void setAdviceContent(String adviceContent) {
		this.adviceContent = adviceContent;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdviceName() {
		return this.adviceName;
	}

	public void setAdviceName(String adviceName) {
		this.adviceName = adviceName;
	}

}