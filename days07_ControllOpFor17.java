package days07;

public class ControllOpFor17 
{
	public static void main(String args[])
	{
		// 1부터 100 사이의 소수(Prime Number)를 출력하세요.
		int count = 0;
		for(int i = 1; i <= 100; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				if(i % j == 0)
					count++;
			}
			if(count == 2)
			{
				System.out.printf("%d ", i);
				count = 0;
			}
			else
			{
				count = 
						0;
			}
		}
	}
}
