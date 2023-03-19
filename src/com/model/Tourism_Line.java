package com.model;

public class Tourism_Line {
	String route_num;//路线号
	String origin;//地点
	String attractions;//线路
	String day_num;//天数
	String price;//价格 
	
	@Override
	public String toString() {
		return "Tourism_Line [route_num=" + route_num + ", origin=" + origin + ", attractions=" + attractions
				+ ", day_num=" + day_num + ", price=" + price + "]";
	}
	
	public Tourism_Line() {
		super();
		this.route_num = route_num;
		this.origin = origin;
		this.price = price;
		this.day_num = day_num;
		this.attractions = attractions;
	}
	  
	
	public String getRoute_num() {
		return route_num;
	}
	public void setRoute_num(String route_num) {
		this.route_num = route_num;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getAttractions() {
		return attractions;
	}
	public void setAttractions(String attractions) {
		this.attractions = attractions;
	}
	public String getDay_num() {
		return day_num;
	}
	public void setDay_num(String day_num) {
		this.day_num = day_num;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	

}
