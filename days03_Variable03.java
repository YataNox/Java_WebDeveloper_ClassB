package days03;

import java.util.Scanner;

public class Variable03
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		//밑변과 높이 값 입력
		System.out.printf("밑변의 길이를 입력하세요 : ");
		int base = sc.nextInt(); // 변수의 생성과 초기화 
		System.out.printf("높이를 입력하세요 : ");
		int height = sc.nextInt();
		
		double area = (base * height) / 2; // 삼각형 넓이 공식 => 밑변 * 높이 / 2
		
		System.out.println("입력한 삼각형의 넓이는 " + area + "입니다.");
		sc.close();
	}
}
