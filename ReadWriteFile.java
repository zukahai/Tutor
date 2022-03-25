package _22_03_2022;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.TextField;

public class ReadWriteFile extends JFrame {

	private JPanel contentPane;
	JTextArea textArea;
	private JScrollPane scrollPane;
	private JTextField textField;
	private JButton btnAdd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReadWriteFile frame = new ReadWriteFile();
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
	public ReadWriteFile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 579, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("View");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(readFile("A.txt"));
			}
		});
		btnNewButton.setBounds(459, 291, 73, 42);
		contentPane.add(btnNewButton);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 11, 499, 269);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		scrollPane.setViewportView(textArea);
		
		textField = new JTextField();
		textField.setBounds(33, 297, 286, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				writeFile("A.txt", textField.getText());
				textField.setText("");
			}
		});
		btnAdd.setBounds(361, 291, 73, 42);
		contentPane.add(btnAdd);
	}
	
	public String readFile(String fileName) {
		File fileIn = new File("A.txt");
    	String content = "";
    	String line = "";
		try {
			FileReader fileReader = new FileReader(fileIn, StandardCharsets.UTF_8);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while((line = bufferedReader.readLine()) != null) {
				content = content + line + "\n";
			}
			bufferedReader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    	
    	return content;
	}
	
	public void writeFile(String fileName, String s) {
		String OldContent = readFile(fileName);
		File fileOut = new File(fileName);
        FileWriter Filewriter;
		try {
			Filewriter = new FileWriter(fileOut, StandardCharsets.UTF_8);
			BufferedWriter bufferedWriter = new BufferedWriter(Filewriter);
			bufferedWriter.write(OldContent + s);
			textArea.setText(readFile("A.txt"));
			bufferedWriter.close();
			textArea.setText(readFile(fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
