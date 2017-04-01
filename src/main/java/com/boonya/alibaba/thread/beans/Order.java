package com.boonya.alibaba.thread.beans;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 模拟一个订单Java Bean
 * @package com.boonya.alibaba.thread.beans.Order
 * @date   2017年4月1日  上午9:31:10
 * @author pengjunlin
 * @comment   
 * @update
 */
public class Order {
	
	/**
	 * 模拟自动生成一个ID
	 */
	private String id="O"+System.currentTimeMillis();
	
	/**
	 * 订单编码
	 */
	private String orderCode;
	
	/**
	 * 商品总价
	 */
	private BigDecimal productTotalPrice;
	
	/**
	 * 商品折扣
	 */
	private BigDecimal productDiscount;
	
	
	/**
	 * 成交价格
	 */
	private BigDecimal productDiscountTotalPrice;
	
	/**
	 * 订单详情列表
	 */
	private List<OrderDetail> orderDetails;
	
	/**
	 * 收货人ID(receiverId CustomerID)
	 */
	private String receiverId;
	
	/**
	 * 收货人
	 */
	private String receiver;
	
	/**
	 * 收货人地址
	 */
	private String receiverAddress;
	
	/**
	 * 收货人联系方式
	 */
	private String receiverReceiverContact;
	
	
	/**
	 * 发货人ID（senderId BusinessID商家ID）
	 */
	private String senderId;
	
	/**
	 * 发货人
	 */
	private String sender;
	
	/**
	 * 发货人地址
	 */
	private String senderAddress;
	
	/**
	 * 发货人联系方式
	 */
	private String senderContact;
	
	/**
	 * 支付类型：支付宝、蚂蚁花呗等
	 */
	private int orderPayType;
	
	/**
	 * 支付状态：待支付、支付完成、放弃支付
	 */
	private int orderPayStatus;
	
	/**
	 * 订单状态
	 */
	private int orderProcessStatus;
	
	/**
	 * 订单创建时间
	 */
	private Date orderCreateTime;
	
	/**
	 * 订单支付时间
	 */
	private Date orderPayTime;
	
	/**
	 * 订单关闭时间
	 */
	private Date orderCloseTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public BigDecimal getProductTotalPrice() {
		return productTotalPrice;
	}

	public void setProductTotalPrice(BigDecimal productTotalPrice) {
		this.productTotalPrice = productTotalPrice;
	}

	public BigDecimal getProductDiscount() {
		return productDiscount;
	}

	public void setProductDiscount(BigDecimal productDiscount) {
		this.productDiscount = productDiscount;
	}

	public BigDecimal getProductDiscountTotalPrice() {
		return productDiscountTotalPrice;
	}

	public void setProductDiscountTotalPrice(BigDecimal productDiscountTotalPrice) {
		this.productDiscountTotalPrice = productDiscountTotalPrice;
	}

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public String getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getReceiverAddress() {
		return receiverAddress;
	}

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverReceiverContact() {
		return receiverReceiverContact;
	}

	public void setReceiverReceiverContact(String receiverReceiverContact) {
		this.receiverReceiverContact = receiverReceiverContact;
	}

	public String getSenderId() {
		return senderId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getSenderAddress() {
		return senderAddress;
	}

	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}

	public String getSenderContact() {
		return senderContact;
	}

	public void setSenderContact(String senderContact) {
		this.senderContact = senderContact;
	}

	public int getOrderPayType() {
		return orderPayType;
	}

	public void setOrderPayType(int orderPayType) {
		this.orderPayType = orderPayType;
	}

	public int getOrderPayStatus() {
		return orderPayStatus;
	}

	public void setOrderPayStatus(int orderPayStatus) {
		this.orderPayStatus = orderPayStatus;
	}

	public int getOrderProcessStatus() {
		return orderProcessStatus;
	}

	public void setOrderProcessStatus(int orderProcessStatus) {
		this.orderProcessStatus = orderProcessStatus;
	}

	public Date getOrderCreateTime() {
		return orderCreateTime;
	}

	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public Date getOrderPayTime() {
		return orderPayTime;
	}

	public void setOrderPayTime(Date orderPayTime) {
		this.orderPayTime = orderPayTime;
	}

	public Date getOrderCloseTime() {
		return orderCloseTime;
	}

	public void setOrderCloseTime(Date orderCloseTime) {
		this.orderCloseTime = orderCloseTime;
	}
	
	

}
