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
		
		for(i = k; i > 0; i--) 
		{
			fact *= i;
		}
		System.out.printf("%d! = %d\n", k, fact);
		
		sc.close();
	}
}
