package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import model.Book;
import model.User;
import view.UserWindow;
import view.GUI;

public class UserController {
	
	
	private Book book;
	private UserWindow view;
	public UserController(Book book,UserWindow uw)
	{
		this.book=book;
		this.view=uw;
	// ... Add listeners to the view.
	view.addSearchBookByGenreListener(new SearchBookByGenreListener());
	view.addSearchBookByTitleListener(new SearchBookByTitleListener());
	view.addSearchBookByAuthorListener(new SearchBookByAuthorListener());
	view.addSellBookListener(new SellBookListener());
	view.addLogOutListener(new LogOutListener());
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
	class SearchBookByGenreListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if(view.getTextfield().equals("") ||( !view.getTextfield().equals("epic") && !view.getTextfield().equals("lyric")) )
				view.setMesaj("Invalid book genre");
			else {String genre=view.getTextfield();
			        if(cmd.equals("Open"))
			        {
			        Book.searchByGenre(genre);			     
			        }
				}
		}
	}
	class SearchBookByTitleListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if(view.getTextfield1().equals(""))
				view.setMesaj("Invalid book title");
			else {String title=view.getTextfield1();
			        if(cmd.equals("Open"))
			        {
			        	if(Book.isThere(title)==true)
			        		Book.searchByTitle(title);
			        	else view.setMesaj("Book don't exist");     
			        }
				}
		}
		}
	class SearchBookByAuthorListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if(view.getTextfield2().equals(""))
				view.setMesaj("Invalid book author"); 
			else {String author=view.getTextfield2();
			        if(cmd.equals("Open"))
			        {
			        Book.searchByAuthor(author);     
			        }
				}
		}
		}
	class SellBookListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if(view.getTextfield1().equals(""))
				view.setMesaj("Invalid book title");
			else if(view.getTextfield3().equals("") || !Pattern.matches("[0-9]+", view.getTextfield3()))
				view.setMesaj("Invalid number of copies");
			else {String title=view.getTextfield1();
			      int nr=Integer.parseInt(view.getTextfield3());
			        if(cmd.equals("Open"))
			        {
			        Book.sellBook(title,nr);     
			        }
				}
		}
		}
	
}