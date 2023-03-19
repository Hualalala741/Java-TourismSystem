package tourismView;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.dao.TbDataDao;
import com.model.TbData;
import jdbc.util.*;
import com.model.*;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;


public class RouteEdit extends JFrame {
	Select select = new Select();
	Updata updata = new Updata();
	private JTable table;
	private JTextField tf_find;
	Object[][] data=select.getLineInfo("SELECT * FROM tourism_line");
	Object[] header= {"id", "\u5730\u70B9", "\u7EBF\u8DEF", "\u5929\u6570", "\u4EF7\u683C"};
	
	
	
	TbDataDao dataDao =new TbDataDao();
	Change change= new Change();
	
	private JTextField tf_origin;
	private JTextField tf_attractions;
	private JTextField tf_day_num;
	private JTextField tf_price;
	private JTextField tf_route_num;
	Select select1 = new Select();
	Updata updata1 = new Updata();
	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RouteEdit frame = new RouteEdit();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public RouteEdit() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(RouteEdit.class.getResource("/img/\u7BA1\u7406\u5458.png")));
		setTitle("Edit");
		setBounds(100, 100, 647, 423);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		this.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("\u7EBF\u8DEF\u663E\u793A");
		lblNewLabel.setBounds(42, 30, 78, 37);
		getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 77, 383, 236);
		getContentPane().add(scrollPane);
		
		DefaultTableModel dt = new DefaultTableModel(data,header){
		
			   public boolean isCellEditable(int row, int column) {
				    return false;
				   }
		};
		table = new JTable(dt);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//�����ȡ��
				String route_num,origin,attractions,day_num,price;
				route_num=table.getValueAt(table.getSelectedRow(), 0).toString();
				origin=table.getValueAt(table.getSelectedRow(), 1).toString();
				attractions=table.getValueAt(table.getSelectedRow(), 2).toString();
				day_num=table.getValueAt(table.getSelectedRow(), 3).toString();
				price=table.getValueAt(table.getSelectedRow(), 4).toString();
				tf_route_num.setText(route_num);
				tf_origin.setText(origin);
				tf_attractions.setText(attractions);
				tf_day_num.setText(day_num);
				tf_price.setText(price);
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(34);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(44);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(87);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(44);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.getColumnModel().getColumn(4).setPreferredWidth(47);
		
		table.getTableHeader().setReorderingAllowed(false);//��ͷ�����϶�
		
		
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1 = new JLabel("\u4EE5\u7F16\u53F7\u67E5\u8BE2");
		lblNewLabel_1.setBounds(444, 78, 91, 15);
		getContentPane().add(lblNewLabel_1);
		
		tf_find = new JTextField();
		tf_find.setBounds(416, 102, 78, 23);
		getContentPane().add(tf_find);
		tf_find.setColumns(10);
		
		JButton btnNewButton = new JButton("\u67e5\u8be2");
		btnNewButton.setBounds(504, 102, 97, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//��ѯ
				String tfind,sql;
				tfind = tf_find.getText();
				if (tfind.equals("")) {
					sql = "SELECT * FROM tourism_line";
				}else {
					sql = "SELECT * FROM tourism_line WHERE route_num ='"+tfind+"';";
				}
				data = select.getLineInfo(sql);
				dt.setDataVector(data,header);
			}
		});
		getContentPane().add(btnNewButton);
		
		
		
		JButton btnNewButton_1 = new JButton("\u4fee\u6539");
		btnNewButton_1.setBounds(397, 353, 97, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//�޸�
				String troute_num=tf_route_num.getText();
				String torigin = tf_origin.getText();
				String tattractions = tf_attractions.getText();
				String tday_num = tf_day_num.getText();
				String tprice = tf_price.getText();
				try {
					String id=table.getValueAt(table.getSelectedRow(), 0).toString();
					updata.addData("DELETE FROM tourism_line WHERE route_num='"+id+"';");
					change.changeData(troute_num,torigin,tattractions,tday_num,tprice);
					data=select.getLineInfo("SELECT * FROM tourism_line");
					dt.setDataVector(data,header);
					JOptionPane.showMessageDialog(RouteEdit.this,"\u4fee\u6539\u6210\u529f");
				} catch (Exception e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(RouteEdit.this,"\u4fee\u6539\u5931\u8d25");
				}
			}
		});
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u5220\u9664");
		btnNewButton_2.setBounds(504, 353, 97, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//ɾ��
				if (table.getSelectedRow()<0) {
					JOptionPane.showMessageDialog(null, "\u60a8\u672a\u9009\u4e2d\u8981\u5220\u9664\u7684\u6570\u636e\uff01");
				} else {
					//��ȡ�û�ѡ�������
					String id=table.getValueAt(table.getSelectedRow(), 0).toString();
					String name=table.getValueAt(table.getSelectedRow(), 1).toString();
					int result = JOptionPane.showConfirmDialog(null,"\u60a8\u786e\u5b9a\u8981\u5220\u9664\u5730\u70b9"+name+"\u5417\uff1f","\u5220\u9664\u63d0\u793a",0,1);
					if(result == JOptionPane.OK_OPTION){
						int i = updata.addData("DELETE FROM tourism_line WHERE route_num='"+id+"';");
						if (i>0){
							JOptionPane.showMessageDialog(null, "\u5730\u70b9"+name+"\uff0c\u5df2\u7ecf\u88ab\u5220\u9664\u6210\u529f\uff01");
						} else {
							JOptionPane.showMessageDialog(null, "\u5220\u9664\u5931\u8d25\uff01");
						}
						data=select.getLineInfo("SELECT * FROM tourism_line");
						dt.setDataVector(data,header);
					}
				}
			}
		});
		getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("\u5730\u70B9");
		lblNewLabel_2.setBounds(436, 188, 58, 15);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u7EBF\u8DEF");
		lblNewLabel_3.setBounds(436, 226, 58, 15);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u5929\u6570");
		lblNewLabel_4.setBounds(436, 263, 58, 15);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u4EF7\u683C");
		lblNewLabel_5.setBounds(436, 298, 58, 15);
		getContentPane().add(lblNewLabel_5);
		
		tf_origin = new JTextField();
		tf_origin.setBounds(504, 185, 66, 21);
		getContentPane().add(tf_origin);
		tf_origin.setColumns(10);
		
		tf_attractions = new JTextField();
		tf_attractions.setBounds(504, 223, 66, 21);
		getContentPane().add(tf_attractions);
		tf_attractions.setColumns(10);
		
		tf_day_num = new JTextField();
		tf_day_num.setBounds(504, 257, 66, 21);
		getContentPane().add(tf_day_num);
		tf_day_num.setColumns(10);
		
		tf_price = new JTextField();
		tf_price.setBounds(504, 292, 66, 21);
		getContentPane().add(tf_price);
		tf_price.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("id");
		lblNewLabel_6.setBounds(436, 152, 58, 15);
		getContentPane().add(lblNewLabel_6);
		
		tf_route_num = new JTextField();
		tf_route_num.setEditable(false);
		tf_route_num.setText("");
		tf_route_num.setBounds(504, 149, 66, 21);
		getContentPane().add(tf_route_num);
		tf_route_num.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("\u8FD4\u56DE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			    new HelloManager().setVisible(true);
			}
		});
		btnNewButton_3.setBounds(30, 353, 97, 23);
		getContentPane().add(btnNewButton_3);

	}
}
