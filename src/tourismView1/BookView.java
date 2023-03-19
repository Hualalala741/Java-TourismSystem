package tourismView1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.Controller.Select;
import com.Controller.Updata;

import tourismView.Login;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BookView extends JFrame {
	Select select = new Select();
	Updata updata = new Updata();

	JButton btnNewButton_Export;
	

	private JPanel contentPane;
	private JTextField text_1;
	private JTextField text_2;
	private JTextField text_3;
	private JTextField text_4;
	private JTextField user_name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookView frame = new BookView();
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
	public BookView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 707, 430);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("***\u7ebf\u8def\u9884\u5b9a***");
		lblNewLabel.setFont(new Font("\u5b8b\u4f53", Font.ITALIC, 30));
		lblNewLabel.setIcon(new ImageIcon(BookView.class.getResource("/image/预订.jpg")));
		lblNewLabel.setBounds(219, 23, 280, 76);
		contentPane.add(lblNewLabel);
		
		JLabel lbl_id = new JLabel("\u9884\u5b9a\u7ebf\u8def\u7f16\u53f7\uff1a");
		lbl_id.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 25));
		lbl_id.setBounds(38, 259, 195, 29);
		contentPane.add(lbl_id);
		
		JButton btn_yes = new JButton("\u786e\u5b9a");
		
		
		btn_yes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String sql;
				String uname=user_name.getText();
				String order_name = text_1.getText();
				String order_phone= text_2.getText();
				String order_num = text_3.getText();
				String order_id = text_4.getText();
				
				if (uname.equals("")||order_name.equals("")||order_phone.equals("")||order_num.equals("")||order_id.equals("")) {
					JOptionPane.showMessageDialog(null, "\u8bf7\u8f93\u5165\u5b8c\u6574\u4fe1\u606f\uff01");
				}else{
					//判断当前用户是否登录
					String sql1 = "SELECT COUNT(*) FROM `user` WHERE uname='"+uname+"' and user_state='已登录'";
					int reselt = select.getCount(sql1);
					if (reselt>0) {
						sql = "INSERT INTO `order` VALUES ('"+order_name+"', '"+order_phone+"', '"+order_num+"', '"+order_id+"');";
						int result = updata.addData(sql);
						JOptionPane.showMessageDialog(null, "\u9884\u5b9a\u6210\u529f\uff01\u8df3\u8f6c\u5230\u7ebf\u8def\u9996\u9875！");
						TourTypeEditView tourtypeeditview  = new TourTypeEditView();
						tourtypeeditview.setVisible(true);
						BookView.this.setVisible(false);
				
					}else {
						JOptionPane.showMessageDialog(null, "\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55\u7cfb\u7edf\uff0c\u8bf7\u5148\u767b\u5f55\uff01");
						Login l = new Login();
						l.setVisible(true);
						dispose();
					}
				}
			}
		});
				
				
		
		btn_yes.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 25));
		btn_yes.setBounds(298, 329, 134, 37);
		contentPane.add(btn_yes);
		
		JLabel lbl_name = new JLabel("\u59d3\u540d\uff1a");
		lbl_name.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 25));
		lbl_name.setBounds(138, 130, 95, 29);
		contentPane.add(lbl_name);
		
		JLabel lbl_phone = new JLabel("\u7535\u8bdd:");
		lbl_phone.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 25));
		lbl_phone.setBounds(138, 181, 95, 29);
		contentPane.add(lbl_phone);
		
		JLabel lbl_num = new JLabel("\u8eab\u4efd\u8bc1\u53f7\u7801\uff1a");
		lbl_num.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 25));
		lbl_num.setBounds(65, 220, 177, 29);
		contentPane.add(lbl_num);
		
		text_1 = new JTextField();
		text_1.setBounds(263, 134, 250, 29);
		contentPane.add(text_1);
		text_1.setColumns(10);
		
		text_2 = new JTextField();
		text_2.setColumns(10);
		text_2.setBounds(263, 177, 250, 29);
		contentPane.add(text_2);
		
		text_3 = new JTextField();
		text_3.setColumns(10);
		text_3.setBounds(263, 220, 250, 29);
		contentPane.add(text_3);
		
		text_4 = new JTextField();
		text_4.setColumns(10);
		text_4.setBounds(263, 259, 250, 29);
		contentPane.add(text_4);
		
		user_name = new JTextField();
		user_name.setBounds(603, 82, 66, 21);
		contentPane.add(user_name);
		user_name.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u60a8\u7684\u7528\u6237\u540d\u662f\uff1a");
		lblNewLabel_1.setBounds(509, 81, 95, 22);
		contentPane.add(lblNewLabel_1);
	}
}
