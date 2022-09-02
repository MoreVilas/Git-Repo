package com.learming.springJDBC.main;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.jdbc.datasource.SmartDataSource;

import com.learming.springJDBC.entity.Employee;

import java.util.List;

//import com.learning.springJDBC.entity.Employee;

public class Main {
	static JdbcTemplate JdbcTemplateOBJ;
	static SimpleDriverDataSource dataSourceOBJ;
	//1.Creating Connection	
	//configure database
	static String USERNAME = "root";
	static String PASSWORD = "Jigar@121";
	static String URL = "jdbc:mysql://localhost:3306/springjdbc";
	
	public static SimpleDriverDataSource getDatabaseConnection() {
		//2.inform the Spring code about Database
		dataSourceOBJ = new SimpleDriverDataSource();
		try {
			//3.Setting Driver Class
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
		// TODO Auto-generated method stub
		
		JdbcTemplateOBJ = new JdbcTemplate(getDatabaseConnection());
	//	System.out.println("The Connection:- "+JdbcTemplateOBJ);
        if(null!=JdbcTemplateOBJ) {
		//4.SQL INSERT Query
        	String sqlInsertQuery = " Insert INTO employee(name,email,address,phoneno) VALUES (?,?,?,?)";
        	for(int counter = 1;counter<5;counter++) {
        		JdbcTemplateOBJ.update(sqlInsertQuery,"Employee"+counter,"Employee"+counter+"@greatlearning.in","delhi","1234567");
        	}
		//5.SQL Update
        	String sqlUpdateQuery = "UPDATE Employee set email = ? where name = ?";
        	JdbcTemplateOBJ.update(sqlUpdateQuery,"admin@greatlearnig.in","Employee2");
		//6.SQL READ
        	String sqlSelectQuery ="SELECT name,email,address,phoneNo FROM Employee ";
        	List listEmployee = JdbcTemplateOBJ.query(sqlSelectQuery, new RowMapper() {
        		public Employee mapRow(ResultSet result, int rowNum) throws SQLException{
        			Employee employeeObj = new Employee();
        			employeeObj.setName(result.getString("name"));
        			employeeObj.setEmail(result.getString("email"));
        			employeeObj.setAddress(result.getString("address"));
        			employeeObj.setPhoneno(result.getString("phoneNo"));
        			return employeeObj;
        		}
        	});
        	System.out.println(listEmployee);
		//7.SQL Delete
        	String sqlDeleteQuery = "DELETE from Employee where name = ?";
        	JdbcTemplateOBJ.update(sqlDeleteQuery, "Employee1");
        	
		//8.close the connection
        	}
        	else {
        		System.out.println("Please check connection");
        	}
	}
}
