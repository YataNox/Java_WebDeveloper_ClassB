package days07;

public class ControllOpFor16 
{
	public static void main(String args[])
	{
		// 삼각형 1
		for(int i = 1; i <= 10; i++)
		{
			for(int j = 1; j <= i; j++)
					System.out.printf("#");
			System.out.println();
		}
		System.out.println();
		//-------------------------------------------------------------------------------
		// 역삼각형 1
		for(int i = 1; i <= 10; i++)
		{
			for(int j = 10; j >= i; j--)
					System.out.printf("#");
			System.out.println();
		}
		System.out.println();
		//-------------------------------------------------------------------------------
		// 역삼각형2
		for(int i = 10; i >= 1; i--)
		{
			for(int j = 10; j >= 1; j--) 
			{
				if(i >= j)
					System.out.printf("#");
				else
					System.out.printf(" ");
			}
			System.out.println();
		}
		
		/*
		 for(int i = 1; i <= 10; i++)
		{
			for(int j = 1; j <= 10; j++) 
			{
				if(j>=i)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.println();
		}
		 * */
	}
}
