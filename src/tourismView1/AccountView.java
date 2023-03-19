package tourismView1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.Controller.Updata;
import com.jdbc.JDBC;
import com.jdbc.sjklj;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class AccountView extends JFrame {

	private JPanel contentPane;
	private JTextField text_cinname;
	Updata updata= new Updata();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountView frame = new AccountView();
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
	public AccountView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_nameagin = new JLabel("\u8BF7\u518D\u6B21\u8F93\u5165\u60A8\u7684\u7528\u6237\u540D\uFF1A");
		lbl_nameagin.setFont(new Font("����", Font.BOLD, 20));
		lbl_nameagin.setBounds(17, 44, 282, 65);
		contentPane.add(lbl_nameagin);
		
		text_cinname = new JTextField();
		text_cinname.setBounds(157, 131, 222, 56);
		contentPane.add(text_cinname);
		text_cinname.setColumns(10);
		
		JButton btn_yes = new JButton("\u786E\u5B9A");
		btn_yes.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent arg0) {
    	String aname=(text_cinname.getText());
    	int result = JOptionPane.showConfirmDialog(null,"\u60a8\u786e\u5b9a\u8981\u6ce8\u9500\u7528\u6237  “"+aname+"”  \u7684\u8d26\u53f7\u5417?","\u6ce8\u9500\u63d0\u793a",0,1);
		if(result == JOptionPane.OK_OPTION){
    	int i = updata.addData("DELETE FROM user WHERE uname ='"+aname+"';");
		if (i>0){
			JOptionPane.showMessageDialog(null, "\u7528\u6237  “"+aname+"”  ，\u6ce8\u9500\u6210\u529f\uff01");
		} else {
			
			JOptionPane.showMessageDialog(null, "\u6ce8\u9500\u5931\u8d25\uff01\u8bf7\u68c0\u67e5\u7528\u6237\u540d\u662f\u5426\u6b63\u786e\uff01");
		
		}
		}
	}
  });
	
				
				
				
				
				
				
			
		btn_yes.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 15));
		btn_yes.setBounds(376, 210, 107, 27);
		contentPane.add(btn_yes);
	}
}
