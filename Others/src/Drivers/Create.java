package Drivers;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Create {
	
	public static void main(String[]args) {
		System.out.println("Connecting to database");
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();
		System.out.println("created");
		
				
	}
	

}
