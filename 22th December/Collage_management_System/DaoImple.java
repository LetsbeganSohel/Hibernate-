package DaoImplement.com;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Dao.com.Dao;
import Util.com.UserDetail;

public class DaoImple implements Dao{
	Scanner sc= new Scanner(System.in);
	int id;
	long phno;
	String name,add,email;
	Session sess = HibernetCon.activateSession();
	Transaction t=sess.beginTransaction();
	public void AddStudent() {
		UserDetail  Ud= new UserDetail ();
       	System.out.println("Enter Youir id");
       	id=sc.nextInt();
    	System.out.println("Enter Your Name");
    	 name=sc.next();
    	System.out.println("Enter Youir Phone Number");
    	phno=sc.nextLong();
    	System.out.println("Enter Youir Email ");
    	email=sc.next();
    	System.out.println("Enter Youir city");
    	add=sc.next();
    	Ud.setId(id);
    	Ud.setName(name);
    	Ud.setPhno(phno);
    	Ud.setEmail(email);
    	Ud.setAdd(add);
    	sess.save(Ud);
//    	System.out.println("Your data inserted successfully");
    	t.commit();
    	sess.close();
	}
	public void Update() {
		UserDetail  Ud= new UserDetail ();
	 	System.out.println("Enter Youir id");
       	int i=sc.nextInt();
       	sess.get(UserDetail.class, i);
       	System.out.println("Enter Your Updated Phone Number");
    	long Pno=sc.nextLong();
		Ud.setPhno(Pno);
		sess.save(Ud);
		System.out.println("Your Phone Nuimber Updated successfully");
		t.commit();
		sess.close();
	}
	public void Fetch() {
		UserDetail  Ud= new UserDetail ();
		System.out.println("Enter Youir id");
       	int d=sc.nextInt();
       	sess.get(UserDetail.class,d);
       	System.out.println("Your id is: "+Ud.getId()+"\n"+"Your name is :"+Ud.getName()+"\n"+
       	"Your Phone Number is :"+Ud.getPhno()+"\n"+"Your mail is :"+Ud.getEmail()+"\n"+"Your address is:"+
       			Ud.getAdd());
       	sess.save(Ud);
       	t.commit();
       	sess.close();
	}

}
