package com.gl.lab.service;

import java.util.Scanner;

import com.gl.lab.Employee;

public class DriverMain {
	
	public static void main(String[] args, String firstName, String lastName) {
		String FirstName;
		String LastName;
		String department = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first name");
		
		FirstName = input.next();
		System.out.println("Please enter your last name");
		LastName = input.next();
		System.out.println("Please enter your department from the following: \n 1. Technical \n 2. Admin \n 3. Legal \n 4. HR");
		int dep = input.nextInt();
		switch(dep) {
		case 1:
			department = "tech";
			break;
		case 2:
			department = "admin";
			break;
		case 3:
			department = "legal";
				break;
		case 4:
			department = "hr";
					break;
		}
		
		Employee emp = new Employee(firstName, lastName, department, null, department);
		CredentialServices empCred = new CredentialServices();
		empCred.generateEmailAddress(emp);
		empCred.generatePassword(emp);
		emp.showCredentials(emp);
		}
	}

