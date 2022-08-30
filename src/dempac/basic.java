package dempac;
import ranjana.accspe;
public class basic extends accspe {
	public static void main(String[] args)
	{
		accspe obj=new accspe();
		obj.test();
		System.out.println(obj.a);
	
		//obj.demo();
		//obj.sample();  without inheritance can't access protected
		//System.out.println(obj.c);
	}

}
