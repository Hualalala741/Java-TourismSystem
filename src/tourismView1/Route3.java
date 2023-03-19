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
public class Route3 extends JFrame {
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
					Route3 frame = new Route3();
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
	public Route3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 801, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("***\u63a8\u8350\u7ebf\u8def3***");
		lblNewLabel.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 30));
		lblNewLabel.setBounds(250, 10, 330, 76);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Route3.class.getResource("/image/丽江1.jpg")));
		lblNewLabel_1.setBounds(31, 17, 175, 122);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Route3.class.getResource("/image/丽江2.jpg")));
		lblNewLabel_2.setBounds(31, 272, 180, 106);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Route3.class.getResource("/image/丽江3.jpg")));
		lblNewLabel_3.setBounds(149, 149, 185, 113);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("<\u4e3d\u6c5f>");
		lblNewLabel_4.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4.setBounds(43, 183, 85, 21);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u5177\u4f53\u7ebf\u8def\uff1a");
		lblNewLabel_5.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
		lblNewLabel_5.setBounds(232, 74, 102, 44);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u7389\u9f99\u96ea\u5c71\uff1a\u5e26\u4f60\u9886\u7565\u56db\u5b63\u7684\u53d8\u5316");
		lblNewLabel_6.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 15));
		lblNewLabel_6.setBounds(329, 96, 274, 32);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("\u4e91\u5c71\u576a\uff1a\u5728\u7d22\u9053\u4e0a\u89c2\u8d4f\u7389\u9f99\u96ea\u5c71\u7684\u7f8e\u8c8c");
		lblNewLabel_7.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 15));
		lblNewLabel_7.setBounds(329, 139, 343, 32);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\u51b0\u5ddd\u5927\u7d22\u9053\uff1a\u51b0\u5ddd\u516c\u56ed");
		lblNewLabel_8.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 15));
		lblNewLabel_8.setBounds(329, 181, 255, 32);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("\u84dd\u6708\u8c37\uff1a\u5929\u7a7a\u4e0e\u6d77\u76f8\u8fde\uff0c\u8ba9\u4f60\u6d41\u8fde\u5fd8\u8fd4");
		lblNewLabel_9.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 15));
		lblNewLabel_9.setBounds(329, 223, 293, 32);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("\u4e3d\u6c5f\u53e4\u57ce\uff1a\u4eba\u6587\u4e0e\u98ce\u60c5\u5e76\u5b58\u7684\u5730\u65b9");
		lblNewLabel_10.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 15));
		lblNewLabel_10.setBounds(329, 265, 264, 32);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("\u675f\u6cb3\u53e4\u9547\uff1a\u4e00\u5ea7\u5386\u53f2\u60a0\u4e45\u7684\u53e4\u9547\uff0c\u6728\u5f0f\u571f\u53f8\u7684\u8d77\u6e90\u5730");
		lblNewLabel_11.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 15));
		lblNewLabel_11.setBounds(329, 307, 361, 32);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("\u7f16\u53f7\uff1aLJ5502");
		lblNewLabel_12.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.BOLD, 20));
		lblNewLabel_12.setBounds(627, 10, 131, 44);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("\u65f6\u95f4\uff1a3\u5929");
		lblNewLabel_13.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
		lblNewLabel_13.setBounds(642, 95, 92, 34);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("\u4ef7\u683c\uff1a3200");
		lblNewLabel_14.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
		lblNewLabel_14.setBounds(642, 129, 102, 51);
		contentPane.add(lblNewLabel_14);
		
		JButton btnNewButton = new JButton("\u9884\u5b9a\u7ebf\u8def");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//判断当前是否有用户登录，只要有用户登录，这个就能进来
				String sql = "SELECT COUNT(*) FROM `user` WHERE user_state='已登录'";
				
				int reselt = select1.getCount(sql);
				if (reselt>0) {
					BookView bookView = new BookView();
					bookView.setVisible(true);
				    Route3.this.setVisible(false);
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
		btnNewButton.setBounds(639, 190, 119, 44);
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
		btnNewButton_1.setBounds(639, 244, 119, 44);
		contentPane.add(btnNewButton_1);
	}

}
