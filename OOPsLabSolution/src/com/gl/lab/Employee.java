package com.gl.lab;

public class Employee {
	private String firstName;
	private String lastName;
	private String departMent;
	private char[] password;
	private String email;
	public String getPassword;
	
    public Employee() {
    	// TODO Auto-generated constructor stub
    }
	
	
	public Employee(String firstName, String lastName, String departMent, char[] password, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.departMent = departMent;
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartMent() {
		return departMent;
	}
	public void setDepartMent(String departMent) {
		this.departMent = departMent;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", departMent=" + departMent
				+ ", password=" + password + ", email=" + email + "]";
	}


	public void showCredentials(Employee emp) {
		// TODO Auto-generated method stub
		
	}
	
	

}
