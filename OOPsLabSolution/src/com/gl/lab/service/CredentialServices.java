package com.gl.lab.service;

import java.util.Random;

import com.gl.lab.Employee;

public class CredentialServices {
	
	public char[] generatePassword(Employee employee) {
		String pattern = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()1234567890abcdefghijklmnopqrstuvwxyz";
		int length = 10;
		Random random = new Random();
		char[] password = new char[10];
		
		for(int i=0; i<length; i++) {
			password[i] = pattern.charAt(random.nextInt(pattern.length())); 
		}
		employee.setPassword(password);
		return password;
		
	}
	public String generateEmailAddress(Employee employee) {
		String company = ".greatlearning.com";
		String email = employee.getFirstName()+employee.getLastName()+"@"+employee.getDepartMent()+company;
		employee.setEmail(email);
		return email;  
	}
	public void showCredentials(Employee employee) {
		System.out.println("Employee details for" + employee.getFirstName() + "are: \n" + employee.getEmail() + "\n" + employee.getPassword);
		
		
	}

}
