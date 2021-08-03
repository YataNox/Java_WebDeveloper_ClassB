package days08;

import java.util.Random;
import java.util.Scanner;

public class ControllOpWhile04 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		while(true)
		{
			int b;
			// Input
			System.out.print("가위(1), 바위(2), 보(3) : ");
			b = sc.nextInt();
			
			// 종료 조건
			if(b == 0)
			{
				System.out.println("프로그램 종료!");
				break;
			}
			
			// 컴퓨터 랜덤 1~3
			int n = rd.nextInt();
			if(n<0)
				n = n * (-1);
			n = n % 3 +1;
			
			/*int n2 = (int)(Math.random() * 3) + 1;
			System.out.println(n +" " + n2);*/
			
			// 나와 컴퓨터 가위바위보 출력
			if(b == 1)
				System.out.printf("나 : 가위\t");
			else if(b == 2)
				System.out.printf("나 : 바위\t");
			else if(b == 3)
				System.out.printf("나 : 보\t");
			else
			{
				System.out.println("잘못입력하셨습니다.");
				continue;
			}
			if(n == 1)
				System.out.printf("컴퓨터 : 가위\t");
			else if(n == 2)
				System.out.printf("컴퓨터 : 바위\t");
			else
				System.out.printf("컴퓨터 : 보\t");
			
			System.out.println();
			
			// 결과 출력
			if(b == n)
				System.out.println("비겼습니다.");
			else if(b == 1 && n == 3)
				System.out.println("이겼습니다.");
			else if(b == 2 && n == 1)
				System.out.println("이겼습니다.");
			else if(b == 3 && n == 2)
				System.out.println("이겼습니다.");
			else
				System.out.println("졌습니다.");
		}
	
		sc.close();
	}
}
