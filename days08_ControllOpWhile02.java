package days08;

import java.util.Scanner;

public class ControllOpWhile02 
{
	public static void main(String args[])
	{
		// 1부터 100 사이의 짝수의 출력 : while문을 이용해주세요
		int i = 2;
		while(i <= 100)
		{
				System.out.print(i + " ");
				i+=2;
		}
		
		System.out.println();
		// 6을 입력하면 6! = 6x5x4x3x2x1 = 720 while문을 사용해주세요
		Scanner sc = new Scanner(System.in);
		int n , fact = 1;
		System.out.print("\n팩토리얼 계산할 정수 입력 : ");
		n = sc.nextInt();
		
		System.out.printf("%d! = ", n);
		while(n > 1)
		{
			System.out.printf("%dx", n);
			fact *= n--;
		}
		System.out.printf("1 = %d\n", fact);
		sc.close();
	}
}
