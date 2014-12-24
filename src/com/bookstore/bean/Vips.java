package com.bookstore.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Vips entity. @author MyEclipse Persistence Tools
 */

public class Vips implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 877008640518772377L;
	@Override
	public String toString() {
		return "Vips [address=" + address + ", age=" + age + ", answer="
				+ answer + ", bookadjusts=" + bookadjusts + ", email=" + email
				+ ", mobilephone=" + mobilephone + ", orderses=" + orderses
				+ ", passwords=" + passwords + ", qq=" + qq + ", question="
				+ question + ", realname=" + realname + ", registertime="
				+ registertime + ", sex=" + sex + ", shoppingcars="
				+ shoppingcars + ", username=" + username + ", vipId=" + vipId
				+ "]";
	}

	private Long vipId;
	private String username;
	private String passwords;
	private String realname;
	private String sex;
	private Integer age;
	private String mobilephone;
	private String email;
	private String qq;
	private String address;
	private String question;
	private String answer;
	private Timestamp registertime;
	private Set orderses = new HashSet(0);
	private Set shoppingcars = new HashSet(0);
	private Set bookadjusts = new HashSet(0);

	// Constructors

	/** default constructor */
	public Vips() {
	}

	/** full constructor */
	public Vips(String username, String passwords, String realname, String sex,
			int age, String mobilephone, String email, String qq,
			String address, String question, String answer,
			Timestamp registertime, Set orderses, Set shoppingcars,
			Set bookadjusts) {
		this.username = username;
		this.passwords = passwords;
		this.realname = realname;
		this.sex = sex;
		this.age = age;
		this.mobilephone = mobilephone;
		this.email = email;
		this.qq = qq;
		this.address = address;
		this.question = question;
		this.answer = answer;
		this.registertime = registertime;
		this.orderses = orderses;
		this.shoppingcars = shoppingcars;
		this.bookadjusts = bookadjusts;
	}

	// Property accessors

	public Long getVipId() {
		return this.vipId;
	}

	public void setVipId(Long vipId) {
		this.vipId = vipId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswords() {
		return this.passwords;
	}

	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}

	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	



	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getMobilephone() {
		return this.mobilephone;
	}

	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Timestamp getRegistertime() {
		return this.registertime;
	}

	public void setRegistertime(Timestamp registertime) {
		this.registertime = registertime;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

	public Set getShoppingcars() {
		return this.shoppingcars;
	}

	public void setShoppingcars(Set shoppingcars) {
		this.shoppingcars = shoppingcars;
	}

	public Set getBookadjusts() {
		return this.bookadjusts;
	}

	public void setBookadjusts(Set bookadjusts) {
		this.bookadjusts = bookadjusts;
	}

}