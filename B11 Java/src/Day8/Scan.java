package Day8;

import java.util.Scanner;
public class Scan {
	
		    public static void main(String args[])
		    {
		        Scanner sc = new Scanner(System.in);
		 
		        System.out.println("Enter an integer");
		 
		        // Using nextInt() to parse integer values
		        int a = sc.nextInt();
		 
		        System.out.println("Enter a String");
		 
		        // Using nextInt() to parse integer values
		        String b = sc.nextLine();
		 
		        // Display name and age entered above
		        System.out.printf("You have entered:- " + a + " "
		                          + "and name as " + b);
		    }
	}


