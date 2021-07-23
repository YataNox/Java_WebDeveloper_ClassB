package days07;

public class ControllOpFor15 
{
	public static void main(String args[])
	{
		//구구단 출력
		
		for(int i = 1; i <= 10; i++)
		{
			for(int j = 1; j <= 10; j++)
			{
				System.out.printf("%2d x %2d = %2d\t", j, i, j*i);
			}
			System.out.println();
		}
	}
}
