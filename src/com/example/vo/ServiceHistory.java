package com.example.vo;

/**
 * 服务浏览记录
 * 
 * @author Dontouch
 * 
 */
public class ServiceHistory extends ServiceListVo implements
		Comparable<ServiceHistory> {

	private long time; // 浏览时间

	public ServiceHistory() {
	}

	public ServiceHistory(int id, String name, String pic, double marketprice,
			double price, int comment_count, long time) {
		super(id, name, pic, marketprice, price, comment_count);
		this.time = time;
	}

	public ServiceHistory(ServiceListVo serviceListVo) {
		super(serviceListVo.getId(), serviceListVo.getName(), serviceListVo
				.getPic(), serviceListVo.getMarketprice(), serviceListVo
				.getPrice(), serviceListVo.getComment_count());
		this.time = System.currentTimeMillis();
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	@Override
	public int compareTo(ServiceHistory another) {
		// TODO Auto-generated method stub
		return time > another.time ? 1 : -1;
	}

}
