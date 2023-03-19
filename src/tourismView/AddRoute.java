package tourismView;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.dao.TbDataDao;

import tourismView1.AccountView;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class AddRoute extends JFrame {

	private JPanel contentPane;
	private JTextField tf_route_num;
	private JTextField tf_origin;
	private TbDataDao dataDao=new TbDataDao();
	private JTextField tf_attractions;
	private JTextField tf_day_num;
	private JTextField tf_price;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddRoute frame = new AddRoute();
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
	public AddRoute() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AddRoute.class.getResource("/img/\u7BA1\u7406\u5458.png")));
		setTitle("AddRoute");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 499);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u7F16\u53F7");
		lblNewLabel.setBounds(96, 103, 58, 15);
		contentPane.add(lblNewLabel);
		
		tf_route_num = new JTextField();
		tf_route_num.setBounds(213, 100, 66, 21);
		contentPane.add(tf_route_num);
		tf_route_num.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u5730\u70B9");
		lblNewLabel_1.setBounds(96, 168, 58, 15);
		contentPane.add(lblNewLabel_1);
		
		tf_origin = new JTextField();
		tf_origin.setBounds(213, 165, 66, 21);
		contentPane.add(tf_origin);
		tf_origin.setColumns(10);
		
		JButton btnNewButton = new JButton("\u6dfb\u52a0");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String troute_num = tf_route_num.getText();
				String torigin = tf_origin.getText();
				String tattractions = tf_attractions.getText();
				String tday_num = tf_day_num.getText();
				String tprice = tf_price.getText();
				try {
					dataDao.insertData(troute_num,torigin,tattractions,tday_num,tprice);
					JOptionPane.showMessageDialog(AddRoute.this,"\u6dfb\u52a0\u6210\u529f");
				} catch (Exception e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(AddRoute.this,"\u6dfb\u52a0\u5931\u8d25");
				}
				dispose();
				RouteEdit routeEdit = new RouteEdit();
				routeEdit.setVisible(true);
			}
		});
		btnNewButton.setBounds(70, 411, 97, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u8FD4\u56DE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			    new HelloManager().setVisible(true);
			}
		});
		btnNewButton_1.setBounds(286, 411, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u7EBF\u8DEF");
		lblNewLabel_2.setBounds(96, 229, 58, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u5929\u6570");
		lblNewLabel_3.setBounds(96, 279, 58, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u4EF7\u683C");
		lblNewLabel_4.setBounds(96, 333, 58, 15);
		contentPane.add(lblNewLabel_4);
		
		tf_attractions = new JTextField();
		tf_attractions.setBounds(213, 226, 66, 21);
		contentPane.add(tf_attractions);
		tf_attractions.setColumns(10);
		
		tf_day_num = new JTextField();
		tf_day_num.setBounds(213, 276, 66, 21);
		contentPane.add(tf_day_num);
		tf_day_num.setColumns(10);
		
		tf_price = new JTextField();
		tf_price.setBounds(213, 330, 66, 21);
		contentPane.add(tf_price);
		tf_price.setColumns(10);
	}
}
