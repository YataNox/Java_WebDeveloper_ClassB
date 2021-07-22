package days06;

import java.util.Scanner;

public class ControllOpFor04
{
	public static void main(String args[])
	{
		int k, i;
		k = 5;
		i = 2;
		System.out.printf("%dx%d=%d\n",k,i,k*i);
		
		Scanner sc = new Scanner(System.in);
		int dan;
		System.out.printf("출력할 단을 입력하세요 : ");
		dan = sc.nextInt();
		
		for(int num = 1; num<10; num++)
			System.out.printf("%d x %d = %d\n", dan, num, dan*num);
	}
}
