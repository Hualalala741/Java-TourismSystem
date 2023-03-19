package tourismView1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tourismView.ReplyMS;

import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloUser extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloUser frame = new HelloUser();
					frame.setVisible(true);
				} catch (Exception e) {
				
					e.printStackTrace();
				}
			}
		});
	}

	
	public HelloUser() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 463, 459);
		this.setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u8d26\u53f7\u4e2d\u5fc3");
		mnNewMenu.setForeground(Color.BLACK);
		mnNewMenu.setFont(new Font("\u65b9\u6b63\u7c97\u9ed1\u5b8b\u7b80\u4f53", Font.PLAIN, 16));
		menuBar.add(mnNewMenu);
		
		JButton btnNewButton_3 = new JButton("\u5b89\u5168\u9000\u51fa");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new LoginView().setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 16));
		mnNewMenu.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u6ce8\u9500\u8d26\u53f7");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new AccountView().setVisible(true);
			}
		});
		btnNewButton_4.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 16));
		mnNewMenu.add(btnNewButton_4);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\u67e5  \u8be2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TourTypeEditView tourTypeEditView = new TourTypeEditView();
				tourTypeEditView.setVisible(true);
			   HelloUser.this.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 20));
		btnNewButton.setBounds(173, 93, 122, 33);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u63a8  \u8350");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RecoView recoview = new RecoView ();
				recoview.setVisible(true);
				HelloUser.this.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 20));
		btnNewButton_1.setBounds(103, 252, 122, 33);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u7559  \u8a00");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ReplyMS replyMS = new ReplyMS ();
				replyMS.setVisible(true);
				HelloUser.this.setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 20));
		btnNewButton_2.setBounds(131, 169, 122, 33);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(HelloUser.class.getResource("/image/个人2.jpg")));
		lblNewLabel.setBounds(0, 348, 50, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome to travel!");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Segoe Script", Font.BOLD, 19));
		lblNewLabel_1.setBounds(0, 10, 215, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(HelloUser.class.getResource("/image/个人1.jpg")));
		lblNewLabel_2.setBounds(-28, -15, 485, 417);
		contentPane.add(lblNewLabel_2);
	}

}
