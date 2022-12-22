package DaoImplement;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.Book.Dao.Dao;


import Util.com.UtilTable;

public class DaoImplement  implements Dao{             // extends interface
	Session s=hibernate.activateSession();                      //to activate session
	Transaction tx=s.beginTransaction();                         // to begin transaction
	Scanner sc= new Scanner(System.in);                     // take input from user
	 int bookid,price;                                                            // variables 
	 String Bname,author;                                                      // variables 
	public void addbook() {                                                  // implements methods 
		 UtilTable ut=new  UtilTable();                                // creating object
		 System.out.println("Enter your Book id");             // take input from user
		 bookid=sc.nextInt();                                                      // take input from user
		 System.out.println("Enter your Book Book name");     // take input from user
		 Bname=sc.next();                                                                     // take input from user
		 System.out.println("Enter your Authore name ");    // take input from user
		 author=sc.next();                                                                   // take input from user
		 System.out.println("Enter your Book price ");                // take input from user
		 price=sc.nextInt();                                                                   // take input from user
		 ut.setBookid(bookid);                                                 // set the data in table 
		 ut.setBname(Bname);                                                 // set the data in table 
		 ut.setAuthor(author);                                                    // set the data in table 
		 ut.setPrice(price);                                                           // set the data in table 
		 s.save(ut);                                                                       // save the  data in table 
		 tx.commit();                                                                  // tracsation close 
		 s.close();	                                                                      // session close 
	}
	public void fetchbook() {                                         // implement methode 
		Session s=hibernate.activateSession();          // activate session 
		Transaction tx=s.beginTransaction();              //transactionm begins 
		 Scanner sc= new Scanner(System.in);         // scanner object to take data from user
		 System.out.println("Enter your Book id");  // take input from user
		   int i=sc.nextInt();                                             // take input from user
		 UtilTable ut=s.get(UtilTable.class, i);           // match id from table 
		System.out.println("Your details is :");
		System.out.println("Your book id is :" +ut.getBookid()+"\n"+ "Your name is :"+ut.getBname()+"\n"+
		"Your book author name is :"+ ut.getAuthor()+"\n"+" Your book price is :"+ut.getPrice());
		/// factching data from table 
		tx.commit();                            // tracsation close 
		s.close();                                     // closing session 
	}

}
