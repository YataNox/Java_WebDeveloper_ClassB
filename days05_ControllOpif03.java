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
			System.out.printf("입력한 정수 %d는 양수입니다.", num);
		else if(num == 0)
			System.out.printf("입력한 정수 %d는 0입니다.", num);
		else
			System.out.printf("입력한 정수 %d는 음수입니다.", num);
	}	
}
