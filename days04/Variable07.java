package days04;

import java.util.Scanner;

public class Variable07
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int numberOfApple, boxLength; // 사과의 수, 박스의 크기
		int numberOfBox, overApple; // 박스의 수, 남은 사과 수
		
		//사과의 수와 박스 크기 값 입력
		System.out.print("포장할 사과의 갯수를 입력하세요 : ");
		numberOfApple = sc.nextInt();
		System.out.print("하나의 상자에 포장되는 사과의 갯수를 입력하세요 : ");
		boxLength = sc.nextInt();
		
		// 포장한 사과박스 갯수와 남은 사과 개수 연산
		numberOfBox = numberOfApple / boxLength;
		overApple = numberOfApple % boxLength;
		
		//출력
		System.out.println("포장된 사과박스의 갯수 : " + numberOfBox);
		System.out.println("포장하고 남은 사과의 갯수 : " + overApple);
		
		sc.close();
	}
}
