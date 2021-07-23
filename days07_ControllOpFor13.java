package days07;

import java.util.Scanner;

public class ControllOpFor13 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num1, num2, start = 0, k = 0;
		
		System.err.printf("첫 번째 정수 입력 : ");
		num1 = sc.nextInt();
		System.err.printf("두 번째 정수 입력 : ");
		num2 = sc.nextInt();
		
		// 1부터 10까지 각 두 개의 숫자에 곱해서 결과
		
		if(num1 > num2) 
			start = num1;
		else 
			start = num2;
		
		for(int i = start; i <= num1*num2; i++)
			if(i % num1 == 0 && i%num2 == 0) 
			{
				System.out.printf("%d ", i);
				if(k == 0)
					k = i;
			}
		System.out.println("\n최소 공배수는 : " + k);
		sc.close();
	}
}
