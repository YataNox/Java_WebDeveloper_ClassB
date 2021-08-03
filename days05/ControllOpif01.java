package days05;

import java.util.Scanner;

public class ControllOpif01 
{
	public static void main(String args[])
	{
		//사용자로부터 정수 하나를 입력 받습니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		// int b = num % 2;
		// result = b == 0;
		// ()안의 값이 true면 {}안의 명령을 실행, false이면 실행하지 않는 명령
		// {}으로 영역을 구분하지 않으면 아래 한 줄만 실행
		if(num % 2 == 0) // 입력한 num이 짝수일 경우
			System.out.println("입력한 정수 " + num + "는 짝수입니다.");
		else // 입력한 num이 홀수일 경우
			System.out.println("입력한 정수 " + num + "는 홀수입니다.");
		/* 
		 //아래 표현으로도 같은 표현이 가능하다
		 if(result){}
		 if( (a%2) == 0){}
		 if(b == 0){}
		 if(result == true){}
		 */
	}
}
