package Test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.xdevapi.PreparableStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddStudent extends JFrame {
	
	Connect c = new Connect();
	Connection conn = c.newConnection();

	private JPanel contentPane;
	private JTextField masv;
	private JTextField name;
	private JTextField age;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStudent frame = new AddStudent();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddStudent() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		masv = new JTextField();
		masv.setBounds(129, 35, 282, 34);
		contentPane.add(masv);
		masv.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("MaSV");
		lblNewLabel.setBounds(39, 45, 80, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(39, 100, 80, 14);
		contentPane.add(lblName);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(129, 90, 282, 34);
		contentPane.add(name);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(39, 156, 80, 14);
		contentPane.add(lblAge);
		
		age = new JTextField();
		age.setColumns(10);
		age.setBounds(129, 146, 282, 34);
		contentPane.add(age);
		
		JButton add = new JButton("Add Student");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String sql = "INSERT INTO student  VALUES (?, ?, ?)";
					PreparedStatement stm = conn.prepareStatement(sql);
					stm.setString(1, masv.getText());
					stm.setString(2, name.getText());
					stm.setInt(3, Integer.parseInt(age.getText()));
					stm.execute();
					System.out.println("Da them");
					
//					String sql = "DELETE FROM student";
//					PreparedStatement stm = conn.prepareStatement(sql);
//					stm.execute();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		add.setBounds(129, 207, 189, 23);
		contentPane.add(add);
	}
}
