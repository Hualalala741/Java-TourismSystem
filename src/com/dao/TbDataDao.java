package com.dao;



import java.util.ArrayList;
import java.util.List;

import com.model.TbData;

import jdbc.util.JDBCUtil;

public class TbDataDao {
	JDBCUtil jdbc =new JDBCUtil();
	
	public void insertData(String troute_num,String torigin,String tattractions,String tday_num,String tprice) {
		
		String sql="insert into tourism_line values(?,?,?,?,?)";
		
		jdbc.updataPreparedStatement(sql,troute_num,torigin,tattractions,tday_num,tprice);
	}

//	public List<TbData> queryTbData(String tname){
//		String sql= "select * from data where 1=1";
//		List params=new ArrayList();
//		if (tname!=null && !tname.equals("")) {
//			params.add(tname);
//		}
//		//����ǿյľͰ����ж�����ȥ
////		List<TbData> data=jdbc.queryPreparedStatement(sql,TbData.class,params);
//		
//	    return data;


}
	

