package ranjana;

public class rigttriangle {
	public static void main(String args[])
	{
	//int n= 5;
	for(int i=1;i<=5;i++)
	{
		//for(int j=i;j<=n;j++) 
		for(int j=1;j<=5-i;j++)
		{
			System.out.print ("  ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	
	
}
}
