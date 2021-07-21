package days05;

import java.util.Scanner;

public class ControllOpif09 
{
	public static void main(String args[])
	{
		// 2021년 1월 1일은 금요일입니다.
		// 2021년에 한해서 월과 일을 입력 받고
		// 요일을 출력하세요.
		Scanner sc = new Scanner(System.in);
		int month, day;
		int count = 0;
 
		//Input Data
		System.out.print("월을 입력하세요 : ");
		month = sc.nextInt();
		System.out.print("일을 입력하세요 : ");
		day = sc.nextInt();
		
		// 1월 31 2월 28 3월 31 4월 30 5월 31 6월 30 
		// 7월 31 8월 31 9월 30 10월 31 11월 30 12월 31
		// 월 계산 (이전 월들의 일 수 합산) 
		if(month == 1)
			count = 0;
		else if(month == 2)
			count += 31;
		else if (month == 3)
			count += 59;
		else if (month == 4)
			count += 90;
		else if (month == 5)
			count += 120;
		else if (month == 6)
			count += 151;
		else if (month == 7)
			count += 181;
		else if (month == 8)
			count += 212;
		else if (month == 9)
			count += 243;
		else if (month == 10)
			count += 273;
		else if (month == 11)
			count += 304;
		else if (month == 12)
			count += 344;
		else //월입력이 1~12 범위를 벗어났을 경우
			System.out.println("월 입력 오류");
		
		// 일 계산
		count += day;
		// 합산된 일을 일주일(7)로 나눠 나머지 값 계산
		count = count % 7;
		
		// 금요일을 1로 기준으로 하여 요일 계산
		if(count == 1)
			System.out.printf("%d월 %d일은 금요일", month, day);
		else if(count == 2)
			System.out.printf("%d월 %d일은 토요일", month, day);
		else if(count == 3)
			System.out.printf("%d월 %d일은 일요일", month, day);
		else if(count == 4)
			System.out.printf("%d월 %d일은 월요일", month, day);
		else if(count == 5)
			System.out.printf("%d월 %d일은 화요일", month, day);
		else if(count == 6)
			System.out.printf("%d월 %d일은 수요일", month, day);
		else if(count == 0)
			System.out.printf("%d월 %d일은 목요일", month, day);
		
		sc.close();
		
	}
}
