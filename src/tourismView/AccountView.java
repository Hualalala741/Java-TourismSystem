package tourismView;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.tjl.jdbc.JDBC;
import com.tjl.jdbc.sjklj;

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
		lbl_nameagin.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 20));
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
            	
				sjklj s1=new sjklj();

            	String sql="SELECT * FROM `user` WHERE uname ='"+aname+"'";
            	String sql1="delete from `user` where uname=?";
            	try{
            		Statement stmt=(Statement)s1.connection.createStatement();
               	 ResultSet rs=(ResultSet)stmt.executeQuery(sql);
               	 PreparedStatement prestmt=(PreparedStatement)s1.connection.prepareStatement(sql1);

            	 if(rs.next()==true){
            		 prestmt.setString(1, aname);
            	        prestmt.executeUpdate();
            	    
            	        prestmt.close();
            		 JOptionPane.showMessageDialog(null,"\u6ce8\u9500\u6210\u529f","\u63d0\u793a\u7a97\u53e3",JOptionPane.INFORMATION_MESSAGE);
            	 }
            	 else {
            		 JOptionPane.showMessageDialog(null,"\u6ce8\u9500\u5931\u8d25\uff1a\u8bf7\u68c0\u67e5\u7528\u6237\u548c\u5bc6\u7801\u662f\u5426\u6b63\u786e\uff01","\u63d0\u793a\u7a97\u53e3",JOptionPane.WARNING_MESSAGE);
            	 }
            	stmt.close();
            	}catch(Exception e1){
            	 e1.printStackTrace();
            	}
            }
        });
	
				
				
				
				
				
				
			
		btn_yes.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 15));
		btn_yes.setBounds(376, 210, 107, 27);
		contentPane.add(btn_yes);
	}
}
