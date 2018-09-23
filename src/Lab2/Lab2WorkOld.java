package Lab2;

import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Lab2WorkOld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
				Scanner scnr = new Scanner(System.in);
			      
			      
			      //This will prompt user for date1 input 
			      System.out.println("Using the format YYYY/MM/DD, please enter today's date, and on a new line, enter your birthdate: ");
			      
		          // string for dates
		          String firstEntry = scnr.nextLine();
		          String secondEntry = scnr.nextLine();
		          Date date1 = getDate(firstEntry);
		          Date date2 = getDate(secondEntry);
			   
			      
		          // Calculates days between the dates
		          long numberOfDays = daysBetween(date1, date2);

			     
		          // output
		          System.out.printf("The number of days between %s and %s is: %d %n", firstEntry, secondEntry, numberOfDays);
			      
			      
			      
			      scnr.close();  		  
		  
		

			

		 
		  
		  
			}

	private static long daysBetween(Date date1, Date date2) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static Date getDate(String firstEntry) {
		// TODO Auto-generated method stub
		return null;
	}

	}

