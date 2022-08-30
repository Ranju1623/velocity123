package ranjana;

public class classA {

	public void method1()
	{
		System.out.println("method 1");
	}
	public void method2()
	{
		System.out.println("method 2");
	}
	public void method3()
	{
		System.out.println("method 3");
	}
	public static void test ()
	{
		System.out.println("i am a static method of class A");
	}
	public static void main (String [] args) {
		classA obj = new classA ();
		obj.method1();
	}
}
