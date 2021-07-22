package days06;

import java.util.Scanner;

public class ControllOpFor08 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int year, month, day;
		int count = 0;
		
		//Input Data
		System.out.print("연도를 입력하세요 : ");
		year = sc.nextInt();
		System.out.print("월을 입력하세요 : ");
		month = sc.nextInt();
		System.out.print("일을 입력하세요 : ");
		day = sc.nextInt();
		
		//연도 카운트
		count = (year - 1) * 365;
		for(int i = 1; i < year; i++)
		{
			if(i % 4 == 0 && i % 100 != 0 || i % 400 ==0)
				count++;
		}
		
		switch(month) 
		{
			case 12 : 
				count += 30;
			case 11 : 
				count += 31;
			case 10 : 
				count += 30;
			case 9 : 
				count += 31;
			case 8 : 
				count += 31;
			case 7 : 
				count += 30;
			case 6 : 
				count += 31;
			case 5 : 
				count += 30;
			case 4 : 
				count += 31;
			case 3 : 
				if(year % 4 == 0 && year % 100 != 0 || year % 400 ==0)
					count += 29;
				else
					count += 28;
			case 2 : 
				count += 31;
			case 1 : 
				count += day;
				count %= 7;  break;
		}
		
		// 금요일을 1로 기준으로 하여 요일 계산
		switch(count) 
		{
		 	case 1:
		 		System.out.printf("%d월 %d일은 월요일", month, day); break;
		 	case 2:
		 		System.out.printf("%d월 %d일은 화요일", month, day); break;
		 	case 3:
		 		System.out.printf("%d월 %d일은 수요일", month, day); break;
		 	case 4:
		 		System.out.printf("%d월 %d일은 목요일", month, day); break;
		 	case 5:
		 		System.out.printf("%d월 %d일은 금요일", month, day); break;
		 	case 6:
		 		System.out.printf("%d월 %d일은 토요일", month, day); break;
		 	case 0:
		 		System.out.printf("%d월 %d일은 일요일", month, day); break;
		}
		
		sc.close();
	}
}
