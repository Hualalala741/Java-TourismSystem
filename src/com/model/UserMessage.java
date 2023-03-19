package com.model;

public class UserMessage {
	String tid;
	String uname;
	String upass;
	
	@Override
	public String toString() {
		return "User [tid=" + tid + ", uname=" + uname + ", upass=" + upass + "]";
	}
	
	public UserMessage() {
		super();
		// TODO Auto-generated constructor stub
		this.tid=tid;
		this.uname=uname;
		this.upass=upass;
	}
	
	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
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
