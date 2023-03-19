package tourismView1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.Controller.Select;
import com.Controller.Updata;

import tourismView.Login;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.util.List;
public class Route2 extends JFrame {
	Select select1 = new Select();
	 Updata updata = new Updata();
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Route2 frame = new Route2();
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
	public Route2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,801, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("***\u63a8\u8350\u7ebf\u8def3***");
		lblNewLabel.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 30));
		lblNewLabel.setBounds(214, 10, 305, 60);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Route2.class.getResource("/image/新疆1.jpg")));
		lblNewLabel_1.setBounds(450, 0, 197, 153);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Route2.class.getResource("/image/新疆3.jpg")));
		lblNewLabel_2.setBounds(10, 166, 180, 230);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Route2.class.getResource("/image/新疆4.jpg")));
		lblNewLabel_3.setBounds(10, -16, 156, 185);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u5177\u4f53\u7ebf\u8def\uff1a");
		lblNewLabel_4.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
		lblNewLabel_4.setBounds(182, 99, 99, 38);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u5e03\u5c14\u6d25\u7d20\uff1a\u6709\u201c\u7ae5\u8bdd\u8fb9\u57ce\u201d\u7684\u7f8e\u8a89\uff0c\u6b63\u503c\u51ac\u5b63\uff0c\u4e07\u91cc\u98d8\u96ea\uff0c\u66f4\u662f\u7f8e\u4e0d\u80dc\u6536\uff01");
		lblNewLabel_5.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 15));
		lblNewLabel_5.setBounds(182, 141, 519, 45);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u79be\u6728\u6751\uff1a\u88ab\u8bc4\u4e3a\u201c\u4e2d\u56fd\u6700\u7f8e\u7684\u516d\u5927\u53e4\u9547\u53e4\u6751\u4e4b\u4e00\u201d\uff0c\u88ab\u8a89\u4e3a\u201c\u795e\u7684\u540e\u82b1\u56ed\u4e2d\u7684\u81ea\u7559\u5730\u201d\uff0c");
		lblNewLabel_6.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 15));
		lblNewLabel_6.setBounds(187, 240, 620, 38);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("\u5b9b\u5982\u7ae5\u8bdd\u4e16\u754c\u3002");
		lblNewLabel_7.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 15));
		lblNewLabel_7.setBounds(252, 282, 130, 38);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\u8d3e\u767b\u5cea\uff1a\u201c\u8d3e\u767b\u5cea\u201d\u8499\u53e4\u8bed\u610f\u4e3a\u201c\u8d3e\u767b\u7684\u623f\u5b50\u201d\uff0c\u6e90\u4e8e\u4e00\u4e2a\u7f8e\u4e3d\u7684\u4f20\u8bf4\u3002");
		lblNewLabel_8.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 15));
		lblNewLabel_8.setBounds(182, 320, 590, 45);
		contentPane.add(lblNewLabel_8);
		
		JButton btnNewButton = new JButton("\u9884\u5b9a\u8def\u7ebf");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//判断当前是否有用户登录，只要有用户登录，这个就能进来
				String sql = "SELECT COUNT(*) FROM `user` WHERE user_state='已登录'";
				
				int reselt = select1.getCount(sql);
				if (reselt>0) {
					BookView bookView = new BookView();
					bookView.setVisible(true);
				    Route2.this.setVisible(false);
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
		btnNewButton.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 18));
		btnNewButton.setBounds(667, 288, 110, 38);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u8fd4\u56de");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				RecoView recoview =new RecoView();
				recoview.setVisible(true);
				dispose();
				
				
				
			}
		});
		btnNewButton_1.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 18));
		btnNewButton_1.setBounds(667, 327, 110, 38);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_9 = new JLabel("\u5580\u7eb3\u65af\u4e09\u6e7e\uff1a\u795e\u4ed9\u6e7e\u3001\u6708\u4eae\u6e7e\u4e0e\u5367\u9f99\u6e7e\uff0c\u6781\u5177\u8bd7\u610f\u4e0e\u795e\u79d8\uff0c\u6b32\u7a76\u5176\u610f\uff0c\u901f\u6765!");
		lblNewLabel_9.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 15));
		lblNewLabel_9.setBounds(182, 196, 537, 34);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("<\u65b0\u7586>");
		lblNewLabel_10.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_10.setBounds(329, 66, 99, 38);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("\u7f16\u53f7\uff1aXJ9501");
		lblNewLabel_11.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.BOLD, 20));
		lblNewLabel_11.setBounds(627, 6, 150, 70);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("\u65f6\u95f4\uff1a2\u5929");
		lblNewLabel_12.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
		lblNewLabel_12.setBounds(637, 68, 94, 38);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("\u4ef7\u683c\uff1a3000");
		lblNewLabel_13.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
		lblNewLabel_13.setBounds(637, 99, 135, 39);
		contentPane.add(lblNewLabel_13);
	}

}
