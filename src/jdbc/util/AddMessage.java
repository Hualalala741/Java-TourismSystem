package jdbc.util;

public class AddMessage {
JDBCUtil jdbc =new JDBCUtil();
	
	public void insertMS(String word,String type) {
		
		String sql="insert into message values(?,?)";
		
		jdbc.updataPreparedStatement(sql,word,type);

	}
}
