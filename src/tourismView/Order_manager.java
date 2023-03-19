package tourismView;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import jdbc.util.Change;
import jdbc.util.Select;
import jdbc.util.Updata;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Order_manager extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField tf_name;
	private JTextField tf_ph;
	private JTextField tname;
	private JTextField tph;
	private JTextField tnum;
	private JTextField tid;
	Select select = new Select();
	Updata updata = new Updata();
	Change change1 = new Change();
	Object[][] data=select.getOrderInfo("SELECT * FROM `order`");
	Object[] header= {"\u6e38\u5ba2\u59d3\u540d", "\u7535\u8bdd\u53f7\u7801", "\u8eab\u4efd\u8bc1\u53f7\u7801", "\u9884\u5b9a\u7ebf\u8def\u7f16\u53f7"};
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Order_manager frame = new Order_manager();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Order_manager() {
		setTitle("\u9884\u5B9A\u4FE1\u606F\u7BA1\u7406");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 521);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 46, 391, 411);
		contentPane.add(scrollPane);
		
		
		
		DefaultTableModel dt = new DefaultTableModel(data,header){
			//���ñ�����ݲ��ɱ��༭
			   public boolean isCellEditable(int row, int column) {
				    return false;//����true��ʾ�ܱ༭��false��ʾ���ܱ༭
				   }
		};
		
		table = new JTable(dt);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String order_name,order_phone,order_num,order_id;
				;
//				String id=table.getValueAt(table.getSelectedRow(), 0).toString();
//				//��id�õ�һ������
//				String user_id = select.getString("SELECT user_id FROM `user` WHERE user_state='�ѵ�¼'");
				//�����get��һ�����ݣ�set���������
				order_name=table.getValueAt(table.getSelectedRow(), 0).toString();
				order_phone=table.getValueAt(table.getSelectedRow(), 1).toString();
				order_num=table.getValueAt(table.getSelectedRow(), 2).toString();
				order_id=table.getValueAt(table.getSelectedRow(), 3).toString();
				tname.setText(order_name);
				tph.setText(order_phone);
				tnum.setText(order_num);
				tid.setText(order_id);
				
			}
		});
		table.getColumnModel().getColumn(1).setPreferredWidth(82);
		table.getColumnModel().getColumn(2).setPreferredWidth(108);
		table.getColumnModel().getColumn(3).setPreferredWidth(84);
		
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("\u6E38\u5BA2\u9884\u5B9A\u4FE1\u606F");
		lblNewLabel.setBounds(41, 11, 118, 25);
		contentPane.add(lblNewLabel);
		
		tf_name = new JTextField();
		tf_name.setBounds(515, 82, 100, 21);
		contentPane.add(tf_name);
		tf_name.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u6E38\u5BA2\u59D3\u540D\uFF1A");
		lblNewLabel_1.setBounds(430, 80, 75, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u6E38\u5BA2\u7535\u8BDD\uFF1A");
		lblNewLabel_2.setBounds(430, 120, 69, 21);
		contentPane.add(lblNewLabel_2);
		
		tf_ph = new JTextField();
		tf_ph.setBounds(515, 120, 100, 21);
		contentPane.add(tf_ph);
		tf_ph.setColumns(10);
		
		JButton find = new JButton("\u67E5\u8BE2");
		find.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name,ph,sql;
				ph = tf_ph.getText();
				name = tf_name.getText();
				if(name.equals("")&&ph.equals("")){
					sql = "SELECT * FROM  `order` ";
				}else if(ph.equals("")){
					sql =  "SELECT * FROM `order` WHERE order_name ='"+name+"';";
				}else if(name.equals("")){
					sql = "SELECT * FROM `order` WHERE order_phone='"+ph+"';";
				}else {
					sql = "SELECT * FROM `order` WHERE order_name='"+name+"' and order_phone='"+ph+"';";
				}
				data = select.getOrderInfo(sql);
				dt.setDataVector(data,header);
			}
		});
		find.setBounds(475, 175, 97, 23);
		contentPane.add(find);
		
		tname = new JTextField();
		tname.setBounds(515, 250, 115, 20);
		contentPane.add(tname);
		tname.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\u59D3\u540D\uFF1A");
		lblNewLabel_3.setBounds(415, 250, 58, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u7535\u8BDD\uFF1A");
		lblNewLabel_4.setBounds(415, 285, 90, 25);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u8EAB\u4EFD\u8BC1\u53F7\u7801\uFF1A");
		lblNewLabel_5.setBounds(415, 320, 90, 25);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u9884\u5B9A\u7EBF\u8DEF\u7F16\u53F7\uFF1A");
		lblNewLabel_6.setBounds(415, 355, 90, 25);
		contentPane.add(lblNewLabel_6);
		
		tph = new JTextField();
		tph.setBounds(515, 285, 115, 20);
		contentPane.add(tph);
		tph.setColumns(10);
		
		tnum = new JTextField();
		tnum.setBounds(515, 320, 115, 20);
		contentPane.add(tnum);
		tnum.setColumns(10);
		
		tid = new JTextField();
		tid.setBounds(515, 355, 115, 20);
		contentPane.add(tid);
		tid.setColumns(10);
		
		JButton change = new JButton("\u4FEE\u6539");
		change.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//�޸�
				String order_name=tname.getText();
				String order_phone = tph.getText();
				String order_num = tnum.getText();
				String order_id = tid.getText();
				try {
					String id=table.getValueAt(table.getSelectedRow(), 0).toString();
					
					updata.addData("DELETE FROM `order` WHERE order_name ='"+id+"';");
					
					change1.changeOrder(order_name, order_phone, order_num, order_id);
					data=select.getOrderInfo("SELECT * FROM `order`");
					dt.setDataVector(data,header);
					JOptionPane.showMessageDialog(Order_manager.this,"\u4fee\u6539\u6210\u529f");
				} catch (Exception e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(Order_manager.this,"\u4fee\u6539\u5931\u8d25");
				}
				
			}
		});
		change.setBounds(415, 403, 97, 23);
		contentPane.add(change);
		
		JButton delete = new JButton("\u5220\u9664");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//ɾ��
				if (table.getSelectedRow()<0) {
					JOptionPane.showMessageDialog(null, "\u60a8\u672a\u9009\u4e2d\u8981\u5220\u9664\u7684\u6570\u636e\uff01");
				} else {
					String name=table.getValueAt(table.getSelectedRow(), 0).toString();
					
					int result = JOptionPane.showConfirmDialog(null,"\u60a8\u786e\u5b9a\u8981\u5220\u9664"+name+"\u7684\u8ba2\u5355\u5417\uff1f","\u5220\u9664\u63d0\u793a",0,1);
					if(result == JOptionPane.OK_OPTION){
						int i = updata.addData("DELETE FROM `order` WHERE order_name='"+name+"';");
						if (i>0){
							JOptionPane.showMessageDialog(null, "\u7528\u6237"+name+"\u7684\u8ba2\u5355\uff0c\u5df2\u7ecf\u88ab\u6210\u529f\u5220\u9664\uff01");
						} else {
							JOptionPane.showMessageDialog(null, "\u5220\u9664\u5931\u8d25");
						}
						data=select.getOrderInfo("SELECT * FROM `order`");
						dt.setDataVector(data,header);
					}
				}
				
			}
		});
		delete.setBounds(545, 403, 97, 23);
		contentPane.add(delete);
		
		JButton btnNewButton_1 = new JButton("\u8FD4\u56DE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			    new HelloManager().setVisible(true);
			}
		});
		btnNewButton_1.setBounds(475, 451, 97, 23);
		contentPane.add(btnNewButton_1);
		
		
		
	}
}
