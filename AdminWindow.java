package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

	
public class AdminWindow extends JFrame {

		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private JTextField textField;
		private JTextField textField_1;
		private JTextField textField_2;
		private JTextField textField_3;
		private JTextField textField_4;
		private JTextField textField_5;
		private JTextField textField_6;
		private JTextField textField_7;
		private JTextField textField_8;
		private JButton btnNewButton = new JButton("Insert book");
		private JButton btnUpdateBook = new JButton("Update book");
		private JButton btnDeleteBook = new JButton("Delete book");
		private JButton btnInsertEmployee = new JButton("Insert user");
		private JButton btnUpdateEmployee = new JButton("Update user");
		private JButton btnDeleteEmployee = new JButton("Delete user");
		private JButton btnNewButton_1 = new JButton("Generate pdf report");
		private JButton btnGenerateCsvReport = new JButton("Generate csv report");
		private JButton LogOutButton = new JButton("BACK");
			
public AdminWindow() {
	
		super("Administrator Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 9, 9, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//insert book
		btnNewButton.setBounds(210, 20, 99, 39);
		btnNewButton.setActionCommand("Open");
		contentPane.add(btnNewButton);
		
		btnUpdateBook.setBounds(259, 60, 105, 39);
		btnUpdateBook.setActionCommand("Open");
		contentPane.add(btnUpdateBook);
		
		btnDeleteBook.setBounds(319, 20, 105, 39);
		btnDeleteBook.setActionCommand("Open");
		contentPane.add(btnDeleteBook);
		
		btnInsertEmployee.setBounds(210, 149, 99, 43);
		btnInsertEmployee.setActionCommand("Open");
		contentPane.add(btnInsertEmployee);
		
		btnUpdateEmployee.setBounds(259, 194, 105, 39);
		btnUpdateEmployee.setActionCommand("Open");
		contentPane.add(btnUpdateEmployee);
		
		btnDeleteEmployee.setBounds(319, 149, 105, 43);
		btnDeleteEmployee.setActionCommand("Open");
		contentPane.add(btnDeleteEmployee);
		
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBounds(51, 266, 179, 23);
		btnNewButton_1.setActionCommand("Open");
		contentPane.add(btnNewButton_1);
		
		btnGenerateCsvReport.setForeground(Color.RED);
		btnGenerateCsvReport.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnGenerateCsvReport.setBounds(240, 266, 168, 23);
		btnGenerateCsvReport.setActionCommand("Open");
		contentPane.add(btnGenerateCsvReport);
		
		LogOutButton.setBounds(200, 305, 100, 23);
		LogOutButton.setActionCommand("Open");
		contentPane.add(LogOutButton);
		
		JLabel lblBookId = new JLabel("Book id");
		lblBookId.setBounds(22, 21, 46, 14);
		contentPane.add(lblBookId);
		
		textField = new JTextField();
		textField.setBounds(78, 21, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setBounds(22, 49, 46, 14);
		contentPane.add(lblTitle);
		
		textField_1 = new JTextField();
		textField_1.setBounds(78, 46, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setBounds(22, 74, 46, 14);
		contentPane.add(lblAuthor);
		
		textField_2 = new JTextField();
		textField_2.setBounds(78, 71, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblGenre = new JLabel("Genre");
		lblGenre.setBounds(22, 99, 46, 14);
		contentPane.add(lblGenre);
		
		textField_3 = new JTextField();
		textField_3.setBounds(78, 96, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(22, 124, 51, 14);
		contentPane.add(lblQuantity);
		
		textField_4 = new JTextField();
		textField_4.setBounds(78, 121, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(22, 149, 46, 14);
		contentPane.add(lblPrice);
		
		textField_5 = new JTextField();
		textField_5.setBounds(78, 146, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblEmployeeId = new JLabel("Employee id");
		lblEmployeeId.setBounds(10, 188, 72, 14);
		contentPane.add(lblEmployeeId);
		
		textField_6 = new JTextField();
		textField_6.setBounds(78, 185, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(10, 216, 60, 14);
		contentPane.add(lblUsername);
		
		textField_7 = new JTextField();
		textField_7.setBounds(78, 213, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 241, 69, 14);
		contentPane.add(lblPassword);
		
		textField_8 = new JTextField();
		textField_8.setBounds(78, 238, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
			
	        setVisible(true);
		}
public void windowClosing(){
    dispose();
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
public String getTextfield4() {   
	return textField_4.getText();
	}
public String getTextfield5() {   
	return textField_5.getText();
	}
public String getTextfield6() {   
	return textField_6.getText();
	}
public String getTextfield7() {   
	return textField_7.getText();
	}
public String getTextfield8() {   
	return textField_8.getText();
	}
public void addAddBookListener(ActionListener mal) {
    btnNewButton.addActionListener(mal);
}
public void addUpdateBookListener(ActionListener mal) {
    btnUpdateBook.addActionListener(mal);
}
public void addDeleteBookListener(ActionListener mal) {
    btnDeleteBook.addActionListener(mal);
}
public void addAddUserListener(ActionListener mal) {
    btnInsertEmployee.addActionListener(mal);
}
public void addUpdateUserListener(ActionListener mal) {
    btnUpdateEmployee.addActionListener(mal);
}
public void addDeleteUserListener(ActionListener mal) {
    btnDeleteEmployee.addActionListener(mal);
}
public void addPdfReportListener(ActionListener mal) {
    btnNewButton_1.addActionListener(mal);
}
public void addCsvReportListener(ActionListener mal) {
    btnGenerateCsvReport.addActionListener(mal);
}
public void addLogOutListener(ActionListener mal) {
	LogOutButton.addActionListener(mal);
}
public void setMesaj(String s){
	JOptionPane.showMessageDialog(null,s);
}


}