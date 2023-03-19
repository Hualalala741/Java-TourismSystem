package tourismView1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RecoView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecoView frame = new RecoView();
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
	public RecoView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 799, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("\u65c5\u6e38\u63a8\u8350\u7ebf\u8def");
		lblNewLabel_2.setIcon(new ImageIcon(RecoView.class.getResource("/image/推荐图标1.jpg")));
		lblNewLabel_2.setFont(new Font("\u5b8b\u4f53", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2.setBounds(264, 10, 286, 54);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("\u63a8\u83501\uff1a\u6781\u5177\u65c5\u6e38\u7279\u8272\u4e09\u4e9a");
		lblNewLabel_1.setFont(new Font("楷体", Font.ITALIC, 28));
		lblNewLabel_1.setIcon(new ImageIcon(RecoView.class.getResource("/image/三亚2.jpg")));
		lblNewLabel_1.setBounds(57, 61, 559, 106);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("\u63a8\u83503\uff1a\u826f\u8fb0\u7f8e\u666f\u4e3d\u6c5f");
		lblNewLabel_3.setIcon(new ImageIcon(RecoView.class.getResource("/image/丽江2.jpg")));
		lblNewLabel_3.setFont(new Font("\u6977\u4f53", Font.ITALIC, 28));
		lblNewLabel_3.setBounds(57, 316, 519, 134);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u63a8\u83502\uff1a\u5f02\u57df\u98ce\u60c5\u65b0\u7586");
		lblNewLabel_4.setIcon(new ImageIcon(RecoView.class.getResource("/image/新疆2.jpg")));
		lblNewLabel_4.setFont(new Font("\u6977\u4f53", Font.ITALIC, 28));
		lblNewLabel_4.setBounds(57, 182, 501, 123);
		contentPane.add(lblNewLabel_4);
		
		JButton btn_Reco1 = new JButton("\u67e5\u770b\u8be6\u60c5");
		btn_Reco1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Route1 route1 = new Route1 ();
				route1.setVisible(true);
				RecoView.this.setVisible(false);
				
				
			}
		});
		btn_Reco1.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 23));
		btn_Reco1.setBounds(593, 92, 137, 48);
		contentPane.add(btn_Reco1);
		
		JButton btn_Reco2 = new JButton("\u67e5\u770b\u8be6\u60c5");
		btn_Reco2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Route2 route2 = new Route2 ();
				route2.setVisible(true);
				RecoView.this.setVisible(false);
				
			}
		});
		btn_Reco2.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 23));
		btn_Reco2.setBounds(593, 221, 137, 48);
		contentPane.add(btn_Reco2);
		
		JButton btn_Reco3 = new JButton("\u67e5\u770b\u8be6\u60c5");
		btn_Reco3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				Route3 route3 = new Route3 ();
				route3.setVisible(true);
				RecoView.this.setVisible(false);
				
			}
		});
		btn_Reco3.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 23));
		btn_Reco3.setBounds(593, 338, 137, 48);
		contentPane.add(btn_Reco3);
		
		JButton btnNewButton = new JButton("\u8fd4\u56de");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LoginView loginview =new LoginView();
				loginview.setVisible(true);
				dispose();
				
				
			}
		});
		btnNewButton.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 15));
		btnNewButton.setBounds(679, 414, 96, 36);
		contentPane.add(btnNewButton);
	}
}





