package com.greatlearning.pg.Model;

public class Employee {
	private String firstName;
	private String password;
	private String dept;
	private String emailAddress;
	
	public Employee(String firstName,String lastName)
		
		{
			this.firstName = firstName;
			this.lastName = lastName;
			
		}
	
	public String getPassword() {
		return password;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	private String lastName;
	//private final string dept;

	public String getDept() {
		return dept;
	}
	public  void setDept(String dept) {
		this. dept = dept;
	}

	public  void setEmail(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public  void setPassword(String password) {
		this. password = password;
	}
	public  void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public  void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
