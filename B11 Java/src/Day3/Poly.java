package Day3;

class A {//Superclass
	public void m1()
	{
		System.out.println("Hello Everyone");
	}
}
class B extends A{//Subclass
	public void m2()
	{
		System.out.println("Good Morning");
	}
	public void m1()
	{
		System.out.println("Welcome");
	}
	public void m1(String s)
	{
		System.out.println(s);
	}
}
class D {
	public void m1()
	{
		System.out.println("Hello Everyone");
	}
}

public class Poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			A a,a1;
			B b;
			a=new A();//Instantiating the object.
			b=new B();//Instantiating the object.
			a1=a;
			a1=new A();
			a1.m1();//Good Morning.
			a1=b;
			a1.m1();//Welcome.
			
			D d=new D();//Hello Everyone.
			d.m1();
			
	}
}
