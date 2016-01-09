package com.example.vo;

/**
 *  促销快报
 * @author Dontouch
 *
 */


/*
 * {
  "response": "topic",
  " topic ": [
{
  "id": "专题活动ID",
      "name": "专题活动名称",
      "pic": "图片URL"
    },
{
  "id": "专题活动ID",
      "name": "专题活动名称",
      "pic": "图片URL"
    }
  ]
}
 */
public class BulletinVo {

	private String id;
	private String name;
	private String pic;

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
