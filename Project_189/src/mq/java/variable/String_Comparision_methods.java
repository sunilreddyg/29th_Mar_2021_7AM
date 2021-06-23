package mq.java.variable;

import javax.security.auth.login.AccountNotFoundException;

public class String_Comparision_methods 
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * String:--> 
		 * 			=> String allow to store set of characters
		 * 			=> String is a non primitive datatype
		 * 			=> String is non only a datatype also called as class
		 * 			=> Because string contains set of events[methods] to 
		 * 				validate stored characters..
		 */
		
		
		
		/*
		 * Equals:-->
		 * 			Method verify any two strings equal comparision and return
		 * 			boolean value true/false.
		 * 			
		 * 			Note:--> Equal compare case sensitive characters
		 */
		String exp_res="Account Created";
		String act_res="account created";
		
		boolean flag=act_res.equals(exp_res);
		System.out.println("Equal comparision is ---> "+flag);
		
		
		/*
		 * EqualIgnorecase:-->
		 * 			Method verify any two string comparision by ignoring casesensitive
		 * 			and return boolean value true/false.
		 */
		boolean flag1=act_res.equalsIgnoreCase(exp_res);
		System.out.println("Equalignore case comparision is --> "+flag1);
		
		
		/*
		 * Contains:-->
		 * 			Method verify sub String characters at main String and return
		 * 			boolean value true/false
		 * 			
		 */
		String Status="Account created 101 successfull";
		boolean flag2=Status.contains("created");
		boolean flag3=Status.contains("created successfull");   //Here we are breaking sequence
		System.out.println("sub String available status is --> "+flag2);
		System.out.println("sub String available status is --> "+flag3);
		
		
		/*
		 * length:-->
		 * 			Method return number of characters count in integer format
		 */
		 String Mobile_num="9030248855";
		 int len=Mobile_num.length();
		 System.out.println("Mobile number characters length is --> "+len);
		 
		 
		 
		/*
		 * SubString:-->
		 * 		method get sub string characters from main String
		 */
		 String Account_number="0005345433222434";
		 String last_digits=Account_number.substring(3);
		 System.out.println("Account number last digits are --> "+last_digits);
		 
		 String Middle_digits=Account_number.substring(3, 8);
		 System.out.println("Account number middle digits are --> "+Middle_digits);
		 
		 
		 
		 /*
		  * trim:-->
		  * 	Method trim extra spaces in string. It will only
		  * 	trim left and right space with in string.
		  */
		 String PinCode="     5000345      ";
		 System.out.println("before trim length is --> "+PinCode.length());
		 String New_pincode=PinCode.trim();
		 System.out.println("after trim length is --> "+New_pincode.length());
		 
		 
		 
		 /*
		  * Startswith:-->
		  * 	Method return boolean value true/false when given string
		  * 	start with expected characters
		  */
		 String IFSC_Code="HDFC12345";
		 boolean flag4=IFSC_Code.startsWith("HDFC");
		 System.out.println("Start with status is --> "+flag4);
		 
		 
		 /*
		  * Endswith:-->
		  * 	Method return boolean value true/false when given string
		  * 	ends with expected characters
		  */
		 boolean flag5=IFSC_Code.endsWith("2345");
		 System.out.println("ends with status is ---> "+flag5);
		 
		 
		 /*
		  * isempty:-->
		  * 	 method return true when give string has no characters and method
		  * 	 return false when given string have some characters
		  */
		 String name="";
		 String name1="MQ";
		 System.out.println("name variable empty status is ---> "+name.isEmpty());
		 System.out.println("name1 variable empty status is ---> "+name1.isEmpty());
		 
		 
		 /*
		  * concat:-->
		  * 	Method club two string
		  */
		 String str1="Hi";
		 String str2="Friends";
		 System.out.println(str1+str2);
		 System.out.println(str1.concat(str2));
		 
		 
		 /*
		  * Replace:-->
		  * 	methd replace existing characters with new character
		  */
		 String cname="MQ-SYS";
		 String new_cname=cname.replace("M", "B");
		 System.out.println(new_cname);
		 System.out.println("replacing sequcen of chars -->  "+cname.replace("MQ", "BQ"));
		 
		 
		 
		 /*
		  * CharAt:-->
		  * 		Method usefull to get any single characters with in string using
		  * 		index number. FInally it store into char datatype.
		  */
		 char ch=cname.charAt(1);
		 System.out.println("charcters at first index is --> "+ch);
		 
		 
		 
		 

	}

}
