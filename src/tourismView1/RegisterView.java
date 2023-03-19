package tourismView1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import com.dao.UserDao_Imp;

import tourismView.Login;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;

public class RegisterView extends JFrame {

	private JPanel contentPane;
	private JTextField text_name;
	private JTextField text_number;
	private UserDao_Imp userDao=new  UserDao_Imp();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterView frame = new RegisterView();
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
	public RegisterView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u7528\u6237\u6CE8\u518C");
		lblNewLabel.setIcon(new ImageIcon(RegisterView.class.getResource("/image/\u6CE8\u518C.jpg")));
		lblNewLabel.setFont(new Font("\u5b8b\u4f53", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(213, 45, 228, 62);
		contentPane.add(lblNewLabel);
		
		JLabel lbl_usename = new JLabel("\u7528 \u6237 \u540D\uFF1A");
		lbl_usename.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 25));
		lbl_usename.setBounds(63, 124, 135, 62);
		contentPane.add(lbl_usename);
		
		JLabel lbl_password = new JLabel("\u65B0\u5EFA\u5BC6\u7801\uFF1A");
		lbl_password.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 25));
		lbl_password.setBounds(63, 219, 135, 39);
		contentPane.add(lbl_password);
		
		text_name = new JTextField();
		text_name.setBounds(210, 140, 247, 39);
		contentPane.add(text_name);
		text_name.setColumns(10);
		
		text_number = new JTextField();
		text_number.setColumns(10);
		text_number.setBounds(210, 219, 247, 39);
		contentPane.add(text_number);
		
		JButton btn_registerin = new JButton("\u6CE8\u518C");
		
		btn_registerin.addActionListener(new ActionListener() {
			private String user_state;

			public void actionPerformed(ActionEvent arg0) {
				String uname = text_name.getText();
				String upass = text_number.getText();
				try {
					
					 userDao.insertData(uname, upass, user_state);
					JOptionPane.showMessageDialog(RegisterView.this,"\u6ce8\u518c\u6210\u529f");
				} catch (Exception e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(RegisterView.this,"\u6ce8\u518c\u5931\u8d25");
				}
			}
		});
		
		btn_registerin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login login = new Login();
				login.setVisible(true);
				RegisterView.this.setVisible(false);
			}
		});
		
		btn_registerin.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 30));
		btn_registerin.setBounds(248, 307, 143, 43);
		contentPane.add(btn_registerin);
		
		JButton btnNewButton = new JButton("\u8fd4\u56de");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				LoginView loginview =new LoginView();
				loginview.setVisible(true);
				dispose();
				
				
			}
		});
		btnNewButton.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 15));
		btnNewButton.setBounds(568, 376, 97, 27);
		contentPane.add(btnNewButton);
		
	}
}
