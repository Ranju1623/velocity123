package ranjana;

public class primnum {
	public static void main (String [] args)
	{
		for(int j=2;j<=100;j++)
		{
		
		int k= 0;
		
		for (int i=2;i<=j-1;i++)
		{
			if(j%i==0)
			{
				k++;
			}
		}
		if(k==0) {
			System.out.println(j);
		}
		//else
	//	{
		//	System.out.println(j+"is not prime no");
		//}
	}

}
}