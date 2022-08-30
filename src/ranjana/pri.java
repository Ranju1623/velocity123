package ranjana;

public class pri {
	public static void main (String[] arg){

		

		for(int i=2; i<=100; i++)
		{
			int k=0;
		for (int j=2; j<=i-1; j++)
		{
		 if (i%j==0)
		  {
		k++;
		  }
		}
		if(k==0)
		{
		System.out.println(i);
		}
		}
		
		}
	}


