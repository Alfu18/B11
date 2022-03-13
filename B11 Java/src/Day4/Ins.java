package Day4;

import Day4.Car;

class Car{
	private int gear,speed;
	boolean clutch,brake,accelerator;
	public char[] getspeed;
	public void start()
	{
	}
	
	public void stop()
	{
	}
	
	public void setspeed(int i)
	{
		speed=i;
	}
	
	public int getspeed()
	{
		return speed;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}
}

public class Ins {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1,c2;
		c1=new Car();
		c2=new Car();
		c1.setspeed(70);
		c2.setspeed(100);
     System.out.println(c2.getspeed);
	}

}


