package com.tjl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//加mysql驱动
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("驱动加载成功！");
			//链接数据库,获得连接对象
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/tourism_line","root","1234");
			System.out.println("连接成功！");
			//创建执行环境
			Statement statement = conn.createStatement();
			//执行sql语句，得到结果集
			ResultSet result = statement.executeQuery("SELECT * FROM  tourism_line");
			while (result.next()) {
				System.out.print(result.getString("name")+" ");
				System.out.print(result.getString("cost")+" ");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("失败！");
		}

	}

	

}
