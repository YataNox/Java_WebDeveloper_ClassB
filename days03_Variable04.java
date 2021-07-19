package days03;

import java.util.Scanner;

public class Variable04 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		//원의 반지름 값 입력
		System.out.printf("반지름을 입력하세요 : ");
		int radius = sc.nextInt();
		
		double circleArea = radius * radius * 3.14; // 원의 넓이 pi * r *r
		double circleRound = 2 * radius * 3.14; // 2r * pi
		
		System.out.println("입력한 원의 넓이 : " + circleArea);
		System.out.println("입력한 원의 둘레 : " + circleRound);
		sc.close();
	}
}
