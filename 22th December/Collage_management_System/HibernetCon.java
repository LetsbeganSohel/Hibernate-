package DaoImplement.com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernetCon {
	public static Session activateSession() {
		Configuration cg=new Configuration();       // creating object 
		cg.configure("hibernate.cfg.xml");             // call method by object 
		SessionFactory sf=cg.buildSessionFactory();  //  creating object 
		Session session=sf.openSession();                     // opening session
		return session;                                                  // return the session 
	}

}
