package days05;

import java.util.Scanner;

public class ControllOpif05 
{
	public static void main(String args[])
	{
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		num = sc.nextInt();
		// 90이상 A학점 80~89 B학점 70~79 C학점
		// 60~69 D학점 60 미만 F학점
		
		if(num >= 90)
			System.out.println("A학점");
		else if(num >= 80 && num <=89)
			System.out.println("B학점");
		else if(num >= 70 && num <=79)
			System.out.println("C학점");
		else if(num >= 60 && num <=69)
			System.out.println("D학점");
		else if(num < 60)
			System.out.println("F학점");
	}
}
