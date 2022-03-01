package day;

import java.util.Scanner;

public class Multiple {
	public static void main(String[] args)
	{
		int number,mul;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter any Number");
		number=input.nextInt();
		input.close();
		
		for(mul =1;mul<=10; mul++)
		{
			System.out.printf("%d*%d=%d",number,mul,(number*mul));
			
			
		}
	}

	
	
	

}
