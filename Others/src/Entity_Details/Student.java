package Entity_Details;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Student {

	public static void main(String[]args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addClass(Student.class)
				.buildSessionFactory();
		
		
	}

}
