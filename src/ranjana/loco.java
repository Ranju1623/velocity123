package ranjana;

public class loco {//local vari are always non static
	
	public void test ()
	{
		int a= 30; //local variable
		System.out.println (a);
	}
	public static void demo ()
	{
		int b= 10;
		int c=20;
		System.out.println(b);
		System.out.println(c);
	}
	public static void main ( String[] args) 
	{
		loco obj =new loco();
		//System.out.println (obj.a); //loca vari can't be accessed outside the method
        obj.test(); //to call non stat meth need to create obj
        loco.demo(); //to call static meth need to use classname
        
	}
}
