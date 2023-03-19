package com.tjl.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class sjklj {
	public Connection connection;

	public sjklj(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String user = "root";
		    String pass = "1234";
			
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","1234"); 
			System.out.println("数据库连接成功");
		}catch (Exception e) {
		
		System.out.println("数据库连接失败\n"+e.toString());
		}
	}
	public void close(){
	   try{
	       this.connection.close();
	   }catch(Exception e){
	       e.printStackTrace();
	   }
	}
	
	public void yzmm(String name,String passwords){
	String sql="SELECT * FROM user WHERE uname ='"+name+"'and upass='"+passwords+"'";
	try{
	Statement stmt=(Statement)this.connection.createStatement();
	 ResultSet rs=(ResultSet)stmt.executeQuery(sql);
	 if(rs.next()==true){
		 JOptionPane.showMessageDialog(null,"登录成功！","提示窗口",JOptionPane.INFORMATION_MESSAGE);
	 }
	 else {
		 JOptionPane.showMessageDialog(null,"登录失败：请检查用户和密码是否正确！","提示窗口",JOptionPane.WARNING_MESSAGE);
	 }
	stmt.close();
	}catch(Exception e){
	 e.printStackTrace();
	}
	}


	
}
