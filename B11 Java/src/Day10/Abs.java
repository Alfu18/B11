package Day10;

abstract class N
	{
	   static int p;
	   final int i=15;
	   private int q;
	
	public int getQ()
	{
		return q;
	}
	public void setQ()
	{
		this.q=q;
	}	
	void n1()
    {
	  System.out.println("Live a peaceful Life");
    }
  abstract void n2();
}

class O extends N
{
    void n2()
    {
	   System.out.println("Laugh Out Loud");
    }
}

public class Abs 
  { 
	public static void main(String[]args)
	{
		O obj=new O();
		obj.n1();
		obj.n2();
		obj.setQ();
		System.out.println(obj.getQ());
		
	}
}













