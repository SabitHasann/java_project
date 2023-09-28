package classes;
import java.lang.*;

public class Book
{
	protected String bookName;
	protected String writterName;
	protected String publicationName;

	public Book(String bookName,String writterName,String publicationName)
	{
		this.bookName=bookName;
		this.writterName=writterName;
		this.publicationName=publicationName;
	}
	public void setBookName(String bName){this.bookName = bookName;}
	public void setWritterName(String writterName){this.writterName = writterName;}
	public void setPublicationName(String publicationName){this.publicationName = publicationName;}
	
	public String getBookName(){return bookName;} 
	public String getWritterName(){return writterName;}
	public String getPublicationName(){return publicationName;} 
}