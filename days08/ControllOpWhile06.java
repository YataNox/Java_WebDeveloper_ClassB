package days08;

import java.util.Scanner;

public class ControllOpWhile06 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int m, y, days = 0, t, i = 1; // t : 7로 나눈 나머지 저장용, i : 반복 실행용
		
		System.out.printf("연도 입력 : ");
		y = sc.nextInt();
		System.out.printf("월 입력 : ");
		m = sc.nextInt();
		sc.close();
		
		days = 365 * (y-1);
		for(i = 1; i <= y-1; i++) 
			if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
				days++;
		
		switch(m) 
		{
			case 12 : 
				days += 30;
			case 11 : 
				days += 31;
			case 10 : 
				days += 30;
			case 9 : 
				days += 31;
			case 8 : 
				days += 31;
			case 7 : 
				days += 30;
			case 6 : 
				days += 31;
			case 5 : 
				days += 30;
			case 4 : 
				days += 31;
			case 3 : 
				if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
					days += 29;
				else
					days += 28;
			case 2 : 
				days += 31;
			case 1 : 
				days += 0;
		}
		
		t = (days + 1) % 7; // 입력한 년, 월의 1일자 요일을 알기위해 최종 1을 가산
		
		
		System.out.println();
		System.out.println(y + "년 " + m + "월");
		System.out.println("-------------------------------------------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("-------------------------------------------------");
		
		int space;
		for(space = 0; space < t; space++)
			System.out.printf("\t");
		
		int lastday = 0;
		switch(m) 
		{
			case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
				lastday = 31;  break;
			case 4 : case 6: case 9 : case 11 :
				lastday = 30; break;
			case 2 : 
				if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
				{
					lastday = 29; 
					break;
				}
				else 
				{
					lastday = 28; 
					break;
				}
		} 
		
		for(int day = 1; day <= lastday; day++)
		{
			System.out.printf("%d\t",day);
			if(++space % 7 == 0)
				System.out.println();
		}
	}
}
