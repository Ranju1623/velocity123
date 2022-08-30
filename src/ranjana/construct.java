package ranjana;

public class construct {
int b=20;
//constructor overloading means declaring multiple constructor with diff argument

construct()
{
	System.out.println("zero argument construct");
}
construct(int a)
{
	System.out.println(a);
}
construct(int a,int b, String c, double d)
{
System.out.println("construct with multi argu");
}
construct(String a)
{
}
construct(String b, int a)
{
}
public static void test() 
{
	System.out.println("hello all");
}

public static void main(String[] args) 
{
	construct obj=new construct();
	construct.test();
	System.out.println(obj.b);
	obj.test();
	
	construct obj1=new construct (8, 5, "velocity", 33.5);
}
}