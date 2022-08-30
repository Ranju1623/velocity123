package ranjana;

public class declas {
	public static void main(String[] args){
		accspe obj=new accspe();
		obj.test();//public method
		System.out.println(obj.a);// public variable
		
		obj.demo();//default method
		System.out.println(obj.b);//default vari
		
		obj.sample();//protected method
		System.out.println(obj.c);//protected variable
		
		//obj.personal();//private method can't access in other class
		//so print stmt means peivate vari also we cant access here
		
	}

}
