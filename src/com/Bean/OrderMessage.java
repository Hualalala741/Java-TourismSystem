package com.Bean;

public class OrderMessage {
	
		String order_name;
		String order_phone;
		String order_num;
		String order_id;
		
		@Override
		public String toString() {
			return "OrderMessage [order_name=" + order_name + ", order_phone=" + order_phone + ", order_num=" + order_num
					+ ", order_id=" + order_id + "]";
		}
		
		
		public String getOrder_name() {
				return order_name;
			}
			public void setOrder_name(String order_name) {
				this.order_name = order_name;
			}
			public String getOrder_phone() {
				return order_phone;
			}
			public void setOrder_phone(String order_phone) {
				this.order_phone = order_phone;
			}
			public String getOrder_num() {
				return order_num;
			}
			public void setOrder_num(String order_num) {
				this.order_num = order_num;
			}
			public String getOrder_id() {
				return order_id;
			}
			public void setOrder_id(String order_id) {
				this.order_id = order_id;
			}
	}

