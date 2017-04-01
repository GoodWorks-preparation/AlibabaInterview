package com.boonya.alibaba.thread.beans;

import java.math.BigDecimal;

/**
 * 模拟一个订单Java Bean
 * @package com.boonya.alibaba.thread.beans.Order
 * @date   2017年4月1日  上午9:31:10
 * @author pengjunlin
 * @comment   
 * @update
 */
public class OrderDetail {
	
	/**
	 * 模拟自动生成一个ID
	 */
	private String id="D"+System.currentTimeMillis();
	
	/**
	 * 订单编码
	 */
	private String orderCode;
	
	/**
	 * 订单详情编码
	 */
	private String orderDetailCode;
	
	/**
	 * 商品名称
	 */
	private String productName;
	
	/**
	 * 商品编码
	 */
	private String productCode;
	
	/**
	 * 商品价格
	 */
	private BigDecimal productPrice;
	
	/**
	 * 商品折扣
	 */
	private BigDecimal productDiscount;
	
	
	/**
	 * 成交价格
	 */
	private BigDecimal tradePrice;


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


	public String getOrderDetailCode() {
		return orderDetailCode;
	}


	public void setOrderDetailCode(String orderDetailCode) {
		this.orderDetailCode = orderDetailCode;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductCode() {
		return productCode;
	}


	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}


	public BigDecimal getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}


	public BigDecimal getProductDiscount() {
		return productDiscount;
	}


	public void setProductDiscount(BigDecimal productDiscount) {
		this.productDiscount = productDiscount;
	}


	public BigDecimal getTradePrice() {
		return tradePrice;
	}


	public void setTradePrice(BigDecimal tradePrice) {
		this.tradePrice = tradePrice;
	}
	
	

}
