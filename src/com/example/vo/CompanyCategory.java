package com.example.vo;

import java.util.ArrayList;
import java.util.List;


/**
 * 推荐的商家
 * 
 * @author Dontouch
 * 
 */

/*
 * {"response": "company", "company": [ { "key":"清洁专区", //分区名称 "value": [ {
 * "id": "1201" //商家（家政公司）编号 "name": "touch", //商家名称 "pic": "" //商家图片URL }, {
 * "id": "1201" //商家（家政公司）编号 "name": "touch", //商家名称 "pic": "" //商家图片URL } ] },
 * { "key":"护理专区", "value": [ { "id": "1201" //商家（家政公司）编号 "name": "touch",
 * //商家名称 "pic": "" //商家图片URL }, { "id": "1201" //商家（家政公司）编号 "name": "touch",
 * //商家名称 "pic": "" //商家图片URL } ] } ]}
 */
public class CompanyCategory {

	/** 分区名称 */
	private String key;

	/** 栏目下所有的 Brands */
	private List<Company> value = new ArrayList<Company>();

	public CompanyCategory() {

	}

	public CompanyCategory(String key, List<Company> value) {
		super();
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public List<Company> getValue() {
		return value;
	}

	public void setValue(List<Company> value) {
		this.value = value;
	}

}
