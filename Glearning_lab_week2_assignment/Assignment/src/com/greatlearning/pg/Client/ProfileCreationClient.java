package com.greatlearning.pg.Client;
import java.util.Scanner;

import com.greatlearning.pg.Model.*;
import com.greatlearning.pg.Service.*;
//import com.sun.java_cup.internal.runtime.Scanner;


public class ProfileCreationClient {
	
	
	public static void main(String [] args) {
		//Employee 
		//java.util.Scanner scanner = new java.util.Scanner(null) ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your option..");
		System.out.println("Admin.. 0");
		System.out.println("HR.. 1");
		System.out.println("Technical.. 2");
		System.out.println("Legal.. 3");
		int option = scanner.nextInt();
		System.out.println("Enter your firstName..");
		String firstName = scanner.next();
		System.out.println("Enter your lastName..");
		String lastName = scanner.next();
		System.out.println("Enter your department..");
		String department = scanner.next();
		
		Employee employee  = new Employee(firstName, lastName);
		switch (option) {
		case 0: 
			
				employee.setDept(department);
				break;
		
		case 1:
			
				employee.setDept(department);
				break;
			
		case 2:
			
				employee.setDept(department);
				break;
			
		case 3:
			
				employee.setDept(department);
				break;
			
		default:
			throw new IllegalArgumentException("Unexpected value: " + option);
		}
		//Call generatePassword method
		String emailAddress = CredentialService.generateEmailAddress(firstName, lastName, department);
		employee.setEmail(emailAddress);
		System.out.print("Please enter the password length..");
		int length = scanner.nextInt();
		String password = CredentialService.generatePassword(length);
		
		employee.setPassword(password);
		CredentialService.showCredentials(employee);
		//Close opened scanner object
		scanner.close();
	}

}
