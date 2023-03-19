package tourismView1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import tourismView.Login;


import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class LoginView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
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
	public LoginView() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u65c5\u6e38\u7ba1\u7406\u7cfb\u7edf");
		lblNewLabel.setFont(new Font("\u5b8b\u4f53", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setIcon(new ImageIcon(LoginView.class.getResource("/image/\u56FE\u7247.png")));
		lblNewLabel.setBounds(207, 61, 336, 66);
		contentPane.add(lblNewLabel);
		
		JButton btn_register = new JButton("\u6ce8\u518c");
		btn_register.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 25));
		btn_register.setBounds(134, 177, 122, 48);
		contentPane.add(btn_register);
		
		btn_register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegisterView mainView=new RegisterView();
				mainView.setVisible(true);
				LoginView.this.setVisible(false);
			}
		});
		
		
		
		JButton btn_login = new JButton("\u767b\u5f55");
		
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login login = new Login();
				login.setVisible(true);
				LoginView.this.setVisible(false);
			}
		});
		
		btn_login.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 25));
		btn_login.setBounds(403, 177, 122, 48);
		contentPane.add(btn_login);
		
		
		
		JButton btn_refer = new JButton("\u67e5\u8be2");
		btn_refer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				TourTypeEditView tourTypeEditView = new TourTypeEditView();
				tourTypeEditView.setVisible(true);
			   LoginView.this.setVisible(false);
			    
			 
			}
		});
		
		
		
		btn_refer.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 25));
		btn_refer.setBounds(134, 253, 122, 48);
		contentPane.add(btn_refer);
		
		JButton btn_recommend = new JButton("\u63a8\u8350");
		
		btn_recommend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RecoView recoview = new RecoView ();
				recoview.setVisible(true);
				LoginView.this.setVisible(false);
			}
		});
		
		
		btn_recommend.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 25));
		btn_recommend.setBounds(403, 253, 122, 48);
		contentPane.add(btn_recommend);
	}
}
