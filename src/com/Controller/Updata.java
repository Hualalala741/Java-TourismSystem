package com.Controller;

import com.dao.DbConnection;

public class Updata {
	//添加数据
		 public int addData(String sql) {
		  
		  return DbConnection.updataInfo(sql);
		 }
}
