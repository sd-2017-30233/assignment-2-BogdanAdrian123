package view;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class UserWindow extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton SearchGenreButton = new JButton("Search by GENRE");
	private JButton SearchTitleButton = new JButton("Search by TITLE");
	private JButton SearchAuthorButton = new JButton("Search by AUTHOR");
	private JButton SellBookButton = new JButton("SELL BOOK");
	private JButton LogOutButton = new JButton("BACK");
	
	
	public UserWindow() {
		super("Employee user");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		SearchGenreButton.setBounds(56, 38, 165, 23);
		SearchGenreButton.setActionCommand("Open");
		contentPane.add(SearchGenreButton);
		
		SearchTitleButton.setBounds(56, 72, 165, 23);
		SearchTitleButton.setActionCommand("Open");
		contentPane.add(SearchTitleButton);
		
		SearchAuthorButton.setBounds(56, 106, 165, 23);
		SearchAuthorButton.setActionCommand("Open");
		contentPane.add(SearchAuthorButton);
		
		SellBookButton.setBounds(56, 140, 165, 23);
		SellBookButton.setActionCommand("Open");
		contentPane.add(SellBookButton);
		
		LogOutButton.setBounds(200, 174, 100, 40);
		LogOutButton.setForeground(Color.RED);
		LogOutButton.setActionCommand("Open");
		contentPane.add(LogOutButton);
		
		JLabel lblGenre = new JLabel("Genre");
		lblGenre.setBounds(276, 42, 46, 14);
		contentPane.add(lblGenre);
		
		textField = new JTextField();
		textField.setBounds(331, 39, 134, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setBounds(276, 76, 46, 14);
		contentPane.add(lblTitle);
		
		textField_1 = new JTextField();
		textField_1.setBounds(331, 73, 134, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setBounds(276, 110, 46, 14);
		contentPane.add(lblAuthor);
		
		textField_2 = new JTextField();
		textField_2.setBounds(331, 107, 134, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblExemplar = new JLabel("Pieces");
		lblExemplar.setBounds(276, 144, 88, 14);
		contentPane.add(lblExemplar);
		
		textField_3 = new JTextField();
		textField_3.setBounds(331, 141, 134, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		setVisible(true);
		}
	
public void windowClosing(){
	    dispose();
	}
public void setMesaj(String s){
	JOptionPane.showMessageDialog(null,s);
}
public String getTextfield() {  
	return textField.getText();
	}
public String getTextfield1() {  
	return textField_1.getText();
	}
public String getTextfield2() {  
	return textField_2.getText();
	}
public String getTextfield3() {   
	return textField_3.getText();
	}
public void addSearchBookByGenreListener(ActionListener mal) {
	SearchGenreButton.addActionListener(mal);
	}
public void addSearchBookByTitleListener(ActionListener mal) {
	SearchTitleButton.addActionListener(mal);
	}
public void addSearchBookByAuthorListener(ActionListener mal) {
	SearchAuthorButton.addActionListener(mal);
	}
public void addSellBookListener(ActionListener mal) {
	SellBookButton.addActionListener(mal);
	}
public void addLogOutListener(ActionListener mal) {
	LogOutButton.addActionListener(mal);
	}


}