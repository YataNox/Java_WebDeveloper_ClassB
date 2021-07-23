package days07;

import java.util.Scanner;

public class ControllOpFor09 
{
	public static void main(String args[])
	{
		// 정수 하나를 입력받아서 
		// 2부터 입력받은 정수까지 짝수의 합을 출력하세요 
		 Scanner sc = new Scanner(System.in);
		 int sum = 0;
		 System.out.print("정수를 입력하세요 : ");
		 int num1 = sc.nextInt();
		 
		 for(int i = 2; i <= num1; i++)
		 {
			 if(i % 2 == 0)
				 sum += i;
		 }
		 System.out.println("2부터 " + num1 + "까지의 짝수 합은 " + sum + "입니다.");
		 sc.close();
	}
}
