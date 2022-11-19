package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

public class Ex3 extends JFrame implements ItemListener{

	private JPanel contentPane;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex3 frame = new Ex3();
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
	public Ex3() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		comboBox = new JComboBox();
		comboBox.addItemListener(this);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Red", "Green", "Blue", "Yellow", "Black"}));
		comboBox.setBounds(130, 80, 162, 22);
		contentPane.add(comboBox);
		contentPane.setBackground(Color.red);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		int k = comboBox.getSelectedIndex();
		switch (k) {
		case 0:
			contentPane.setBackground(Color.red);
			break;
		case 1:
			contentPane.setBackground(Color.green);
			break;
		case 2:
			contentPane.setBackground(Color.blue);
			break;
		case 3:
			contentPane.setBackground(Color.yellow);
			break;
		case 4:
			contentPane.setBackground(Color.black);
			break;
		}
	}
}
