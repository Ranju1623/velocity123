package ranjana;

public class implemen implements interf { //implementation class
	public void test()// interf meth are by default public so we
	//can access here bt in class we hv to write public
	{
		System.out.println("non static meth of interface completed here");
	}
	public static void main(String[] args) {
		interf obj =new implemen();
		obj.test();
		System.out.println(a);
	}
	

}
