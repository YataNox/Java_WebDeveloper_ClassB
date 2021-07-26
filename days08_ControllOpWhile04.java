package days08;

import java.util.Random;
import java.util.Scanner;

public class ControllOpWhile04 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int b;
		System.out.print("가위(1), 바위(2), 보(3) : ");
		b = sc.nextInt();
		
		int n = rd.nextInt();
		if(n<0)
			n = n * (-1);
		n = n % 3 +1;
		
		/*int n2 = (int)(Math.random() * 3) + 1;
		System.out.println(n +" " + n2);*/
		
		if(b == 1)
			System.out.printf("나 : 가위\t");
		else if(b == 2)
			System.out.printf("나 : 바위\t");
		else
			System.out.printf("나 : 보\t");
		if(n == 1)
			System.out.printf("컴퓨터 : 가위\t");
		else if(n == 2)
			System.out.printf("컴퓨터 : 바위\t");
		else
			System.out.printf("컴퓨터 : 보\t");
		
		System.out.println();
		
		if(b == 1 && n == 1)
			System.out.println("비겼습니다.");
		else if(b == 1 && n == 2)
			System.out.println("졌습니다.");
		else if(b == 1 && n == 3)
			System.out.println("이겼습니다.");
		else if(b == 2 && n == 1)
			System.out.println("이겼습니다.");
		else if(b == 2 && n == 2)
			System.out.println("비겼습니다.");
		else if(b == 2 && n == 3)
			System.out.println("졌습니다.");
		else if(b == 3 && n == 1)
			System.out.println("졌습니다.");
		else if(b == 3 && n == 2)
			System.out.println("이겼습니다.");
		else if(b == 3 && n == 3)
			System.out.println("비겼습니다.");
		
		sc.close();
	}
}
