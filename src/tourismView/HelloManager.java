package tourismView;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tourismView1.LoginView;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

@SuppressWarnings("unused")
public class HelloManager extends JFrame {
   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloManager frame = new HelloManager();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public HelloManager() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(HelloManager.class.getResource("/img/\u7BA1\u7406\u5458.png")));
		setBackground(Color.LIGHT_GRAY);
		this.setLocationRelativeTo(null);
		
		setTitle("HelloManager");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 402, 438);
		this.setLocationRelativeTo(null);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u8D26\u53F7\u4E2D\u5FC3");
		menuBar.add(mnNewMenu);
		
		JMenuItem signout = new JMenuItem("\u9000\u51FA\u8D26\u53F7");
		signout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
			    new LoginView().setVisible(true);
			}
		});
		mnNewMenu.add(signout);
		
		JMenu mnNewMenu_1 = new JMenu("\u7EBF\u8DEF\u7BA1\u7406");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("\u6DFB\u52A0\u7EBF\u8DEF");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//��ת�����ҳ��
				AddRoute addRoute = new AddRoute();
				addRoute.setVisible(true);
				HelloManager.this.setVisible(false);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\u7BA1\u7406\u8DEF\u7EBF");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RouteEdit routeEdit = new RouteEdit();
				routeEdit.setVisible(true);
				HelloManager.this.setVisible(false);
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_2 = new JMenu("\u7528\u6237\u7BA1\u7406");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem user_manage = new JMenuItem("\u8D26\u53F7\u7BA1\u7406");
		user_manage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				User_manage user_manage =new User_manage();
				user_manage.setVisible(true);
				HelloManager.this.setVisible(false);
			}
		});
		mnNewMenu_2.add(user_manage);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("\u67E5\u770B\u8BA2\u5355");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Order_manager order_manager = new Order_manager();
				order_manager.setVisible(true);
				HelloManager.this.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(119, 91, 130, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u7559\u8A00\u56DE\u590D");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ReplyMS replyMS = new ReplyMS();
				replyMS.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(119, 229, 128, 40);
		contentPane.add(btnNewButton_2);
	}
}
