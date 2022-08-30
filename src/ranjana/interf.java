package ranjana;

public interface interf {
	int a=30;
	
	 void test();// non static meth cant write complete in interface
	
	 static void demo() {// we cant write imcomplete static method
		System.out.println("Hello"); //post java 8 we can write  complete static method
		System.out.println("a");
		// a=60; //variables are by default final so cant assign value
	}
		
		 static void main (String [] args) {
		//	interf obj = new interf();// no constructoe present in interface so cant creae obj
			
	}

}
