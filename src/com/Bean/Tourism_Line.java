package com.Bean;

public class Tourism_Line {
	//旅游线路表
	
	private	 String route_num;//路线号
	private	 String origin;//地点
	private	 String price;//价格
	private	 String day_num;//天数
	private	 String attractions;//主要景点
		 @Override
		 public String toString() {
		  return "Tourism_Line [route_num=" + route_num + ", origin=" + origin + ", price=" + price
		    + ", day_num=" + day_num + ", attractions=" + attractions + "]";
		 }
		 public Tourism_Line(String route_num, String origin, String destination, String day_num, String attractions) {
		  super();
		  this.route_num = route_num;
		  this.origin = origin;
		  this.price = price;
		  this.day_num = day_num;
		  this.attractions = attractions;
		 }
		 public Tourism_Line() {
		  super();
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
		 public String getPrice() {
		  return price;
		 }
		 public void setPrice(String price) {
		  this.price = price;
		 }
		 public String getDay_num() {
		  return day_num;
		 }
		 public void setDay_num(String day_num) {
		  this.day_num = day_num;
		 }
		 public String getAttractions() {
		  return attractions;
		 }
		 public void setAttractions(String attractions) {
		  this.attractions = attractions;
		 }
		 
}
