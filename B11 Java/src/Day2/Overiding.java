package Day2;

import java.util.Scanner;

class Shape{//Superclass
	public double r,h;
	Shape(){
	r=0;
	h=0;
}
public void getData(){
	System.out.println("Enter the two values");
	Scanner s=new Scanner(System.in);
	r=s.nextDouble();
	h=s.nextDouble();
	}

public void Dispaly_area() {
		}	
}

class Sphere extends Shape{//Subclass,Overriding 
	double area;
	public void getData(){
		System.out.println("Enter the two values");
		Scanner s=new Scanner(System.in);
		r=s.nextDouble();
		r=s.nextDouble();
	}
public void Dispaly_area() {
	area=(4*3.14*r*r);
	System.out.println("Area is" +area);	
	}	
}
class Cone extends Shape{//Subclass,Overriding.
	double area;
	public void getData(){
		System.out.println("Enter the two values");
		Scanner s=new Scanner(System.in);
		r=s.nextDouble();
		h=s.nextDouble();
	}
public void Dispaly_area() {
	area=(3.14*r*r*h/3);
	System.out.println("Area is" +area);	
	}
}

class Cylinder extends Shape{//Subclass, Overriding.
	double area;
	public void getData(){
		System.out.println("Enter the two values");
		Scanner s=new Scanner(System.in);
		r=s.nextDouble();
		h=s.nextDouble();
	}
public void Dispaly_area() {
	area=(2*3.14*r*(h+r));
	System.out.println("Area is" +area);	
	}	
}

public class Overiding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		Scanner s=new Scanner(System.in);
		System.out.println("1.Area of Sphere\n 2.Area of Cone\n 3. Area of Cylinder:");
		ch=s.nextInt();
		switch (ch) 
		{
			case 1: System.out.println ("Area of Sphere");
			Sphere s1=new Sphere();
			s1.getData();
			s1.Dispaly_area();
			break;
			
			case 2: System.out.println ("Area of Cone");
			Cone c=new Cone();
			c.getData();
			c.Dispaly_area();
			break;
			
			case 3: System.out.println ("Area of Cylinder");
			Square c1=new Square();
			c1.getData();
			c1.Dispaly_area();
			break;				
			default: System.out.println("wrong Choice:");
			break;
		}
	}
}
