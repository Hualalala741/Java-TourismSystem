package com.jdbc;

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
		    String pass = "admin";
			
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","admin"); 
			System.out.println("数据库连接成功");
		}catch (Exception e) {
		
		System.out.println("数据库连接失败"+e.toString());
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
		 JOptionPane.showMessageDialog(null,"登录成功","提示窗口",JOptionPane.INFORMATION_MESSAGE);
		
	 }
	 else {
		 JOptionPane.showMessageDialog(null,"登录失败","提示窗口",JOptionPane.WARNING_MESSAGE);
		
	 }
	stmt.close();
	}catch(Exception e){
	 e.printStackTrace();
	}
	}

	
	public void add(String name,String passwords){
		String sql="insert into user (uname,upass) values('"+name+"','"+passwords+"')";
		try{
		 PreparedStatement preStmt=(PreparedStatement)this.connection.prepareStatement(sql);
		 preStmt.executeUpdate();
		 System.out.println("插入数据成功！");
		 preStmt.close();
		}catch(Exception e){
		 e.printStackTrace();
		}
		}
		public void update(String name,String passwords){
		    String sql="update us set uname=? where upass=?";
		    try{
		    	 PreparedStatement prestmt=(PreparedStatement)this.connection.prepareStatement(sql);
		         prestmt.setString(2, name);
		         prestmt.setString(1,passwords);
		         prestmt.executeUpdate();
		        System.out.println("更改数据成功！");

		    }catch(Exception e){
		        e.printStackTrace();
		    }
		}

	
}
