package jdbc.util;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.swing.JOptionPane;

public class JDBCUtil {
	//���ݿ�����
	private static Connection conn=null;
	private PreparedStatement psmt=null;
	private ResultSet rs=null;
	private static String url="jdbc:mysql://localhost:3306/data?useUnicode=true&characterEncoding=UTF-8";
    private static String username="root";
    private static String password="1234";
    private static String driver;
    
    //��ȡ�ļ���ִֻ��һ�Σ������þ�̬����飬����ѽ��
    static {
    	//��������
    	try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    }
    
    //��ȡ����
    
    public static Connection getConn() {
    	try {
			conn = DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
    }
    
    //��ɾ�� ?�Ĳ���params
    //���� updata
    public void updataPreparedStatement(String sql, Object...params){
    	getConn();
    	try {
    		//Ԥ���룿
			psmt=conn.prepareStatement(sql);
			
			if(params!=null) {
				for(int i=0;i<params.length;i++) {
				
					psmt.setObject(i+1, params[i]);
				}
			}
			psmt.execute();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
          
    public static ResultSet query(String sql) {
		System.out.println(sql);
		//��ȡ����
		getConn();
		PreparedStatement psd;
		try {
			psd = conn.prepareStatement(sql);
			System.out.println("��������");
			return psd.executeQuery();
		} catch (SQLException e) {
			System.out.println("����");
			JOptionPane.showMessageDialog(null,"ִ��������\n"+e.toString());
			e.printStackTrace();
		}
		return null;
	}
    
    public static int updataInfo(String sql) {
		System.out.println(sql);
		//��ȡ����
		getConn();
		try {
			PreparedStatement psd=conn.prepareStatement(sql);
			return psd.executeUpdate();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"ִ��������\n"+e.toString());
			e.printStackTrace();
		}
		return 0;
	}
    //�ر�
    
    public void close() {
    	try {
			if(psmt!=null) {
				psmt.close();
			}
			if(conn!=null) {
				conn.close();
			}
			if(rs!=null) {
				rs.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
 }
    
