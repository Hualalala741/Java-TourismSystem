package com.Bean;

public class UserMessage {
	 String user_account;//用户账户
	 String user_password;//用户密码
	 
	 @Override
	 public String toString() {
		 return "User [user_account=" + user_account +  ", user_password=" + user_password
				    + "]";
	 }
	 public UserMessage() {
	  super();
	 }
	 public UserMessage( String user_account, String user_password) {
	  super();
	 
	  this.user_account = user_account;
	  this.user_password = user_password;
	 
	 }
	
	 public String getUser_account() {
	  return user_account;
	 }
	 public void setUser_account(String user_account) {
	  this.user_account = user_account;
	 }
	 public String getUser_password() {
	  return user_password;
	 }
	 public void setUser_password(String user_password) {
	  this.user_password = user_password;
	 }
	
	 
	}


