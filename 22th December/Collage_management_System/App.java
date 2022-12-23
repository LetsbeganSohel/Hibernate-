package com.CMS;

import java.util.Scanner;

import DaoImplement.com.DaoImple;

public class App 
{
    public static void main( String[] args )
    {
    	DaoImple Dp= new DaoImple();
    	Scanner sc=new Scanner(System.in);
        System.out.println( " *********Welcome To Apna Collage ***********" );
        System.out.println("Enter your choise");
        System.out.println("Press"+"\n"+"1. Add your name "+"\n"+"2. Update Your phone Number"+"\n"+
        "3. Show Your details"+"\n"+" 4. Exit");
        int i=sc.nextInt();
        char c;
        do {
        	switch(i) {
        	case 1:
        		Dp.AddStudent();
        		break;
        	case 2:
        		Dp.Update();
        		break;
        	case 3:
        		Dp.Fetch();
        		break;
        	case 4:
        		System.exit(0);
        		break;
        		default:
        			System.out.println("Enter valid choise");
        	}
        	System.out.println("Do you continue the process y/n");
        	c=sc.next().charAt(0);
        }while(c=='y'||c=='Y');
        System.out.println("Thank You , visit again");
        	
    }
}
