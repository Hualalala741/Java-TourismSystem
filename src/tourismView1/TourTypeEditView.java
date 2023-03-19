package tourismView1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import com.Bean.Tourism_Line;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import com.Bean.Tourism_Line;
import com.dao.UserDao_Imp;


import tourismView.Login;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.Controller.Select;
import com.Controller.Updata;
public class TourTypeEditView extends JFrame {
	Select select1 = new Select();
	 Updata updata = new Updata();

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	UserDao_Imp typeDao =new UserDao_Imp();
	Object[] header= {"ID", "\u5730\u70B9", "\u7EBF\u8DEF", "\u5929\u6570", "\u4EF7\u683C"};
	protected Object select;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TourTypeEditView frame = new TourTypeEditView();
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
	public TourTypeEditView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 522);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("***\u65c5\u6e38\u7ebf\u8def\u67e5\u8be2***");
		lblNewLabel.setIcon(new ImageIcon(TourTypeEditView.class.getResource("/image/线路.jpg")));
		lblNewLabel.setFont(new Font("\u6977\u4f53", Font.ITALIC, 30));
		lblNewLabel.setBounds(144, 20, 354, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u8bf7\u8f93\u5165\u67e5\u8be2\u5730\u70b9\uff1a");
		lblNewLabel_1.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 22));
		lblNewLabel_1.setBounds(34, 111, 181, 28);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(229, 111, 269, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u641c\u7d22");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String origin=textField.getText();
				fillable(origin);
				
			}
		});
		btnNewButton.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 22));
		btnNewButton.setBounds(540, 111, 93, 28);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(44, 149, 594, 242);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u7F16\u53F7", "\u5730\u70B9", "\u4EF7\u683C", "\u5929\u6570", "\u7EBF\u8DEF"
			}
		));
		
		fillable(null);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1 = new JButton("\u9884\u5b9a\u7ebf\u8def");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//判断当前是否有用户登录，只要有用户登录，这个就能进来
				String sql = "SELECT COUNT(*) FROM `user` WHERE user_state='已登录'";
				int reselt = select1.getCount(sql);
				if (reselt>0) {
					BookView bookView = new BookView();
					bookView.setVisible(true);
				    TourTypeEditView.this.setVisible(false);
					//找到谁已登录
//					String i = select1.getString("SELECT uname FROM `user` WHERE user_state='已登录'");
//					JOptionPane.showMessageDialog(null, "当前已有用户"+"   ”"+i+"”   "+"登录");
					//没有办法了，只能每次刷新？
				}else {
					JOptionPane.showMessageDialog(null, "\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55\u7cfb\u7edf\uff0c\u8bf7\u5148\u767b\u5f55\uff01");
					Login l = new Login();
					l.setVisible(true);
					dispose();
				}
				
				
				
			    
				
			}
		});
				
				
		
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 20));
		btnNewButton_1.setBounds(660, 255, 126, 33);
		contentPane.add(btnNewButton_1);
		
		JButton b_return = new JButton("返回");
		b_return.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HelloUser helloUser =new HelloUser();
				helloUser.setVisible(true);
				dispose();
			}
		});
		b_return.setBounds(665, 430, 93, 23);
		contentPane.add(b_return);
	}
	
	
	public void fillable(String origin) {
		
		DefaultTableModel defaultTable=(DefaultTableModel)table.getModel();
		defaultTable.setRowCount(0);
		//查询数据库
		
		List<Tourism_Line>types=typeDao.queryTourism_Line(origin);
		for(Tourism_Line type:types) {
			
			defaultTable.addRow(new Object[] {type.getRoute_num(),type.getOrigin(),
					type.getPrice(),type.getDay_num(),type.getAttractions()});
			
		}
	}
}
