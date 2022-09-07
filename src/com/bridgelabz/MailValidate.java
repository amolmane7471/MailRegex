package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Pattern;
/*
 * purpose : validate email address with regex
 * @uthor : Amol
 * since : 2022/09/06
 */
public class MailValidate {
	static Scanner sc = new Scanner(System.in);

	public static void mailvalidation()
	{
		 System.out.println("enter your mail: ");
	      String mail = sc.next();
	  
	      boolean result = Pattern.matches("^[abc]+[-_+.]{1}+[a-zA-Z]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]*{1}[a-z]{2}$",mail);  
	      
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
