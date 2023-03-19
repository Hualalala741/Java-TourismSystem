package tourismView;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import com.Controller.Select;
import com.Controller.Updata;

import tourismView1.LoginView;
import tourismView1.TourTypeEditView;

public class Login extends JFrame {
	Select select = new Select();
	Updata updata = new Updata();
	
	
	private JPanel contentPane;
	private JTextField tf_username;
	private JTextField tf_password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/img/钥匙.png")));
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u7528\u6237\u540D");
		lblNewLabel.setBounds(52, 104, 58, 15);
		contentPane.add(lblNewLabel);
		
		tf_username = new JTextField();
		tf_username.setBounds(174, 101, 66, 21);
		contentPane.add(tf_username);
		tf_username.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u5BC6\u7801");
		lblNewLabel_1.setBounds(52, 175, 58, 15);
		contentPane.add(lblNewLabel_1);
		
		tf_password = new JPasswordField();
		tf_password.setBounds(174, 172, 66, 21);
		contentPane.add(tf_password);
		tf_password.setColumns(10);
		
		JButton btnNewButton = new JButton("管理员登录");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username = tf_username.getText();
				String password = tf_password.getText();
				if(username.equals("204A")&&password.equals("123456")){
					//����Ա��¼�ɹ�
					HelloManager helloManager = new HelloManager();
					helloManager.setVisible(true);
					Login.this.setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(Login.this,"错误！");
				}
			}
		});
		btnNewButton.setBounds(111, 216, 97, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("用户登录");
		btnNewButton_1 .addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				String username = tf_username.getText();
				String password = tf_password.getText();
				if (username.equals(" ")&&password.equals(" ")) {
					JOptionPane.showMessageDialog(null, "账户名或密码未填写！");
				} else {
					String sql = "select * from user where upass='"+password+"' and uname='"+username+"'";
					int reselt = select.getCount(sql);
					int i = updata.addData("UPDATE user SET user_state='已登录' WHERE uname='"+username+"';");
					if (reselt>0&&i>0) {
						JOptionPane.showMessageDialog(null, "登录成功！欢迎使用！");
						TourTypeEditView m = new TourTypeEditView();
						m.setVisible(true);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "登录失败！账户名或密码不正确！请重新输入！");
					}
				}
			}
			});
		
	btnNewButton_1.setBounds(269, 216, 97, 23);
	contentPane.add(btnNewButton_1);
	}}





