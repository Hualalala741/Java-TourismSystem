package com.Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.Bean.OrderMessage;
import com.Bean.Tourism_Line;
import com.dao.DbConnection;
import com.jdbc.JDBCUtils;

import jdbc.util.JDBCUtil;



public class Select {
	//查询数据条数
		 public int getCount(String sql) {
		  ResultSet resultSet=DbConnection.query(sql);
		  try {
		   if (resultSet.next()) {
		    return resultSet.getInt(1);
		   }
		  } catch (SQLException e) {
		   e.printStackTrace();
		  }
		  return 0;
		 }
		 //得到一条数据
		 public String getString(String sql) {
		  ResultSet resultSet=DbConnection.query(sql);
		  try {
		   if (resultSet.next()) {
		    return resultSet.getString(1);
		   }
		  } catch (SQLException e) {
		   e.printStackTrace();
		  }
		  return null;

}
		//旅游信息表
		 public Object[][] getLineInfo() {
		  String sql="SELECT * FROM tourism_line";
		  ResultSet resultSet = DbConnection.query(sql);
		  ArrayList<Tourism_Line> list=new ArrayList<Tourism_Line>();
		  try {
		   while (resultSet.next()) {
		    Tourism_Line t=new Tourism_Line();
		    t.setRoute_num(resultSet.getString(1));
		    t.setOrigin(resultSet.getString(2));
		    t.setPrice(resultSet.getString(3));
		    t.setDay_num(resultSet.getString(4));
		    t.setAttractions(resultSet.getString(5));
		    list.add(t);
		   }
		  } catch (SQLException e) {
		   e.printStackTrace();
		  }
		  Object[][] objects=new Object[list.size()][5];
		  for(int i=0;i<list.size();i++) {
		   objects[i][0]=list.get(i).getRoute_num();
		   objects[i][1]=list.get(i).getOrigin();
		   objects[i][2]=list.get(i).getPrice();
		   objects[i][3]=list.get(i).getDay_num();
		   objects[i][4]=list.get(i).getAttractions();
		  }
		  return objects;
		 }



	//用户登录
	public int Select(String username ,String password) {
		String sql="select * from user where upass='"+password+"'  and uname='"+username+"'";
		ResultSet resultSet=DbConnection.query(sql);
		int a=0;
		try {
			while (resultSet.next()) {
				a=1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}
	
	//得到预定数据
	public Object[][] getOrderMessage(String sql) {
	 
		
	 ResultSet resultSet = DbConnection.query(sql);
	 ArrayList<OrderMessage> list= new ArrayList<OrderMessage>();
	 try {
	  while (resultSet.next()) {
	   OrderMessage o=new OrderMessage();
	   o.setOrder_name(resultSet.getString(1));
	   o.setOrder_phone(resultSet.getString(2));
	   o.setOrder_num(resultSet.getString(3));
	   o.setOrder_id(resultSet.getString(4));
	   list.add(o);
	  }
	 } catch (SQLException e) {
	
	  e.printStackTrace();
	 }
	 Object[][] objects=new Object[list.size()][4];
	 for(int i=0;i<list.size();i++) {
	  objects[i][0]=list.get(i).getOrder_name();
	  objects[i][1]=list.get(i).getOrder_phone();
	  objects[i][2]=list.get(i).getOrder_num();
	  objects[i][3]=list.get(i).getOrder_id();
	 }
	 return objects;
	}
}