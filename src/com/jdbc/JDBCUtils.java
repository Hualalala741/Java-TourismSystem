package com.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.dao.DbConnection;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;






public class JDBCUtils {
	
	
	
	//数据库连接
	private Connection conn=null;
	private PreparedStatement psmt=null;
	private ResultSet rs=null;
	private String url="jdbc:mysql://localhost:3306/data?useUnicode=true&characterEncoding=UTF-8";
    private String username="root";
    private String password="admin";
    private static String driver;
    
    //读取文件，只执行一次，所以用静态代码块，不懂呀！
    static {
    	//加载驱动
    	try {
    		System.out.println("驱动加载成功");
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    }
    
    //获取连接
    
    public Connection getConn() {
    	try {
    		System.out.println("数据库连接成功");
			conn = DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
    }
    
    //增删改 ?的参数params
    //增加 updata
    public void updataPreparedStatement(String sql, Object...params){
    	//得到连接
    	getConn();
    	try {
    		//预编译？
			psmt=conn.prepareStatement(sql);
			
			if(params!=null) {
				for(int i=0;i<params.length;i++) {
					//参数为索引，值
					//遍历每个列
					psmt.setObject(i+1, params[i]);
				}
			}
			psmt.execute();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
//查询
    public <T>List<T>queryPreparedStatement(String sql,Class<T>clazz,List<Object>params){
    	getConn();
    	List<T>result = new ArrayList<T>();
    	try {
    		psmt=conn.prepareStatement(sql);
    		
    		if(params!=null) {
    			for(int i=0;i<params.size();i++) {
    				psmt.setObject(i+1, params.get(i));
    			}
    		}
    		rs=psmt.executeQuery();
    		ResultSetMetaData rsmd =(ResultSetMetaData) rs.getMetaData();
    		//读取列的数量
    		int count =rsmd.getColumnCount();
    		//储存所有的名字
    		List<String>column = new ArrayList<String>();
    			for(int i=0;i<count;i++) {
    				column.add(rsmd.getColumnName(i+1));
    			}
    			while(rs.next()) {
    				//创建对象
    				T obj = clazz.newInstance();
    				for(int i=0;i<count;i++) {
    					String name=column.get(i).toLowerCase();
    					//根据列名获取属性
    					Field f =clazz.getDeclaredField(name);
    					f.setAccessible(true);
    					//获取属性类型
    					String type=f.getType().getName();
    					if("int".equals(type)||"java.lang.Integer".equals(type)) {
    						int val=rs.getInt(name);
    						f.set(obj, val);
    						
    					}else if("double".equals(type)||"java.lang.Double".equals(type)) {
    						double val=rs.getDouble(name);
    						f.set(obj, val);
    						
    					}else if("float".equals(type)||"java.lang.Float".equals(type)) {
    						float val=rs.getFloat(name);
    						f.set(obj, val);
    						
    					}else if("java.lang.String".equals(type)) {
    						String val=rs.getString(name);
    						f.set(obj, val);
    					
    				}else if("java.lang.Date".equals(type)) {
    					Date val=rs.getDate(name);
						f.set(obj, val);
						
    			}else if("boolean".equals(type)||"java.lang.Boolean".equals(type)) {
    				boolean val=rs.getBoolean(name);
					f.set(obj, val);
					
    			
    		
    		
    	}
    }
    				result.add(obj);
    			}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    
    return result;
    }
    
    
    
    
    
    
    
    
    
    public <T>List<T> queryPreparedStatement(String sql,Class<T> clazz,Object...params){
    	getConn();
    	List<T>result = new ArrayList<T>();
    	try {
    		psmt=conn.prepareStatement(sql);
    		
    		if(params!=null) {
    			for(int i=0;i<params.length;i++) {
    				psmt.setObject(i+1, params[i]);
    			}
    		}
    		rs=psmt.executeQuery();
    		
    		ResultSetMetaData rsmd =(ResultSetMetaData) rs.getMetaData();
    		//读取列的数量
    		int count =rsmd.getColumnCount();
    		//储存所有列的名字
    		List<String>column = new ArrayList<String>();
    			for(int i=0;i<count;i++) {
    				column.add(rsmd.getColumnName(i+1));
    			}
    			while(rs.next()) {
    				//创建对象
    				T obj = clazz.newInstance();
    				for(int i=0;i<count;i++) {
    					String name=column.get(i).toLowerCase();
    					//根据列名获取属性
    					Field f =clazz.getDeclaredField(name);
    					f.setAccessible(true);
    					//获取属性类型
    					String type=f.getType().getName();
    					if("int".equals(type)||"java.lang.Integer".equals(type)) {
    						int val=rs.getInt(name);
    						f.set(obj, val);
    						
    					}else if("double".equals(type)||"java.lang.Double".equals(type)) {
    						double val=rs.getDouble(name);
    						f.set(obj, val);
    						
    					}else if("float".equals(type)||"java.lang.Float".equals(type)) {
    						float val=rs.getFloat(name);
    						f.set(obj, val);
    						
    					}else if("java.lang.String".equals(type)) {
    						String val=rs.getString(name);
    						f.set(obj, val);
    					
    				}else if("java.lang.Date".equals(type)) {
    					Date val=rs.getDate(name);
						f.set(obj, val);
						
    			}else if("boolean".equals(type)||"java.lang.Boolean".equals(type)) {
    				boolean val=rs.getBoolean(name);
					f.set(obj, val);
					
    		
    		
    	}
    }
    				result.add(obj);
    			}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    
    return result;
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
    
    
    
    //删除
    
    //关闭
    
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
    