package com.dao;

import com.Bean.Tourism_Line;
import java.util.List;
import java.util.ArrayList;

import com.jdbc.JDBCUtils;


public class UserDao_Imp {
	JDBCUtils jdbc =new JDBCUtils();
	
	public void insertData(String uname ,String upass,String user_state) {
		
		String sql="insert into user values(null,?,?,?)";
		
		jdbc.updataPreparedStatement(sql,uname,upass,user_state);
	}
	
	
	
	
	
	public List<Tourism_Line> queryTourism_Line(String origin){
		String sql="select*from tourism_line where 1=1";
		List params = new ArrayList();
		if(origin!=null && !origin.equals(" ")) {
			params.add(origin);
			sql="SELECT * FROM tourism_line WHERE origin = ?  ";
		}
		
		
		List<Tourism_Line> types=jdbc.queryPreparedStatement(sql,Tourism_Line.class, params);
		return types;
	}
	
	
}






