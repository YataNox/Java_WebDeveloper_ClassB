package days06;

import java.util.Scanner;

public class ControllOpSwitch01
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.printf("정수를 입력하세요 : ");
		num = sc.nextInt();
		
		/*
		if(num == 1)
			System.out.println("1을 입력하셨습니다.");
		if(num == 2)
			System.out.println("2을 입력하셨습니다.");
		if(num == 3)
			System.out.println("3을 입력하셨습니다.");
		if(num == 4)
			System.out.println("4을 입력하셨습니다.");
		if(num == 5)
			System.out.println("5을 입력하셨습니다.");
		*/
		
		// switch 문은 if문과 비슷한 구조이지만, 변수 값의 단순 참조에 의해 실행될
		// 명령이 선택되는 것이 다릅니다.
		
		switch(num) // 괄호 안의 num변수 값을 참조하여, 아래 해당 값이 있는 case에
		{ // 있는 명령을 실행합니다.
			case 0: // num 변수 값이 0일 때 실행하는 명령이 쓰여지는 곳 
				System.out.println("0을 입력하셨습니다."); break;
			case 1: // num 변수 값이 1일 때 실행하는 명령이 쓰여지는 곳
				System.out.println("1을 입력하셨습니다."); break;
			case 2: // num 변수 값이 2일 때 실행하는 명령이 쓰여지는 곳
				System.out.println("2을 입력하셨습니다."); break;
			case 3: // num 변수 값이 3일 때 실행하는 명령이 쓰여지는 곳
				System.out.println("3을 입력하셨습니다."); break;
			case 4: // num 변수 값이 4일 때 실행하는 명령이 쓰여지는 곳
				System.out.println("4을 입력하셨습니다."); break;
			case 5: // num 변수 값이 5일 때 실행하는 명령이 쓰여지는 곳
				System.out.println("5을 입력하셨습니다."); break;
		} // 단점 : 해당 case만 실행하는 것이 아니라 아랫쪽 case를 모두 실행합니다.
		// 아래 case를 모두 실행하는 단점을 보완하기 위해 각 case에 break를 추가
		
		sc.close();
	}
}
