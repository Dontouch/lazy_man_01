package com.example.vo;

import java.util.ArrayList;
import java.util.List;
/**
 * 购物车信息
 * @author wsj
 *
 */
public class Cart {
	/** 服务列表 */
	public List<CartProduct> servicelist = new ArrayList<CartProduct>();
	
	/** 优惠价格  */
	public double checkout_service;
	
	/** 总金额 */
	public double checkout_app;
	
	/** 购物车总计*/
	public Addup cart_addup;

	public Cart() {

	}

	public Cart(List<CartProduct> servicelist, List<String> cart_prom, Addup cart_addup) {
		super();
		this.servicelist = servicelist;
		this.cart_addup = cart_addup;
	}

	public List<CartProduct> getservicelist() {
		return servicelist;
	}

	public void setservicelist(List<CartProduct> servicelist) {
		this.servicelist = servicelist;
	}

	public Addup getCart_addup() {
		return cart_addup;
	}

	public void setCart_addup(Addup cart_addup) {
		this.cart_addup = cart_addup;
	}

}
