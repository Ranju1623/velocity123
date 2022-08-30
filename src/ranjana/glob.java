package ranjana;

public class glob { //global varibale can be accessed 
	//througout the class & outside the class
	int a= 10;     // non static
	static int b= 20; // static
	
	public void test () 
	{
		System.out.println (a);//non stat glob vari can be directly called inside non stat meth
	}
	public static void demo()
	{
		System.out.println(b);//stat glob vari can be accessed in static as well as non stat meth 
		//System.out.orintln(a);//non statglobvari cant ne directly called inside static meth need object
	}
	public static void main (String [] args)
	{
		glob obj =new glob();
		System.out.println(obj.a); //to call non stat vari in sttaic meth need to create obj
		System.out.println(b);
		
	}

}
