package days07;

import java.util.Scanner;

public class ControllOpFor14 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		// 이중 반복문
		for(int i = 1; i <= 10; i++) 
		{
			for(int j = 1; j <= 10; j++) 
			{
				// System.out.printf("#");
				System.out.printf("(%d, %d) ", i, j);
			}
			System.out.println();
		}
		
		sc.close();
	}
}
