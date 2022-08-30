package ranjana;

public class stringgg {
public static void main (String[] args) {
	
	String a= "Velocity"; //literal way
	String b= "velocity";
	
	char c= a.charAt(7);
	System.out.println(c);
	
	int l= a.length ();
	System.out.println(l);
	
	boolean result = a.contains("city");
	System.out.println(result);
	
	boolean r= a.equals(b);
	System.out.println(r);
	
	boolean i= a.equalsIgnoreCase(b);
	System.out.println(i);
	
	String u= a.toUpperCase();
	System.out.println(u);
	
	String lower= a.toLowerCase();
	System.out.println(lower);
	
	System.out.println(a);  //string is immutable
	
	String con= a.concat(" katraj");
	System.out.println(con);
	
	String sub= a.substring(4);
	System.out.println(sub);
	
	String s2= a.substring(0,4);
	System.out.println(sub);
	
}
}
