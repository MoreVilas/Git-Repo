package Service;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
	
	public static void main(String[]args) {
		//create session factory
		System.out.println("Connecting to database");
		SessionFactory factory= new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();
		System.out.println("created");
		
	}

}
