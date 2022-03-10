package Day2;

import java.util.Scanner;

class shape{//Superclass
	public double l,b;
	shape(){
	l=0;
	b=0;
}
public void getData(){
	System.out.println("Enter the two values");
	Scanner s=new Scanner(System.in);
	l=s.nextDouble();
	b=s.nextDouble();
	}

public void Dispaly_area() {
		}	
}

class Triangle extends shape{//Subclass,Inheritance 
	double area;
	public void getData(){
		System.out.println("Enter the two values");
		Scanner s=new Scanner(System.in);
		l=s.nextDousble();
		b=s.nextDouble();
	}
public void Dispaly_area() {
	area=(0.5*l*b);
	System.out.println("Area is" +area);	
	}	
}
class Rectangle extends shape{//Subclass and Inheritance.
	double area;
	public void getData(){
		System.out.println("Enter the two values");
		Scanner s=new Scanner(System.in);
		l=s.nextDouble();
		b=s.nextDouble();
	}
public void Dispaly_area() {
	area=(l*b);
	System.out.println("Area is" +area);	
	}
}

class Square extends shape{//Subclass
	double area;
	public void getData(){
		System.out.println("Enter the to values");
		Scanner s=new Scanner(System.in);
		l=s.nextDouble();
		b=s.nextDouble();
	}
public void Dispaly_area() {
	area=(l*b);
	System.out.println("Area is" +area);	
	}	
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		Scanner s=new Scanner(System.in);
		System.out.println("1.Area of Triangle\n 2.Area of Rectangle\n 3. Area of Square:");
		ch=s.nextInt();
		switch (ch) 
		{
			case 1: System.out.println ("Area of Triangle");
			Triangle t=new Triangle();
			t.getData();
			t.Dispaly_area();
			break;
			
			case 2: System.out.println ("Area of Rectangle");
			Rectangle r=new Rectangle();
			r.getData();
			r.Dispaly_area();
			break;
			case 3: System.out.println ("Area of Square");
			Square s1=new Square();
			s1.getData();
			s1.Dispaly_area();
			break;				
			default: System.out.println("wrong Choice:");
			break;
		}
	}

}