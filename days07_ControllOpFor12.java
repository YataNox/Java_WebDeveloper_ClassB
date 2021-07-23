package days07;

import java.util.Scanner;

public class ControllOpFor12 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		int small;
		
		System.err.printf("첫 번째 정수 입력 : ");
		num1 = sc.nextInt();
		System.err.printf("두 번째 정수 입력 : ");
		num2 = sc.nextInt();
		
		// 입력 받은 두 개의 공약수들을 출력하세요
		// 12 36을 입력한 경우 1 2 3 4 6 12
		
		// 작은 값 확인
		if(num1 > num2)
			small = num2;
		else
			small = num1;
		
		// 공약수 출력 
		for(int i = 1; i <= small; i++)
		{
			if(num1 % i == 0 && num2 % i == 0)
				System.out.printf("%d ", i);
			else
				continue;
		}
		
		sc.close();
	}
}
