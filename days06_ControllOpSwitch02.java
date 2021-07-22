package days06;

import java.util.Scanner;

public class ControllOpSwitch02
{
	public static void main(String[] args) 
	{
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
		
		switch(month) 
		{
			case 1 : 
				count = 0; break;
			case 2 : 
				count += 31; break;
			case 3 : 
				count += 59; break;
			case 4 : 
				count += 90; break;
			case 5 : 
				count += 120; break;
			case 6 : 
				count += 151; break;
			case 7 :
				count += 181; break;
			case 8 :
				count += 212; break;
			case 9 :
				count += 243; break;
			case 10 :
				count += 273; break;
			case 11 :
				count += 304; break;
			case 12 :
				count += 344; break;
		} 
		
		// 일 계산
		// 합산된 일을 일주일(7)로 나눠 나머지 값 계산
		count = (count + day) % 7;
		
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
