package days05;

import java.util.Scanner;

public class ControllOpif03 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0)
			System.out.printf("입력한 정수 %d는 양수입니다.\n", num);
		else if(num == 0)
			System.out.printf("입력한 정수 %d는 0입니다.\n", num);
		else
			System.out.printf("입력한 정수 %d는 음수입니다.\n", num);
		
		// 위에서 ()안의 연산식으로 계산한 겨로가가 true인 경우 {} 안의 명령이
		// 실행됩니다. 다만, 그 명령이 단 한개만 존재한다면 {}는 생략할 수 있습니다.
		// 중괄호 생략 후 if 구문과 실행 명령을 한 줄에 써도 무관합니다.
		if(num > 0)System.out.printf("입력한 정수 %d는 양수입니다.\n", num);
		else if(num == 0)System.out.printf("입력한 정수 %d는 0입니다.\n", num);
		else System.out.printf("입력한 정수 %d는 음수입니다.\n", num);
		
		
	}	
}
