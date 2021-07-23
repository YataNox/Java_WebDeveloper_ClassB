package days07;

import java.util.Scanner;

public class ControllOpFor10 
{
	public static void main(String args[])
	{
		// 정수 10개를 입력 받아서 그 합계를 출력하세요
		Scanner sc = new Scanner(System.in);
		
		int num, sum = 0;
		
		for(int i = 0; i < 10; i++)
		{
			System.out.print("정수를 입력하세요 : ");
			num = sc.nextInt();
			sum += num;
		}
		
		System.out.println("입력한 정수들의 합 : " + sum);
		sc.close();
	}
}
