package days05;

import java.util.Scanner;

public class ControllOpif06 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num1;
		double num2;
		System.out.print("기본급을 입력하세요 : ");
		num1 = sc.nextInt();
		
		// 기본급이 백만원 이상이라면 기본급의 50%를 보너스로 합산
		// 기본급이 백만원 미만이라면 기본급의 60%를 보너스로 합산
		// 총 지급액을 출력하세요
		if(num1 >= 1000000)
			num2 = num1 * 1.5;
		else
			num2 = num1 * 1.6;
		
		System.out.printf("총 지급액은 %.1f원 입니다.", num2);
		
	}
}
