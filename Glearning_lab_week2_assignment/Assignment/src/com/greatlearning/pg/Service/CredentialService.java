package com.greatlearning.pg.Service;

import java.util.Random;

import com.greatlearning.pg.Model.Employee;

public class CredentialService {
	//Generate email,password and display password
	public final static String generateEmailAddress(String firstName,String lastName, String dept) {

	return firstName+"_"+lastName+"@"+dept+"company.com";
}


	public final  static String generatePassword(int length)
	{
	
		String capitalLetters ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstvwxyz";
		String numbers="0123456789";
		String specialCharacters ="!@#$%^&*_=+.?<>)";
		
		String seed=capitalLetters+smallLetters+numbers+specialCharacters;
		Random random= new Random();
		if(length< 0)
			{
				throw new IllegalArgumentException("Pasword length should be greater than 8 characters");
			}
		char [] password = new char[length];
		
		for (int i = 0; i < length; i++) 
			
			{
				int randomNumber = random.nextInt(seed.length());
				char c = seed.charAt(randomNumber);
				password[i] = c;
				
			}
			return String.copyValueOf(password);
			
		}


		public static void showCredentials(Employee employee) 
	
		
			System.out.println("Dear "+employee.getFirstName()+""+"your generated credentials are as follows");
			System.out.println("========="+employee.getFirstName()+" "+employee.getLastName()+"=======");
			System.out.println("First Name "+employee.getFirstName());
			System.out.println("Last Name "+employee.getLastName());
			System.out.println("Email Address "+employee.getEmailAddress());
			System.out.println("Password "+employee.getPassword());
			System.out.println("========="+employee.getFirstName()+" "+employee.getLastName()+"=======");
		}
	
}
