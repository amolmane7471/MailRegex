package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MailValidate {
	static Scanner sc = new Scanner(System.in);

	public static void mailvalidation()
	{
		 System.out.println("enter your mail: ");
	      String mail = sc.next();
	  
	      boolean result = Pattern.matches("^[abc]+[.]*[a-zA-Z0-9]+[@]*[a-z0-9]+[.]*[a-z]+$",mail);  
	      
	      if(result) {
	         System.out.println("mail is valid");
	      } else {
	         System.out.println("mail is not valid");
	      }
	      mailvalidation();
	}
	public static void main(String[] args) {
		System.out.println("**** Regex Mail Validation ****");
		mailvalidation();
	}

}
