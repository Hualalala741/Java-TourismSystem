package com.tjl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//��mysql����
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("�������سɹ���");
			//�������ݿ�,������Ӷ���
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/tourism_line","root","1234");
			System.out.println("���ӳɹ���");
			//����ִ�л���
			Statement statement = conn.createStatement();
			//ִ��sql��䣬�õ������
			ResultSet result = statement.executeQuery("SELECT * FROM  tourism_line");
			while (result.next()) {
				System.out.print(result.getString("name")+" ");
				System.out.print(result.getString("cost")+" ");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ʧ�ܣ�");
		}

	}

	

}
