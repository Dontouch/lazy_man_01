package com.example.vo;

/**
 * 推荐品牌
 * @author Dontouch
 *
 */

/*
 * "value":
		  [
			{
			  "id": "1201"           //商家（家政公司）编号
			  "name": "touch",       //商家名称
			  "pic": ""              //商家图片URL
			},
			{
			  "id": "1201"           //商家（家政公司）编号
			  "name": "touch",       //商家名称
			  "pic": ""              //商家图片URL
			}
		  ]	
 */
public class Company {
	
	private int id;
	private String name;
	private String pic;

	public Company() {
	}

	public Company(int id, String name, String pic) {
		super();
		this.id = id;
		this.name = name;
		this.pic = pic;
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

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

}
