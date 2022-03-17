package Day4;

class Veh{
	public int gear,speed;
	boolean clutch,brake,accelerator;
	public void start()
	{
	}
	
	public void stop()
	{
	}
	public void setgear(int i)
	{
		gear=i;
	}
	class X{
		int i;
			public void m1() {
				i=10;
		}
	}
		public void m2() {
			m1();
		}
	
	private void m1() {
			// TODO Auto-generated method stub
			
		}

	public int getgear()
	{
		return gear;
	}
}


public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Veh v1,v2;
			v1=new Veh();
			v2=new Veh();	
			v1.setgear(3);
			v2.setgear(5);
	     System.out.println(v1.getgear());
		}
	}
