package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import model.Book;
import model.Csv;
import model.CsvFactory;
import model.Factory;
import model.User;
import view.AdminWindow;
import view.GUI;

public class AdminController {

	private User user;
	private Book book;
	private AdminWindow view;
	AdminController(Book book,User user,AdminWindow aw)
	{
		this.book=book;
		this.user=user;
		this.view=aw;
	// ... Add listeners to the view.
	
	view.addAddUserListener(new AddUserListener());
	view.addUpdateUserListener(new UpdateUserListener());
	view.addDeleteUserListener(new DeleteUserListener());
	view.addLogOutListener(new LogOutListener());
	view.addAddBookListener(new AddBookListener());
	view.addUpdateBookListener(new UpdateBookListener());
	view.addDeleteBookListener(new DeleteBookListener());
	view.addCsvReportListener(new AddCsvListener());
	}
	   
	class LogOutListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			 if(cmd.equals("Open"))
		        {
				 view.windowClosing();
				 new Controller(new User(),new GUI());
		        }
		}
	}
	
	class DeleteUserListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if(view.getTextfield7().equals(""))
				view.setMesaj("Invalid username");
			else {
					String username=view.getTextfield7();
			        if(cmd.equals("Open"))
			        {
			        	try{
			   	         {User.deleteUser(username);
			   	      view.setMesaj("Employee deleted");
			               }
			          }
			          catch(Exception ee){
			        	  view.setMesaj("Employee don't exist");
			          }
			        }
	        }
		}
	}    
	
	class UpdateUserListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if(view.getTextfield6().equals("")|| !Pattern.matches("[0-9]+", view.getTextfield6()))
				view.setMesaj("Invalid user id");
			else if(view.getTextfield7().equals(""))
				view.setMesaj("Invalid username");
			else if(view.getTextfield8().equals(""))
				view.setMesaj("Invalid password");
			else {
					String id=view.getTextfield6();
			        String username=view.getTextfield7();
			        String pass=view.getTextfield8();
			        if(cmd.equals("Open"))
			        {
			        	if(User.existsUserByID(id))
			    		{ User.updateUser(id,username,pass);
			    		view.setMesaj("Employee updated");
			    		}
			    		else view.setMesaj("Employee don't exist");	     
			        }
			}
		}
	}    
	
	class AddUserListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if(view.getTextfield6().equals("")|| !Pattern.matches("[0-9]+", view.getTextfield6()))
				view.setMesaj("Invalid employee id");
			else if(view.getTextfield7().equals(""))
				view.setMesaj("Invalid username");
			else if(view.getTextfield8().equals(""))
				view.setMesaj("Invalid password");
			else {
					String id=view.getTextfield6();
			        String username=view.getTextfield7();
			        String pass=view.getTextfield8();
			        user=new User(id,username,pass,"employee");
			        if(cmd.equals("Open"))
			        {
			        	if(!User.existsUser(username))
			            {user.addUser();
			            view.setMesaj("Employee inserted");
			            }
			    		else view.setMesaj("Employee exists");
			        }
			}
		}
	}    
	
	class AddBookListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if(view.getTextfield().equals("")|| !Pattern.matches("[0-9]+", view.getTextfield()))
				view.setMesaj("Invalid book id");
			else if(view.getTextfield1().equals(""))
				view.setMesaj("Invalid title");
			else if(view.getTextfield2().equals(""))
				view.setMesaj("Invalid author");
			else if(view.getTextfield3().equals(""))
				view.setMesaj("Invalid genre");
			else if(view.getTextfield4().equals("") || !Pattern.matches("[0-9]+", view.getTextfield4()))
				view.setMesaj("Invalid quantity");
			else if(view.getTextfield5().equals("")|| !Pattern.matches("[0-9]+", view.getTextfield5()))
				view.setMesaj("Invalid price");
			else {
					String id=view.getTextfield();
			        String title=view.getTextfield1();
			        String author=view.getTextfield2();
			        String genre=view.getTextfield3();
			        String quantity=view.getTextfield4();
			        String price=view.getTextfield5();
			        book=new Book(id,title,author,genre,quantity,price);
			        if(cmd.equals("Open"))
			        {
			        	if(Book.isThere(title)==false)
						{book.insertBook();
						view.setMesaj("Book inserted");     
				         }
			        else view.setMesaj("Book exists"); 
			       }
			}
	}    
	}
	class UpdateBookListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
		    if(view.getTextfield1().equals(""))
		    	view.setMesaj("Invalid title"); 
		    if(view.getTextfield4().equals("") || !Pattern.matches("[0-9]+", view.getTextfield4()))
				view.setMesaj("Invalid quantity"); 
			else if(view.getTextfield5().equals("")|| !Pattern.matches("[0-9]+", view.getTextfield5()))
				view.setMesaj("Invalid price");
			else {
			        String title=view.getTextfield1();
			        String quantity=view.getTextfield4();
			        String price=view.getTextfield5();
			        if(cmd.equals("Open"))
			        {
			        	if(Book.isThere(title)==true)
						{Book.updateBook(title,quantity,price);
						view.setMesaj("Book updated");   
				         }
			        else view.setMesaj("Book don't exist"); 
			       }
			}
		}
	}    
	class DeleteBookListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if(view.getTextfield1().equals(""))
				view.setMesaj("Invalid title"); 
			else {
				String title=view.getTextfield1();			       
		        if(cmd.equals("Open"))
		        {
		        	if(Book.isThere(title)==true)
		            {
		        		Book.deleteBook(title);
		        		view.setMesaj("Book deleted");
		            }
		       	 else view.setMesaj("Book don't exist");
		        }
			}
		}
	} 
	
	
	class AddCsvListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Factory f=new Factory();
			CsvFactory cf=(CsvFactory) f.getFactory("CSV");
			Csv csv=(Csv) cf.makecsv();
			csv.genRep();
	}    
}
	
	
}
