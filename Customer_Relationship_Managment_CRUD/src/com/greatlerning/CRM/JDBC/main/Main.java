package com.greatlerning.CRM.JDBC.main;

import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class Main {

	static JdbcTemplate jdbcTemplateOBJ;
	static SimpleDriverDataSource dataSourceOBJ;
	
	static String USERNAME = "root";
	static String PASSWORD = "Jigar@121";
	static String URL ="jdbc:mysql://localhost:3306/customer_relationship_management_crud";
	
	public static SimpleDriverDataSource getDatabaseConnection() {
		dataSourceOBJ = new SimpleDriverDataSource();
		try {
			dataSourceOBJ.setDriver(new com.mysql.cj.jdbc.Driver());
			dataSourceOBJ.setUrl(URL);
			dataSourceOBJ.setUsername(USERNAME);
			dataSourceOBJ.setPassword(PASSWORD);
		}catch(SQLException sqlException) {
			sqlException.printStackTrace();
			
		}
		return dataSourceOBJ;
	}
	public static void main(String[] args) {
		jdbcTemplateOBJ = new JdbcTemplate(getDatabaseConnection());
		
		//System.out.println("Connecting...... "+jdbcTemplateOBJ);
		if (null!=jdbcTemplateOBJ) {
			 
			String sqlInsertQuery = "Insert INTO Customer(First_name,Last_name,Email) VALUES(?,?,?)";
			for(int counter = 1;counter<4;counter++) {
				jdbcTemplateOBJ.update(sqlInsertQuery,"Customer"+counter,"Customer"+counter+"@greatelerning.in");
			}
			String sqlUpdateQuery = "UPDATE Customer set email = ? where name = ?";
			jdbcTemplateOBJ.update(sqlUpdateQuery,"Harshit@greatelearning.in","Customer1");
		}
		
	}

}
