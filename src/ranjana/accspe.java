package ranjana;

public class accspe {//public classobjet can be created throughout the project
   
	public int a =10;//puvlic vari can acce throughout project
	int b=20;//default can access within package only
	protected int c=40; //pro access within package but we can access outside pack bt need inheritance
    private int d=60;// can access within class only
    
    public void test() {
    	System.out.println("public method");
    }
    void demo() {//default access within pack
	    System.out.println("default A. S");
    }
    protected void sample() {//method
    	System.out.println("protected meth");
    }
    private void personal() {//within class only can access
    	System.out.println("i am private");
    }
   
    
    public static void main (String[] args) {
    	accspe obj =new accspe();
    	obj.personal();// private method
    	System.out.println(obj.d);// private variable
    }
}
