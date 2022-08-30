package ranjana;

public class primee {
	public static void main(String[] args) {
		
		for(int i=5;i<=100;i++)
		{
			boolean value =true;
			for (int j= 2; j<i;j++)
			{
				if(i%j==0)
				{
			  value = false;
				}
			}
		if (value== true) {
			System.out.println(i);
		}
		}
	}

}
