package com.example.vo;

/**
 * 购物车服务详情类
 * @author wsj
 *
 */
public class CartProduct {
	/** ID */
	public int id;

	/** 服务名称 */
	public String name;

	/** 服务价格 */
	public double price;

	/** 服务图片URL */
	public String pic;
	
	/** 日期 */
	public String time;


	/** 服务数量，0为缺货或下架 */
	public int number;

	/** 服务购买数量上限 */
	public int uplimit;

	/** 优惠价格  */
	public double checkout_service;
	
	/** 总金额 */
	public double checkout_app;
	

	public CartProduct() {
	}

	public CartProduct(int id, String name, double price, String pic, String time, int number,
			int uplimit, double checkout_service ,double checkout_app) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.pic = pic;
		this.time = time;
		this.number = number;
		this.uplimit = uplimit;
		this.checkout_service = checkout_service;
		this.checkout_app = checkout_app;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String gettime() {
		return time;
	}

	public void settime(String time) {
		this.time = time;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}


	public int getUplimit() {
		return uplimit;
	}

	public void setUplimit(int uplimit) {
		this.uplimit = uplimit;
	}
	
	public double getcheckout_service() {
		return checkout_service;
	}
	
	public void setcheckout_service(double checkout_service) {
		this.checkout_service = checkout_service;
	}
	
	public double getcheckout_app() {
		return checkout_app;
	}
	
	public void setcheckout_app(double checkout_app) {
		this.checkout_app = checkout_app;
	}

}
