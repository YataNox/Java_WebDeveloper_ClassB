package days11;

import java.util.Scanner;

public class Method07 
{
	public static void main(String[] args)
	{
		// 원의 둘레와 넓이를 구하는 함수를 작성할 것
		int ban;
		double n, d;
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요 : ");
		ban = sc.nextInt();
		
		n = calculate1(ban);
		d = calculate2(ban);
		
		prn(n, d);
	}
	
	// 원의 넓이 함수
	public static double calculate1(int ban)
	{
		// π*r*r
		double result = (ban * ban) * (3.141592);
		return result;
	}
	
	// 원의 둘레 함수
	public static double calculate2(int ban)
	{
		// 2πr
		double result = (2 * (3.141592)) * ban;
		return result;
	}
	
	// 원의 넓이, 둘레 출력 함수
	public static void prn(double n, double d)
	{
		System.out.printf("원의 넓이 : %.2f, 원의 둘레 %.2f", n, d);
	}
}
