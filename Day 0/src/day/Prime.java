package day;

public class Prime {

	public static void main(String[] args) {

		int num=7;
		boolean flag=false;
		for(int i=2;i<=num/2;++i)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
			}
		if(!flag)
		System.out.println(num+ "Is a prime number");	
		else	
		System.out.println(num+ "Is not a prime number");	
	}
	}


