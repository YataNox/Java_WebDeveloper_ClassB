package days05;

import java.util.Scanner;

public class ControllOpif07 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String level;
		int pay;
		double total = 0;
		System.out.printf("직급 입력(과장/대리/사원) : ");
		level = sc.nextLine();
		System.out.printf("판매실적금액 입력 : ");
		pay = sc.nextInt();
		// 판매 실적 금액에 과장 50%, 대리 25%, 사원 15%의 활동비를 합산하여
		// 출력해주세요.
		
		if(level.equals("과장"))
			 total = pay * 1.5;
		else if(level.equals("대리"))
			total = pay * 1.25;
		else if(level.equals("사원"))
			total = pay * 1.15;
		
		System.out.println("총 지급액 : " + total + "원");
	}
}

