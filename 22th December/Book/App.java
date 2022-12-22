package com.Book;

import java.util.Scanner;

import DaoImplement.DaoImplement;

public class App 
{
    public static void main( String[] args ) /// main method
    {
    	DaoImplement Dp= new DaoImplement(); // create object of DaoImplement class to to call the methode 
    	System.out.println("************** Welcome to Our BookRecord ***********");
        System.out.println( "Enter your choise :" );  // enter user his/ her chose what he/ she want
        System.out.println("1. To add book \n      2. To fetch details ");
        Scanner sc= new Scanner(System.in);       // to take input from user 
         int i=sc.nextInt();         // taking input from user
         char ans;                    // asking user to continue this process 
         do {                                 // using loop to continue this process
     		switch(i) {                    // to asking what he/ she want
     		case 1:                                // case 1 to add a  book
     			Dp.addbook();;           // call the methode to add book 
     			break;
     		case 2:
     			Dp.fetchbook();              // call the methode to fatch details 
     			break;
     		case 3:
     			System.exit(0);                     // "3" he exit this process 
     			break;
     			default:                                       // if give wrong input 
     				System.out.println("Enter a valid choise");	
     		}
     	System.out.println("Do you want to process again?  y/n");  // asking to continue this process
     	ans=sc.next().charAt(0);                                             // taking input from user
     	}while(ans=='Y' || ans=='y');
     		System.out.println("Thank you");
     	}
    }

