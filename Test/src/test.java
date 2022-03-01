
public class test {
	public static void main(String[] args)
		{
			int n=3;
			boolean prime=true;
			for(int i=1;i<n;i++)
			{
				if(n%i==0)
				{
					prime=true;
					break;
				}
				}
			System.out.println(prime);		}
		}
		
		
