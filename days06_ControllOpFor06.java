package days06;

import java.util.Scanner;

public class ControllOpFor06 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int fact = 1;
		int i, k;
		System.out.printf("출력할 팩토리얼을 입력하세요 : ");
 		k = sc.nextInt();
		
		for(i = 1; i <= k; i++) 
		{
			fact *= i;
			if(i < k)
				System.out.printf("%dx", i);
			else
				System.out.printf("%d = %d\n", k, fact);
		}
		
		sc.close();
	}
}
