package days06;

import java.util.Scanner;

public class ControllOpSwitch03 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int month, day;
		int count = 0;
 
		//Input Data
		System.out.print("월을 입력하세요 : ");
		month = sc.nextInt();
		System.out.print("일을 입력하세요 : ");
		day = sc.nextInt();
		
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
		 		System.out.printf("%d월 %d일은 금요일", month, day); break;
		 	case 2:
		 		System.out.printf("%d월 %d일은 토요일", month, day); break;
		 	case 3:
		 		System.out.printf("%d월 %d일은 일요일", month, day); break;
		 	case 4:
		 		System.out.printf("%d월 %d일은 월요일", month, day); break;
		 	case 5:
		 		System.out.printf("%d월 %d일은 화요일", month, day); break;
		 	case 6:
		 		System.out.printf("%d월 %d일은 수요일", month, day); break;
		 	case 0:
		 		System.out.printf("%d월 %d일은 목요일", month, day); break;
		}
		
		sc.close();
	}
}
