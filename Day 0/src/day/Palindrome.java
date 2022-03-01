package day;

import java.util.Scanner;

public class Palindrome {
		public static void main(String[] args)	
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number:");
			String reverse="";
			String num=sc.nextLine();
			int length=num.length();
			for(int i=length-1;i>=0;i--)
				reverse=reverse+num.charAt(i);
			if(num.equals(reverse))
				System.out.println("Is a palindrome");
			else
				System.out.println("Is not a palindrome");
				
		}

}
