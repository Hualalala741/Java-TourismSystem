package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Statement;


public class DbConnection {
	 //驱动类的类名
	 private static final String DRIVERNAME="com.mysql.jdbc.Driver";
	 //连接数据的URL路径
	// private static final String 
	 private static final String URL="jdbc:mysql://localhost:3306/data?useUnicode=true&characterEncoding=UTF-8";
	 //数据库登录账号
	// private static final String USER
	 private static final String USER="root";
	 //数据库登录密码
	// private static final String PASSWORD
	 private static final String PASSWORD="admin";
	 //加载驱动
	 static{
	  try {
	   Class.forName(DRIVERNAME);
	  } catch (ClassNotFoundException e) {
	   e.printStackTrace();
	  }
	 }
	    //获取数据库连接
	 public static Connection getConnection() {
	           try {
	  return DriverManager.getConnection(URL,USER,PASSWORD);
	            } catch (SQLException e) { 
	  e.printStackTrace();
	            }
	   return null;
	 }
	 //查询
	 public static ResultSet query(String sql) {
	  System.out.println(sql);
	  //获取连接
	  Connection connection=getConnection();
	  PreparedStatement psd;
	  try {
	   psd = connection.prepareStatement(sql);
	   return psd.executeQuery();
	  } catch (SQLException e) {
	   JOptionPane.showMessageDialog(null,"执行语句出错\n"+e.toString());
	   e.printStackTrace();
	  }
	  return null;
	 }
	 //增、删、改、查
	  public static int updataInfo(String sql) {
	   System.out.println(sql);
	   //获取连接
	   Connection connection=getConnection();
	   try {
	    PreparedStatement psd=connection.prepareStatement(sql);
	    return psd.executeUpdate();
	   } catch (SQLException e) {
	    JOptionPane.showMessageDialog(null,"执行语句出错\n"+e.toString());
	    e.printStackTrace();
	   }
	   return 0;
	  }
	 //关闭连接
	 public  static  void colse(ResultSet rs,Statement stmt,Connection  conn) throws Exception{
	           try { if (rs != null){ rs.close(); }
	                           if (stmt != null) { stmt.cancel(); }
	   if (conn != null) { conn.close(); }
	    } catch (Exception e) {
	     e.printStackTrace(); throw new Exception();
	    }
	 }
	} 


