package com.bookstore.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Orders entity. @author MyEclipse Persistence Tools
 */

public class Orders implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -886755062523099767L;
	private Long orderId;
	private Vips vips;
	private Timestamp startTime;
	private Timestamp overTime;
	private String receiverAddress;
	private String receiverTelephone;
	private Double totalPrice;
	private String receiverName;
	private String isAffirm;
	private String isPay;
	private String isSendbook;
	private String isSave;
	private String receiverEmail;
	private String payType;
	private String postcode;
	private Set orderlists = new HashSet(0);

	// Constructors

	/** default constructor */
	public Orders() {
	}

	/** full constructor */
	public Orders(Vips vips, Timestamp startTime, Timestamp overTime,
			String receiverAddress, String receiverTelephone,
			Double totalPrice, String receiverName, String isAffirm,
			String isPay, String isSendbook, String isSave,
			String receiverEmail, String payType, String postcode,
			Set orderlists) {
		this.vips = vips;
		this.startTime = startTime;
		this.overTime = overTime;
		this.receiverAddress = receiverAddress;
		this.receiverTelephone = receiverTelephone;
		this.totalPrice = totalPrice;
		this.receiverName = receiverName;
		this.isAffirm = isAffirm;
		this.isPay = isPay;
		this.isSendbook = isSendbook;
		this.isSave = isSave;
		this.receiverEmail = receiverEmail;
		this.payType = payType;
		this.postcode = postcode;
		this.orderlists = orderlists;
	}

	// Property accessors

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Vips getVips() {
		return this.vips;
	}

	public void setVips(Vips vips) {
		this.vips = vips;
	}

	public Timestamp getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getOverTime() {
		return this.overTime;
	}

	public void setOverTime(Timestamp overTime) {
		this.overTime = overTime;
	}

	public String getReceiverAddress() {
		return this.receiverAddress;
	}

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverTelephone() {
		return this.receiverTelephone;
	}

	public void setReceiverTelephone(String receiverTelephone) {
		this.receiverTelephone = receiverTelephone;
	}

	public Double getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getReceiverName() {
		return this.receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getIsAffirm() {
		return this.isAffirm;
	}

	public void setIsAffirm(String isAffirm) {
		this.isAffirm = isAffirm;
	}

	public String getIsPay() {
		return this.isPay;
	}

	public void setIsPay(String isPay) {
		this.isPay = isPay;
	}

	public String getIsSendbook() {
		return this.isSendbook;
	}

	public void setIsSendbook(String isSendbook) {
		this.isSendbook = isSendbook;
	}

	public String getIsSave() {
		return this.isSave;
	}

	public void setIsSave(String isSave) {
		this.isSave = isSave;
	}

	public String getReceiverEmail() {
		return this.receiverEmail;
	}

	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public Set getOrderlists() {
		return this.orderlists;
	}

	public void setOrderlists(Set orderlists) {
		this.orderlists = orderlists;
	}

}