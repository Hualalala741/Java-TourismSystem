package com.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class JDBC {

	public static void main(String[] args) {
		//����MySQL����
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("驱动加载成功");
		//�������ݿ⣬��������Ӷ���
  		    Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/data?useUnicode=true&characterEncoding=UTF-8","root","admin");
  		    System.out.println("数据库加载成功");
		//����ִ�л���
  		    Statement statement = conn.createStatement();
  	   //ִ��sql��䣬�õ������
  		    ResultSet result = statement.executeQuery("select*from user");//���ݿⲻ���ִ�Сд
  		 
  		    while(result.next()) {
  		    	
  		    	System.out.print(result.getString("uname")+"  ");
  		    	System.out.print(result.getString("upass")+"  ");
  		    	System.out.println(result.getString("user_state"));

  		    }
  		    
		} catch (Exception e) {
		
			e.printStackTrace();
			System.out.println("驱动加载失败");
			System.out.println("数据库加载失败");
		}
	}

}

