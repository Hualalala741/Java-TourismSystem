//封装
package com.dao;


public class User {
	private String uname;
	private String upass;
	
	
	
//一个参数
	public User() {
		super();
	}
	
//两个参数
	public User(String uname, String upass) {
		super();
		this.uname = uname;
		this.upass = upass;
	}



	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	

}
