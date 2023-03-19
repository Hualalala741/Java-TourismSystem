package tourismView;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Rectangle;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import com.model.Message;

import jdbc.util.AddMessage;
import jdbc.util.JDBCUtil;
import jdbc.util.Select;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.util.ArrayList;
import java.util.Date;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class LeavingMS extends JFrame {

 private static final long serialVersionUID = 1L;
 private JPanel jContentPane = null;
 private JLabel jLabel = null;
 private JTextArea jTextArea = null;
 private JScrollPane jScrollPane = null;
 private JLabel jLabel1 = null;
 private JLabel jLabel2 = null;
 private JTextField tf_ms = null;
 private JButton jButton = null;
 private JButton btnNewButton;
 private AddMessage addMessage=new AddMessage();
 Select select=new Select();
 /**
  * This is the default constructor
  */
    String sql = "SELECT * FROM message";
	ArrayList<Message> data=select.getMessage(sql)	;
	private JLabel lblNewLabel;
 
 
 public LeavingMS() {
  super();
  setIconImage(Toolkit.getDefaultToolkit().getImage(LeavingMS.class.getResource("/img/\u7559\u8A00.png")));
  initialize();
 }

 /**
  * This method initializes this
  * 
  * @return void
  */
 private void initialize() {
  this.setContentPane(getJContentPane());
  this.setTitle("\u6B22\u8FCE\u7559\u8A00");
  this.setBounds(new Rectangle(0, 0, 640, 680));
  this.setLocationRelativeTo(null);
  this.setVisible(true);
 }

 /**
  * This method initializes jContentPane
  * 
  * @return javax.swing.JPanel
  */
 private JPanel getJContentPane() {
  if (jContentPane == null) {
   jLabel2 = new JLabel();
   jLabel2.setBounds(new Rectangle(32, 440, 90, 24));
   jLabel2.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 15));
   jLabel2.setText("\u8f93\u5165\u7559\u8a00\uff1a");
   jLabel1 = new JLabel();

   jLabel = new JLabel();
   jLabel.setBounds(new Rectangle(267, 26, 80, 23));
   jLabel.setHorizontalAlignment(SwingConstants.CENTER);
   jLabel.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 19));
   jLabel.setText("\u7559\u8a00\u677f");
   jContentPane = new JPanel();
   jContentPane.setLayout(null);
   jContentPane.add(jLabel, null);
   jContentPane.add(getJScrollPane(), null);
   jContentPane.add(jLabel1, null);
   jContentPane.add(jLabel2, null);
   jContentPane.add(getTf_ms(), null);
   jContentPane.add(getJButton(), null);
   jContentPane.add(getBtnNewButton());
   jContentPane.add(getLblNewLabel());
  }
  return jContentPane;
 }

 /**
  * This method initializes jTextArea 
  *  
  * @return javax.swing.JTextArea 
  */
 private JTextArea getJTextArea() {
  if (jTextArea == null) {
   jTextArea = new JTextArea();
   jTextArea.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 15));
   jTextArea.setBackground(Color.WHITE);
   jTextArea.setBounds(new Rectangle(22, 44, 432, 347));
   jTextArea.setLineWrap(true);
   for(int i=0;i<data.size();i++) {
	   
	   String a=data.get(i).getMessage();
	   jTextArea.append(a+"\r\n");
  }
  }
  return jTextArea;
 }

 /**
  * This method initializes jScrollPane 
  *  
  * @return javax.swing.JScrollPane 
  */
 private JScrollPane getJScrollPane() {
  if (jScrollPane == null) {
   jScrollPane = new JScrollPane();
   jScrollPane.setBounds(new Rectangle(32, 59, 560, 336));
   jScrollPane.setViewportView(getJTextArea());
  }
  return jScrollPane;
 }

 /**
  * This method initializes jTextField 
  *  
  * @return javax.swing.JTextField 
  */
 //�õ��ı��������s
 private JTextField getTf_ms() {
  if (tf_ms == null) {
   tf_ms = new JTextField();
   tf_ms.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 18));
   tf_ms.setBounds(new Rectangle(105, 440, 378, 134));
  }
  return tf_ms;
 }

 /**
  * This method initializes jButton 
  *  
  * @return javax.swing.JButton 
  */
 private JButton getJButton() {
  if (jButton == null) {
   jButton = new JButton();
   jButton.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 14));
   jButton.setBounds(new Rectangle(493, 440, 99, 39));
   jButton.setText("\u53D1\u5E03");
   Date date = new Date();
   String time = date.toString();
   jButton.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent e) {
     //¼������
    	String type ="\u7559\u8a00";
    	String tms = time+ "\u7528\u6237"+type+"\uff1a"+tf_ms.getText();
    	try {
			addMessage.insertMS(tms,type);
			JOptionPane.showMessageDialog(LeavingMS.this,"\u7559\u8a00\u6210\u529f");
		} catch (Exception e1) {
			e1.printStackTrace();
			JOptionPane.showMessageDialog(LeavingMS.this,"\u7559\u8a00\u5931\u8d25");
		}
    	
    	String sql = "SELECT * FROM message";
		ResultSet resultSet = JDBCUtil.query(sql);
		ArrayList<Message> list= new ArrayList<Message>();
		try {
			while (resultSet.next()) {
				Message m=new Message();
				m.setMessage(resultSet.getString(1));
				m.setType(resultSet.getString(2));
				
				list.add(m);
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
        jTextArea.setText(jTextArea.getText()+"\r\n"+time+"\u7528\u6237\u7559\u8a00\uff1a"+tf_ms.getText());
        tf_ms.setText("");
    }
   });
  }
  return jButton;
 }
 public static void main(String args[]){
  new LeavingMS();
  
 }

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\u8FD4\u56DE");
			btnNewButton.setBounds(495, 551, 97, 23);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(LeavingMS.class.getResource("/img/\u94C5\u7B14.png")));
			lblNewLabel.setBounds(379, 0, 64, 63);
		}
		return lblNewLabel;
	}
}
