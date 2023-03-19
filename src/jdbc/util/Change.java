package jdbc.util;

public class Change {
	JDBCUtil jdbc =new JDBCUtil();
		
		public void changeData(String troute_num,String torigin,String tattractions,String tday_num,String tprice) {
			
			String sql="insert into tourism_line values(?,?,?,?,?)";
			
			jdbc.updataPreparedStatement(sql,troute_num,torigin,tattractions,tday_num,tprice);

		}
		public void changeOrder(String order_name,String order_phone,String order_num,String order_id) {
					
					String sql="insert into `order` values(?,?,?,?)";
					
					jdbc.updataPreparedStatement(sql, order_name, order_phone, order_num, order_id);
		
				}

		
}
