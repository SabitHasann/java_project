import java.lang.*;
import java.util.*;
import java.io.*;
import classes.*;
import interfaces.*;
import fileio.*;

public class Start
{
	public static void main(String args[]) throws FileNotFoundException
	{
		try 
		{ 
            File obj = new File("adminRegistration.txt");   
            obj.createNewFile();
            File obj1 = new File("userRegistration.txt");
            obj1.createNewFile();      
        } 
        catch (Exception e) 
        {
            System.out.println("An error occurred");
            e.printStackTrace();      
        }

        FileReadWrite frw = new FileReadWrite();
        Store store = new Store();

        Book b1 = new Book("Witcher","Andrez","SuperNowa");
        Book b2 = new Book("Himu","Humayun Ahmed","Mayurakkhi");
        Book b3 = new Book("Phoenix","Zafar Iqbal","SomoyProkashon");
        Book b4 = new Book("IT","Stephen King","Viking");
        Book b5 = new Book("Harry Potter","J.K.Rowling","Bloomsbury");

        store.addBook(b1);
        store.addBook(b2);
        store.addBook(b3);
        store.addBook(b4);
        store.addBook(b5);

        System.out.println("\nWelcome to Book Store Management Application");
        Scanner sc = new Scanner(System.in);
        boolean choice = true;
        while(choice)
        {
            System.out.println("\nHere are Some Options for You:");
            System.out.println("    1. Store Owner");
            System.out.println("    2. Customer");
            System.out.println("    3. About this Application");
            System.out.println("    4. Exit the Application");
            System.out.println("Enter your Choice");
            
            int first=sc.nextInt();

            switch(first)
            {
                case 1:
                    System.out.println("You have Selected 'Store Owner'");
                    System.out.println("\nHere are Some Options for You:");
                    System.out.println("    1. Admin Registration");
                    System.out.println("    2. Admin Login");
                    System.out.println("    3. Go Back");           
                    System.out.println("Enter your Choice");
            
                    int second=sc.nextInt();

                    switch(second)
                    {
                        case 1:
                            Scanner sc1 = new Scanner(System.in);
                            System.out.println("You have Selected 'Admin Registration'\n");
                            System.out.println("Enter User Name: ");
                            String uName1=sc1.nextLine();        
                            System.out.println("Enter Password: ");
                            String pass1=sc1.nextLine();         
                            System.out.println("Confirm Password: ");
                            String conPass1=sc1.nextLine();

                            uName1=uName1.trim();
                            pass1=pass1.trim();
                            conPass1=conPass1.trim();
                            String combine1= uName1+" "+pass1;

                            if(pass1.equals(conPass1))
                            {
                                try
                                {
                                    File f = new File("adminRegistration.txt");
                                    Scanner content1 = new Scanner(f);
                                    int flag = 0;
                                    while (content1.hasNextLine()) 
                                    {
                                        if(content1.nextLine().equals(combine1))
                                        {
                                            System.out.println("\nAlready Registered");
                                            flag = 1;
                                        }          
                                    }
                                    if(flag == 0)
                                    {
                                        try 
                                        {
                                            BufferedWriter out1 = new BufferedWriter(new FileWriter("adminRegistration.txt", true)); 
                                            out1.write(uName1+" "+pass1+"\n");
                                            out1.close();
                                        }
                                        catch (Exception e2) 
                                        {
                                            System.out.println("\nAn error occurred");
                                            e2.printStackTrace();
                                        }
                                        System.out.println("\nSuccessfully Registered");
                                    }        
                                }
                                catch (Exception e3)
                                {
                                    System.out.println("\nAn error occurred");
                                    e3.printStackTrace();
                                }
                            }
                            else
                            {
                                System.out.println("\nThe Password Confirmation and Password must Match");
                            }
                            break;

                        case 2:
                            Scanner sc2=new Scanner(System.in);
                            System.out.println("You have Selected 'Admin Login'\n");
                            System.out.println("Enter User Name: ");
                            String uName2=sc2.nextLine();       
                            System.out.println("Enter Password: ");
                            String pass2=sc2.nextLine();

                            uName2=uName2.trim();
                            pass2=pass2.trim();
                            String combine2= uName2+" "+pass2;
                  
                            try 
                            {
                                File f = new File("adminRegistration.txt");
                                Scanner content2 = new Scanner(f);
                                int flag = 0;
                                while (content2.hasNextLine()) 
                                {        
                                    if(content2.nextLine().equals(combine2))
                                    {
                                        System.out.println("\nAdmin Login Successful");
                                        System.out.println("\nWelcome Back, "+uName2);
                                        
                                        boolean choice1 = true;
                                        while(choice1)
                                        {
                                            System.out.println("\nHere are Some Options for You:");
                                            System.out.println("    1. Manage Books");
                                            System.out.println("    2. Search for Books");
                                            System.out.println("    3. Show All Books");
                                            System.out.println("    4. Log Out");
                                            System.out.println("Enter your Choice");

                                            int third=sc.nextInt();
                                            switch(third)
                                            {
                                                case 1:
                                                    System.out.println("You have Selected 'Manage Books'");
                                                    System.out.println("\nHere are Some Options for You:");
                                                    System.out.println("    1.Add Books");
                                                    System.out.println("    2.Remove Books");
                                                    System.out.println("    3.Go Back");
                                                    System.out.println("Enter your Choice");

                                                    int fourth=sc.nextInt();
                                                    switch(fourth)
                                                    {
                                                        case 1:
                                                            Scanner sc3 = new Scanner(System.in);
                                                            System.out.println("You have Selected 'Add Books'\n");
                                                            System.out.println("Enter Book Name : ");
                                                            String bookName = sc3.nextLine();
                                                            System.out.println("Enter Writter Name : ");
                                                            String writterName = sc3.nextLine();
                                                            System.out.println("Enter Publication Name : ");
                                                            String publicationName = sc3.nextLine();

                                                            bookName=bookName.trim();
                                                            writterName=writterName.trim();
                                                            publicationName=publicationName.trim();
                                            
                                                            Book b = new Book(bookName,writterName,publicationName);
                            
                                                            store.addBook(b);
                                                            break;

                                                        case 2:
                                                            Scanner sc4 = new Scanner(System.in);
                                                            System.out.println("You have Selected 'Remove Books'\n");                                           
                                                            System.out.println("Enter Book Name : ");
                                                            String bookName2 = sc4.nextLine();
                                                            System.out.println("Enter Writer Name : ");
                                                            String writterName2 = sc4.nextLine();
                                                            System.out.println("Enter Publication Name : ");
                                                            String publicationName2 = sc4.nextLine();

                                                            bookName2=bookName2.trim();
                                                            writterName2=writterName2.trim();
                                                            publicationName2=publicationName2.trim();
                                            
                                                            store.removeBook(store.getBook(bookName2,writterName2,publicationName2));
                                                            break;

                                                        case 3:
                                                            System.out.println("You have Selected 'Go Back'");
                                                            break;
                                                    
                                                        default:
                                                            System.out.println("\nInvalid Input");
                                                            break;
                                                    }
                                                    break;

                                                case 2:
                                                    Scanner sc5 = new Scanner(System.in);
                                                    System.out.println("You have Selected 'Search for Books'\n");
                                                    System.out.println("Enter Book Name : ");
                                                    String bookName = sc5.nextLine();
                                                    System.out.println("Enter Writer Name : ");
                                                    String writterName = sc5.nextLine();
                                                    System.out.println("Enter Publication Name : ");
                                                    String publicationName = sc5.nextLine();

                                                    bookName=bookName.trim();
                                                    writterName=writterName.trim();
                                                    publicationName=publicationName.trim();
                                            
                                                    store.getBook(bookName,writterName,publicationName);                                    
                                                    break;

                                                case 3:
                                                    System.out.println("You have Selected 'Show All Books'\n");                                
                                                    store.showAllBooks();
                                                    System.out.println("\n***********************");
                                                    break;

                                                case 4:
                                                    System.out.println("You have Selected 'Log Out'");
                                                    System.out.println("|| We will Miss You || Have a Great Day ||");
                                                    choice1 = false;
                                                    break;

                                                default:
                                                    System.out.println("\nInvalid Input");
                                                    break;
                                            }
                                        }
                                        flag = 1;
                                    }
                                    
                                }
                                if(flag == 0)
                                {
                                    System.out.println("\nLogin Failed");
                                    content2.close();
                                }                            
                            } 
                            catch (Exception e4) 
                            {
                                System.out.println("\nAn error occurred");
                                e4.printStackTrace();
                            }
                            break;

                        case 3:
                            System.out.println("You have Selected 'Go Back'");
                            break;

                        default:
                            System.out.println("\nInvalid Input");
                            break;
                    }
                    break;


                case 2:
                    System.out.println("You have Selected 'Customer'");
                    System.out.println("\nHere are Some Options for You:");
                    System.out.println("    1. Customer Registration");
                    System.out.println("    2. Customer Login");
                    System.out.println("    3. Go Back");           
                    System.out.println("Enter your Choice");

                    int second1=sc.nextInt();

                    switch(second1)
                    {
                        case 1:
                            Scanner sc1 = new Scanner(System.in);
                            System.out.println("You have Selected 'Customer Registration'\n");
                            System.out.println("Enter User Name: ");
                            String uName1=sc1.nextLine();        
                            System.out.println("Enter Password: ");
                            String pass1=sc1.nextLine();         
                            System.out.println("Confirm Password: ");
                            String conPass1=sc1.nextLine();

                            uName1=uName1.trim();
                            pass1=pass1.trim();
                            conPass1=conPass1.trim();
                            String combine1= uName1+" "+pass1;

                            if(pass1.equals(conPass1))
                            {
                                try
                                {
                                    File f = new File("userRegistration.txt");
                                    Scanner content1 = new Scanner(f);
                                    int flag = 0;
                                    while (content1.hasNextLine()) 
                                    {
                                        if(content1.nextLine().equals(combine1))
                                        {
                                            System.out.println("\nAlready Registered");
                                            flag = 1;
                                        }          
                                    }
                                    if(flag == 0)
                                    {
                                        try 
                                        {
                                            BufferedWriter out1 = new BufferedWriter(new FileWriter("userRegistration.txt", true)); 
                                            out1.write(uName1+" "+pass1+"\n");
                                            out1.close();
                                        }
                                        catch (Exception ee) 
                                        {
                                            System.out.println("\nAn error occurred");
                                            ee.printStackTrace();
                                        }
                                        System.out.println("\nSuccessfully Registered");
                                    }        
                                }
                                catch (Exception e5)
                                {
                                    System.out.println("\nAn error occurred");
                                    e5.printStackTrace();
                                }
                            }
                            else
                            {
                                System.out.println("\nThe Password Confirmation and Password must Match");
                            }
                            break;

                        case 2:
                            Scanner sc2=new Scanner(System.in);
                            System.out.println("You have Selected 'Customer Login'\n");
                            System.out.println("Enter User Name: ");
                            String uName2=sc2.nextLine();       
                            System.out.println("Enter Password: ");
                            String pass2=sc2.nextLine();

                            uName2=uName2.trim();
                            pass2=pass2.trim();
                            String combine2= uName2+" "+pass2;
                  
                            try 
                            {
                                File f = new File("userRegistration.txt");
                                Scanner content2 = new Scanner(f);
                                int flag = 0;
                                while (content2.hasNextLine()) 
                                {        
                                    if(content2.nextLine().equals(combine2))
                                    {
                                        System.out.println("\nCustomer Login Successful");
                                        System.out.println("\nWelcome Back, "+uName2);
                                        boolean choice2 = true;
                                        while(choice2)
                                        {
                                            System.out.println("\nHere are Some Options for You:");
                                            System.out.println("    1. Search for Books");
                                            System.out.println("    2. Buy Books");
                                            System.out.println("    3. Trending Books");
                                            System.out.println("    4. Log Out");
                                            System.out.println("Enter your Choice");

                                            int five=sc.nextInt();
                                            switch(five)
                                            {
                                                case 1:
                                                    Scanner sc5 = new Scanner(System.in);
                                                    System.out.println("You have Selected 'Search for Books'\n");
                                                    System.out.println("Enter Book Name : ");
                                                    String bookName = sc5.nextLine();
                                                    System.out.println("Enter Writer Name : ");
                                                    String writterName = sc5.nextLine();
                                                    System.out.println("Enter Publication Name : ");
                                                    String publicationName = sc5.nextLine();

                                                    bookName=bookName.trim();
                                                    writterName=writterName.trim();
                                                    publicationName=publicationName.trim();
                                            
                                                    store.getBook(bookName,writterName,publicationName);                                    
                                                    break;

                                                case 2:
                                                    System.out.println("You have Selected 'Buy Books'\n");
                                                    String books[] = new String[5];
                                                    Scanner sc6 = new Scanner(System.in);
                                                    books[0] = "Witcher";
                                                    books[1] = "Himu";
                                                    books[2] = "Phoenix";
                                                    books[3] = "IT";
                                                    books[4] = "Harry Potter";

                                                    int costs [] = new int [5];
                                                    costs[0] = 2099;
                                                    costs[1] = 2400;
                                                    costs[2] = 1600;
                                                    costs[3] = 1700;
                                                    costs[4] = 2500;

                                                    System.out.println("Available Books: ");

                                                    for(int i = 0; i < 5; i++)
                                                    {
                                                        int val = i + 1;
                                                        System.out.println("\t"+val+"." + books[i]);
                                                        System.out.println("\t  Price: "+costs[i]+"\n");
                                                    }

                                                    System.out.println("How many books do you want to purchase ?");
                                                    int total = sc6.nextInt();

                                                    int choiceLimit = 0;
                                                    int sum = 0;
                                                    while(choiceLimit < total) 
                                                    {
                                                        System.out.println("Enter the Book's number from the list:");
                                                        int choice7 = sc6.nextInt();
                                                        
                                                        if(choice7 <=5 )
                                                        {
                                                            for (int i = 0; i < 5; i++) 
                                                            {
                                                                if (choice7-1 == i) 
                                                                {
                                                                    System.out.println(books[i] + " added to your cart.\n");
                                                                    sum += costs[i];
                                                                }
                                                            }
                                                        }
                                                        else
                                                        {
                                                            System.out.println("\nInvalid Input!! Please, select from the mentioned list.");
                                                            choiceLimit=choiceLimit-1;
                                                        }
                                                        choiceLimit++;
                                                    }       
                                                    System.out.println("Total cost:  BDT "+sum);
                                                    System.out.println("\n[Write 1] to confirm your purchase  or [Write 2] for cancellation!!");
                                                    int choice6 = sc6.nextInt();
                                        
                                                    if(choice6==1)
                                                    {
                                                        System.out.println("\nPurchase successfull");
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\nPurchase cancelled!!");
                                                    }
                                                    break;

                                                case 3:
                                                    System.out.println("You have Selected 'Trending Books'\n");
                                                    System.out.println("Here are the top 3 trending Books of this month :");
                                                    System.out.println("\t1st. Harry Potter\n\t2nd. Witcher\n\t3rd. IT");
                                                    System.out.println("\n***********************");
                                                    break;

                                                case 4:
                                                    System.out.println("You have Selected 'Log Out'\n");
                                                    System.out.println("|| We will Miss You || Have a Great Day ||");
                                                    choice2 = false;
                                                    break;

                                                default:
                                                    System.out.println("\nInvalid Input");
                                                    break;
                                            }
                                        }
                                        flag = 1;
                                    }
                                    
                                }
                                if(flag == 0)
                                {
                                    System.out.println("\nLogin Failed");
                                    content2.close();
                                }                            
                            } 
                            catch (IOException e6) 
                            {
                                System.out.println("\nAn error occurred");
                                e6.printStackTrace();
                            }
                            break;

                        case 3:
                            System.out.println("You have Selected 'Go Back'");
                            break;

                        default:
                            System.out.println("\nInvalid Input");
                            break;
                    }
                    break;
            
                case 3:
                    System.out.println("You have Selected 'About this Application'");
                    frw.writeInFile();
                    frw.readFromFile();
                    break;
                
                case 4:
                    System.out.println("You have selected 'Exit the Application'");
                    System.out.println("\nThank you for using Book Store Management Application");
                    choice = false;
                    break;
                
                default:
                    System.out.println("\nInvalid Input");
                    break;

            }
        } 
        
    }
     
}