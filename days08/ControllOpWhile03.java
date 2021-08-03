package days08;

import java.util.Scanner;

public class ControllOpWhile03 
{
	public static void main(String args[])
	{
		// 사용자에게서 단을 입력 받아 구구단을 출력
		// 사용자가 0을 입력할 때까지 출력할 단을 입력받고 연이어 출력
		int i, g;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.printf("출력할 구구단의 단 입력 : ");
			g = sc.nextInt();
			
			if(g == 0) 
			{
				System.out.println("프로그램 종료!");
				break;
			}
			
			for(i = 1; i < 10; i++)
			{
				System.out.printf("%dx%d = %d\n", g, i, g*i);
			}
		}
		sc.close();
	}
}
