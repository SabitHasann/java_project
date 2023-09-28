package interfaces;
import java.lang.*;
import classes.*;

public interface BookOperations
{
	void addBook(Book b);
	void removeBook(Book b);
	void showAllBooks();
	Book getBook(String bookName , String writterName , String publicationName);
}