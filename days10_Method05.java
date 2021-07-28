package days10;

import java.util.Scanner;

public class Method05 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.print("출력할 단을 입력하세요 : ");
		//int k = sc.nextInt();
		//gugudan(k);
		
		for(int i = 2; i <= 9; i++)
		{
			gugudan(i);
			System.out.println();
		}
		sc.close();
	}
	
	public static void gugudan(int k)
	{
		for(int i = 1; i <= 9; i++)
			System.out.printf("%d x %d = %d\n", k, i, k*i);
	}
}
