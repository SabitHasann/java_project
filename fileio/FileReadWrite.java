package fileio;
import java.lang.*;
import java.util.*;
import java.io.*;

public class FileReadWrite 
{
	public void writeInFile() throws FileNotFoundException 
	{
		try
		{
			File f = new File("About.txt");
			f.createNewFile();
			Scanner content = new Scanner(f);
			if(content.hasNextLine()){}
			else
			{
				BufferedWriter bfr = new BufferedWriter(new FileWriter("About.txt", true));
				bfr.write("\n............................................................................................\n\nWelcome to Book Store Management System. In this applicaton we offer you -\n\t* Store Owner Registration and Login.\n\t* Customer Registration and Login.\n\t* Can take multiple user Login/Registration.\n\t* It has Manage Books, Add Books, Remove Books, Searching Books and Show All Books for Store Owner.\n\t* Customers can choose from multiple Books and Buy them.\n\nThis Application is Developed by : Sabit[21-45306-2] , Zayed[21-45021-2], Devdoot[21-45061-2] and Punam[21-44946-2]\n\n\t(c) 2021 Bookstore. Inc SabitZayedDevdootPunam[Group 9]. All Rights Reserved.\n............................................................................................\n");
				bfr.close();
			}
		}
		catch(IOException e)
		{
			System.out.println("An error occurred");
			e.printStackTrace();
		}
	}

	public void readFromFile() throws FileNotFoundException
	{
		try
		{
			File f = new File("About.txt");
			Scanner content = new Scanner(f);
			while(content.hasNextLine())
			{
				System.out.println(content.nextLine());
			}
		}
		catch(IOException e)
		{
			System.out.println("An error occurred");
			e.printStackTrace();
		}
	}

}
