package tourismView;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import jdbc.util.Select;
import jdbc.util.Updata;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class User_manage extends JFrame {
	
	Select select = new Select();
	Updata updata = new Updata();
	private JPanel contentPane;
	private JTable table;
	
	Object[][] data=select.getUserInfo("SELECT * FROM user");
	Object[] header= {"\u5E8F\u53F7", "\u7528\u6237\u540D", "\u5BC6\u7801"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User_manage frame = new User_manage();
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
	public User_manage() {
		setTitle("\u7528\u6237\u4FE1\u606F\u7BA1\u7406");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 305);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u7528\u6237\u8D26\u53F7\u4FE1\u606F");
		lblNewLabel.setBounds(40, 23, 95, 27);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(50, 60, 278, 178);
		contentPane.add(scrollPane);
		
		
		DefaultTableModel dt = new DefaultTableModel(data,header){
			   public boolean isCellEditable(int row, int column) {
				    return false;
				   }
		};
		table = new JTable(dt);
		
		scrollPane.setViewportView(table);
		
		JButton delete = new JButton("\u5220\u9664");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//delete
				if (table.getSelectedRow()<0) {
					JOptionPane.showMessageDialog(null, "\u60a8\u672a\u9009\u4e2d\u8981\u5220\u9664\u7684\u6570\u636e\uff01");
				} else {
					//find data choose id & return name
					String id=table.getValueAt(table.getSelectedRow(), 0).toString();
					String name=table.getValueAt(table.getSelectedRow(), 1).toString();
					int result = JOptionPane.showConfirmDialog(null,"\u60a8\u786e\u5b9a\u8981\u5220\u9664\u7528\u6237"+name+"\u7684\u8d26\u53f7\u5417\uff1f","\u5220\u9664\u63d0\u793a",0,1);
					if(result == JOptionPane.OK_OPTION){
						int i = updata.addData("DELETE FROM user WHERE tid='"+id+"';");
						if (i>0){
							JOptionPane.showMessageDialog(null, "\u7528\u6237"+name+" \uff0c\u5df2\u88ab\u5220\u9664\u6210\u529f\uff01");
						} else {
							JOptionPane.showMessageDialog(null, "\u5220\u9664\u5931\u8d25\uff01");
						}
						data=select.getUserInfo("SELECT * FROM user");
						dt.setDataVector(data,header);
					}
				}
			}
		});
		delete.setBounds(351, 165, 97, 23);
		contentPane.add(delete);
		
		JButton returnButton = new JButton("\u8FD4\u56DE");
		returnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//return
				dispose();
			    new HelloManager().setVisible(true);
			}
		});
		returnButton.setBounds(351, 215, 97, 23);
		contentPane.add(returnButton);
	}
}
