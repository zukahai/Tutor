package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Table extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton;
	private JButton delete;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Table frame = new Table();
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
	public Table() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(63, 25, 737, 247);
		contentPane.add(scrollPane);
		
		table = new JTable();
		
		Vector vT = new Vector();
		Vector vD = new Vector();
		vT.add("MaSV");
		vT.add("Name");
		vT.add("Age");
		
		for (int i = 0; i < 10; i++) {
			Vector t = new Vector();
			t.add("18IT" + i);
			t.add("Name " + i);
			t.add("Age " + i);
			vD.add(t);
		}
		
		
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(vD, vT));
		
		textField = new JTextField();
		textField.setBounds(63, 300, 197, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(603, 300, 197, 28);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(333, 300, 197, 28);
		contentPane.add(textField_2);
		
		JButton add = new JButton("Add");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vector t = new Vector();
				t.add(textField.getText());
				t.add(textField_2.getText());
				t.add(textField_1.getText());
				
				vD.add(t);
				table.setModel(new DefaultTableModel(vD, vT));
			}
		});
		add.setBounds(63, 358, 235, 34);
		contentPane.add(add);
		
		btnNewButton = new JButton("Ex3");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ex3 frame = new Ex3();
				frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(690, 358, 117, 34);
		contentPane.add(btnNewButton);
		
		delete = new JButton("Delete");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int k = table.getSelectedRow();
				if (k != -1) {
					vD.remove(k);
					table.setModel(new DefaultTableModel(vD, vT));
				}
			}
		});
		delete.setBounds(333, 358, 235, 34);
		contentPane.add(delete);
		setLocationRelativeTo(null);
		setResizable(false);
	}
}
