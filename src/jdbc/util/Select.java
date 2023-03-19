package jdbc.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.model.Message;
import com.model.OrderMessage;
import com.model.Tourism_Line;
import com.model.UserMessage;

public class Select {
	
	//����·��
		public Object[][] getLineInfo(String sql) {
			System.out.println("�����ˣ�");
			
			ResultSet resultSet = JDBCUtil.query(sql);
			ArrayList<Tourism_Line> list= new ArrayList<Tourism_Line>();
			try {
				while (resultSet.next()) {
					Tourism_Line t=new Tourism_Line();
					t.setRoute_num(resultSet.getString(1));
					t.setOrigin(resultSet.getString(2));
					t.setAttractions(resultSet.getString(3));
					t.setDay_num(resultSet.getString(4));
					t.setPrice(resultSet.getString(5));
					list.add(t);
					System.out.print("������");
				}
			} catch (SQLException e) {
//				System.out.print("��");
				e.printStackTrace();
			}
			Object[][] objects=new Object[list.size()][5];
			for(int i=0;i<list.size();i++) {
				objects[i][0]=list.get(i).getRoute_num();
				objects[i][1]=list.get(i).getOrigin();
				objects[i][2]=list.get(i).getAttractions();
				objects[i][3]=list.get(i).getDay_num();
				objects[i][4]=list.get(i).getPrice();
			}
			return objects;
		}
		
		//�õ�һ������
		public String getString(String sql) {
			ResultSet resultSet=JDBCUtil.query(sql);
			try {
				if (resultSet.next()) {
					return resultSet.getString(1);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}
		
		//�õ��û�����
		public Object[][] getUserInfo(String sql) {
			System.out.println("�����ˣ�");
			
			ResultSet resultSet = JDBCUtil.query(sql);
			ArrayList<UserMessage> list= new ArrayList<UserMessage>();
			try {
				while (resultSet.next()) {
					UserMessage u=new UserMessage();
					u.setTid(resultSet.getString(1));
					u.setUname(resultSet.getString(2));
					u.setUpass(resultSet.getString(3));
					list.add(u);
					System.out.print("������");
				}
			} catch (SQLException e) {
//				System.out.print("��");
				e.printStackTrace();
			}
			Object[][] objects=new Object[list.size()][3];
			for(int i=0;i<list.size();i++) {
				objects[i][0]=list.get(i).getTid();
				objects[i][1]=list.get(i).getUname();
				objects[i][2]=list.get(i).getUpass();
			}
			return objects;
		}
		
		//�õ�Ԥ������
		public Object[][] getOrderInfo(String sql) {
			
			
			ResultSet resultSet = JDBCUtil.query(sql);
			ArrayList<OrderMessage> list= new ArrayList<OrderMessage>();
			try {
				while (resultSet.next()) {
					OrderMessage o=new OrderMessage();
					o.setOrder_name(resultSet.getString(1));
					o.setOrder_phone(resultSet.getString(2));
					o.setOrder_num(resultSet.getString(3));
					o.setOrder_id(resultSet.getString(4));
					list.add(o);
				}
			} catch (SQLException e) {

				e.printStackTrace();
			}
			Object[][] objects=new Object[list.size()][4];
			for(int i=0;i<list.size();i++) {
				objects[i][0]=list.get(i).getOrder_name();
				objects[i][1]=list.get(i).getOrder_phone();
				objects[i][2]=list.get(i).getOrder_num();
				objects[i][3]=list.get(i).getOrder_id();
			}
			return objects;
		}
		
		//����message��Ϣ
		public ArrayList<Message> getMessage(String sql) {
			ResultSet resultSet = JDBCUtil.query(sql);
			ArrayList<Message> list= new ArrayList<Message>();
			try {
				while (resultSet.next()) {
					Message m=new Message();
					m.setMessage(resultSet.getString(1));
					m.setType(resultSet.getString(2));
					
					list.add(m);
				}
			} catch (SQLException e) {
//				System.out.print("��");
				e.printStackTrace();
			}
			
			return list;
		}
		
		//��ѯ��������
		public int getCount(String sql) {
			ResultSet resultSet=JDBCUtil.query(sql);
			try {
				if (resultSet.next()) {
					return resultSet.getInt(1);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return 0;
		}
		

}
