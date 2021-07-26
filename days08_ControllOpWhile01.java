package days08;

import java.util.Scanner;

public class ControllOpWhile01 
{
	public static void main(String args[])
	{
		// while 반복문
		// for 반복문은 정해진 횟수의 반복을 괄호 안에 미리 정의해놓고 반복하는
		// 특징이 있습니다.
		// while 문은 정해지지 않은 횟수의 반복을 처리하는데 주로 사용합니다.
		// 특정 조건이 만족할때까지 무한 수행합니다.
		// while(true) {} -> 이 반복문은 종료되지 않습니다. : 무한 반복
		
		// for 명령을 이용한 일반 반복실행 : 10번 반복
		int i;
		for(i = 1; i<=10; i++)
		{
			System.out.println("for");
		}
		
		i = 1;
		// 위 for문을 while 문으로 변경한 예
		while(i <= 10) {
			System.out.println("whlie"); 
			i++;
		}
		
		// 괄호안의 관계연산식의 참/거짓 유무를 먼저 판단한 후 반복을 계속할지 결정합니다.
		// while 문의 경우 위에서 코딩한 것 처럼 i++ 명령에 의해 반복 유지 유무가
		// 결정되는 것보단 특정 조건에 의해 순서와 상관없이 반복이 결정되는
		// 상황에 더 적절히 사용됩니다.
		int input = 0;
		Scanner sc = new Scanner(System.in);
		
		while (input != 3) 
		{
			System.out.printf("메뉴 선택 : 1(저장), 2(불러오기), 3(종료) : ");
			input = sc.nextInt();
			
			switch(input)
			{
				case 1:
				case 2:
			}
		}
		
		int k = 1;
		for(;;)
		{
			k++;
			if( k > 10) break;
 		} 
		sc.close();
	}
}
