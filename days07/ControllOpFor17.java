package days07;

public class ControllOpFor17 
{
	public static void main(String args[])
	{
		// 1부터 100 사이의 소수(Prime Number)를 출력하세요.
		int count = 0;
		// 1부터 100까지의 숫자들을 1부터 자신까지의 숫자들 모두로 나눠보고
		// 딱 떨어지는 숫자가 2개인 숫자들만 모아서 출력한다.
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
				count = 0;
			}
		}
		/*
		 for(int i = 1; i <= 100; i++)
		{
			for(int j = 2; j < i; j++)
			{
				if(i % j == 0)
					count++;
			}
			if(count == 0)
			{
				System.out.printf("%d ", i);
				count = 0;
			}
			else
			{
				count = 0;
			}
		}
		*/
		/*
		 for(int i = 2; i <= 100; i++)
		{
			for(int j = 2; j < i/2; j++)
			{
				if(i % j == 0)
					count++;
			}
			if(count == 0)
			{
				System.out.printf("%d ", i);
				count = 0;
			}
			else
			{
				count = 0;
			}
		}
		*/
		//제곱근 사용해도 가능
	}
}
