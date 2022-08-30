package dempac;

public class BufferAndBuilder {
public static void main (String args[]) {  
	String r= "velocity"; //String is immutable coz o/p is velocity only
	r.concat("katraj");
	System.out.println(r);
	
	StringBuffer sb = new StringBuffer("hello");  // it is mutable coz o/p is hello everyone 
	sb.append(" everyone");
	System.out.println(sb);
	
	StringBuilder sf= new StringBuilder("hi");
	sf.append(" all");
	System.out.println(sf);
	System.out.println(sf.reverse());  // it print reverse val
}
}
