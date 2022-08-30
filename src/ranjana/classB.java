package ranjana;

public class classB extends  classA {

	public void method4 () {
		System.out.println("method 4");
	}
	public void method1()
	{
		System.out.println("i am from classA overriding");
	}
	public static void test()
	{
		System.out.println("from classA static overriding");
	}
	public static void main(String args[])
	{
		classB obj1 =new classB();
		classA.test(); // static method of classA
		classB.test();
		obj1.method1();
		// classA.method1();  // using classA name cant call non static method
		// super keyword cant use in main method
		
	}
}
