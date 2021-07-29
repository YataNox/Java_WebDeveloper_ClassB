package days11;

import java.util.Scanner;

public class Method09 
{
	public static void main(String[] args)
	{
		// 밑변과 높이를 입력받아서 삼각형의 넓이를 계산하여 출력(메소드 사용)
		int a, b;
		double c;
		a = myInput(1); // 밑변을 입력 받음
		b = myInput(2); // 높이을 입력 받음
		c = calculate(a, b); // 넓이를 계산

		prn(c); // 넓이 출력
	}
	
	// 데이터 입력 함수
	public static int myInput(int num)
	{
		Scanner sc = new Scanner(System.in);
		
		if(num == 1)
		{
			System.out.print("밑변을 입력하세요 : ");
			int base = sc.nextInt();
			return base;
		}
		else if(num == 2)
		{
			System.out.print("높이를 입력하세요 : ");
			int height = sc.nextInt();
			return height;
		}
		
		return 0;
	}
	
	// 넓이 계산 함수
	public static double calculate(int base, int height)
	{
		return (base * height) / 2.0;
	}
	
	// 출력함수
	public static void prn(double c)
	{
		System.out.printf("삼각형의 넓이는 %.2f입니다.", c);
	}
}
