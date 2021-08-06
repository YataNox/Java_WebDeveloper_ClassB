package days17;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar05 
{
	public static void main(String[] args)
	{
		int year, month;
		int input = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("연도 입력 : ");
		year = sc.nextInt();
		System.out.print("월 입력 : ");
		month = sc.nextInt();
		
		Calendar sDay = Calendar.getInstance(); // 출력할 달력의 시작 날짜(1일)
		Calendar eDay = Calendar.getInstance(); // 출력할 달력의 끝 날짜(말일)
		
		sDay.set(year, month - 1, 1);
		eDay.set(year, month, 1);
		eDay.add(Calendar.DATE, -1);
		
		int START_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		System.out.println("\n" + year + "년 " + month + "월 ");
		System.out.println("--------------------------------------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("--------------------------------------------");
		
		// 1일자의 요일까지 빈칸
		for(int i = 1; i < START_WEEK; i++)
			System.out.print("\t");
		
		// 뒤를 이어서 1일자부터 말일까지 날짜 출력
		for(int i = 1; i < eDay.get(Calendar.DATE); i++)
		{
			System.out.printf("%2d\t", i);
			if(START_WEEK % 7 == 0)
				System.out.println();
			START_WEEK++;
		}
		System.out.println("\n--------------------------------------------");
	}
}
