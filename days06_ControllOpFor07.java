package days06;

import java.util.Scanner;

public class ControllOpFor07 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int fact = 1;
		int i, k;
		
		// Input
		System.out.printf("출력할 팩토리얼을 입력하세요 : ");
 		k = sc.nextInt();
		
 		//output
 		// k! = 1x~k = fact
 		System.out.printf("%d! = ", k);
		for(i = k; i > 0; i--) 
		{
			fact *= i;
			if(i > 1)
				System.out.printf("%dx", i);
			else
				System.out.printf("%d = %d\n", i, fact);
		}
		
		sc.close();
	}
}
