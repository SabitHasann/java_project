package classes;
import java.lang.*;
import java.util.*;
import interfaces.*;

public class Store implements BookOperations
{
	private Book books[] = new Book[100];
	Scanner sc = new Scanner(System.in);

	public void addBook(Book b)
	{
		int flag = 0;
		for(int i=0; i<books.length; i++)
		{
			if(books[i] == null)
			{
				books[i] = b;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			if(b.bookName =="Witcher" || b.bookName == "Himu" || b.bookName == "Phoenix" ||  b.bookName == "IT" || b.bookName == "Harry Potter"){}
			else{System.out.println("\nBook's Information Inserted");}
		}
		else{System.out.println("\nBook's Information cannot be Inserted");}
	}

	public void removeBook(Book b)
	{
		int flag = 0;
		for(int i=0; i<books.length; i++)
		{
			if(b != null && books[i] == b)
			{
				books[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("\nBook Removed");}
		else{System.out.println("\nBook cannot be Removed");}
	}

	public void showAllBooks()
	{
		for(int i=0; i<books.length; i++)
		{
			if(books[i] != null)
			{
				System.out.println("\n.......................");
				System.out.println("Book Name 	: "+books[i].getBookName());  
				System.out.println("Writter Name 	: "+books[i].getWritterName());
				System.out.println("Publication Name: "+books[i].getPublicationName());
			}
		}
	}
	
	public Book getBook(String bookName , String writterName , String publicationName)
	{
		Book b = null;
		
		for(int i=0; i<books.length; i++)
		{
			if(books[i] != null)
			{
				if(books[i].getBookName().equals(bookName) && books[i].getWritterName().equals(writterName) && books[i].getPublicationName().equals(publicationName))
				{
					b = books[i];
					break;
				}
			}
		}
		if(b != null){System.out.println("\nBook Found");}
		else{System.out.println("\nBook not Found");}
		return b;
	}

}