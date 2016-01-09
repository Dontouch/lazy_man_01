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
	
	/** 享受促销信息 */
	public List<String> cart_prom = new ArrayList<String>();
	
	/** 购物车总计*/
	public Addup cart_addup;

	public Cart() {

	}

	public Cart(List<CartProduct> servicelist, List<String> cart_prom, Addup cart_addup) {
		super();
		this.servicelist = servicelist;
		this.cart_prom = cart_prom;
		this.cart_addup = cart_addup;
	}

	public List<CartProduct> getservicelist() {
		return servicelist;
	}

	public void setservicelist(List<CartProduct> servicelist) {
		this.servicelist = servicelist;
	}

	public List<String> getCart_prom() {
		return cart_prom;
	}

	public void setCart_prom(List<String> cart_prom) {
		this.cart_prom = cart_prom;
	}

	public Addup getCart_addup() {
		return cart_addup;
	}

	public void setCart_addup(Addup cart_addup) {
		this.cart_addup = cart_addup;
	}

}
