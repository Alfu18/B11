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

public class C {
	public static void main(String[] args) {
		
		A a,a1;
		B b;
		a=new A();//Instantiating the object
		b=new B();
		a1=a;
		a1=new A();
		a1.m1();//Hello World
		a1=b;
		a1.m1();//Welcome	
	}	
}
