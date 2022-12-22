package DaoImplement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class hibernate {
	public static Session activateSession() {
		Configuration cfg=new Configuration();       // creating object 
		cfg.configure("hibernate.cfg.xml");             // call method by object 
		SessionFactory sf=cfg.buildSessionFactory();  //  creating object 
		Session session=sf.openSession();                     // opening session
		return session;                                                  // return the session 
	}

}
