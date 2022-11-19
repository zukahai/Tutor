package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import connectsql.Connect;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class ShowTable extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private Vector vT, vD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowTable frame = new ShowTable();
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
	public ShowTable() {
		Connect cn = new Connect();
		Connection conn = cn.getConnection();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(41, 24, 687, 346);
		contentPane.add(scrollPane);
		
		table = new JTable();
		vD = new Vector();
        String sql = "SELECT * FROM table21da";
	   PreparedStatement stm;
		try {
			stm = conn.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
		    while(rs.next()) {
//			   System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
		    	Vector t = new Vector();
		    	t.add(rs.getInt(1));
		    	t.add(rs.getString(2));
		    	vD.add(t);
		    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
		
		vT = new Vector();
		vT.add("ID");
		vT.add("Name");
		table.setModel(new DefaultTableModel(vD, vT));
		scrollPane.setViewportView(table);
	}
}
