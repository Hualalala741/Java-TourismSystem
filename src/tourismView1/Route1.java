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
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.util.List;
public class Route1 extends JFrame {
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
					Route1 frame = new Route1();
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
	public Route1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 801, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("***\u63a8\u8350\u7ebf\u8def1***");
		lblNewLabel.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 30));
		lblNewLabel.setBounds(274, 10, 261, 68);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Route1.class.getResource("/image/三亚.jpg")));
		lblNewLabel_1.setBounds(139, 0, 125, 101);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("<\u4e09\u4e9a>");
		lblNewLabel_2.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(193, 122, 100, 46);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u8708\u652f\u6d32\u5c9b\uff1a\u6700\u4f73\u7684\u6f5c\u6c34\u5730\uff0c\u5e76\u4e14\u62e5\u6709\u5f88\u591a\u4ee4\u4eba\u6fc0\u52a8\u7684\u6c34\u4e0a\u9879\u76ee");
		lblNewLabel_3.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 15));
		lblNewLabel_3.setBounds(277, 135, 439, 28);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u5177\u4f53\u7ebf\u8def\uff1a");
		lblNewLabel_4.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
		lblNewLabel_4.setBounds(277, 96, 108, 28);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u5357\u5c71\u6587\u5316\uff1a\u4e2d\u56fd\u4f5b\u6559\u4f20\u7edf\u6587\u5316\u98ce\u666f\u533a\uff0c\u8fd9\u91cc\u6709\u4e16\u754c\u4e0a\u6700\u5927\u7684\u4e00\u5ea7\u6d77\u4e0a\u89c2\u97f3");
		lblNewLabel_5.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 15));
		lblNewLabel_5.setBounds(277, 173, 500, 24);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u5357\u5c71\u6587\u5316\uff1a\u4e2d\u56fd\u4f5b\u6559\u4f20\u7edf\u6587\u5316\u98ce\u666f\u533a\uff0c\u8fd9\u91cc\u6709\u4e16\u754c\u4e0a\u6700\u5927\u7684\u4e00\u5ea7\u6d77\u4e0a\u89c2\u97f3");
		lblNewLabel_6.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 15));
		lblNewLabel_6.setBounds(277, 196, 476, 46);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("\u5927\u5c0f\u6d1e\u5929\uff1a\u4e00\u4e2a\u5b89\u9759\u53ca\u539f\u751f\u6001\u7684\u666f\u70b9");
		lblNewLabel_7.setFont(new Font("仿宋", Font.BOLD, 15));
		lblNewLabel_7.setBounds(277, 236, 340, 38);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\u65f6\u95f4\uff1a2\u5929");
		lblNewLabel_8.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
		lblNewLabel_8.setBounds(277, 322, 108, 28);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("\u7f16\u53f7\uff1aSY8901");
		lblNewLabel_9.setFont(new Font("微软雅黑", Font.BOLD, 18));
		lblNewLabel_9.setBounds(611, 10, 142, 47);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("\u4ef7\u683c\uff1a2700");
		lblNewLabel_10.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
		lblNewLabel_10.setBounds(277, 284, 125, 41);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon(Route1.class.getResource("/image/三亚2.jpg")));
		lblNewLabel_11.setBounds(440, 271, 142, 101);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon(Route1.class.getResource("/image/三亚3.jpg")));
		lblNewLabel_12.setBounds(46, 151, 225, 175);
		contentPane.add(lblNewLabel_12);
		
		JButton btnNewButton = new JButton("\u9884\u5b9a\u7ebf\u8def");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//判断当前是否有用户登录，只要有用户登录，这个就能进来
				String sql = "SELECT COUNT(*) FROM `user` WHERE user_state='已登录'";
				
				int reselt = select1.getCount(sql);
				if (reselt>0) {
					BookView bookView = new BookView();
					bookView.setVisible(true);
				    Route1.this.setVisible(false);
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
				
				
		
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton.setBounds(653, 299, 124, 38);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("返回");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				RecoView recoview =new RecoView();
				recoview.setVisible(true);
				dispose();
				
				
			}
		});
		btnNewButton_1.setFont(new Font("仿宋", Font.BOLD, 18));
		btnNewButton_1.setBounds(653, 347, 124, 39);
		contentPane.add(btnNewButton_1);
	}
}
