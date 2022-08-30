package ranjana;
import java.util.Scanner;
public class scann {
	public static void main(String []args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("please enter your name");
		
		String s= scan.nextLine();// will read string value from console
        System.out.println("welcome " + s);
        System.out.println("plaese insert card");
        System.out.println("Enter your pin");
        
        int pin= scan.nextInt();//will read int value from console 
   if(pin==1234)
      {
	   System.out.println("enter amount");
	    int amount= scan.nextInt(); 
	   System.out.println("please collect your cash");
	   }
   else
      {
	   System.out.println("Incorrect pin");
       }
	}

}
