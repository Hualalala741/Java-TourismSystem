package com.model;

public class Message {
	   String message;
	   String type;

	@Override
	public String toString() {
		return "Message [message=" + message + ", type=" + type + "]";
	}
  
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
