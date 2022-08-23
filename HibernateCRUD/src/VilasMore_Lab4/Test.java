package VilasMore_Lab4;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {
	private static final String DirverManager = null;

	public static void main(String[]args) {
		
		String jdbc = "jdbc:mysql://localhost:3306/ecommerce_db";
		String userName = "root";
		String password= "Jigar@121";
		
		try {
			System.out.println("jdbc url: "+jdbc);
			
			Connection myconn = DriverManager.getConnection(jdbc,userName,password);
			
			System.out.println("Connection Successful");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
