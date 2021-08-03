package days09;

import java.util.Scanner;

public class Array09 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int m, y, days = 0, t, i = 1; // t : 7로 나눈 나머지 저장용, i : 반복 실행용
		
		System.out.printf("연도 입력 : ");
		y = sc.nextInt();
		System.out.printf("월 입력 : ");
		m = sc.nextInt();
		
		int [] mday = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		while(true)
		{
			days = 365 * (y-1);
			for(i = 1; i <= y-1; i++) 
				if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
					days++;
			
			for(int i2 = 1; i2 < m; i2++)
				days += mday[i2];
			
			if((y % 4 == 0 && y % 100 !=0 || y % 400 == 0) && m == 2)
				days++;
			
			t = (days + 1) % 7; // 입력한 년, 월의 1일자 요일을 알기위해 최종 1을 가산
			
			System.out.println();
			System.out.println(y + "년 " + m + "월");
			System.out.println("-------------------------------------------------");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			System.out.println("-------------------------------------------------");
			
			int space;
			for(space = 0; space < t; space++)
				System.out.printf("\t");
			
			for(int day = 1; day <= mday[m]; day++)
			{
				System.out.printf("%d\t",day);
				if(++space % 7 == 0)
					System.out.println();
			}
			
			int next = 0;
				System.out.print("\n 1 : 이전 달, 2 : 다음 달, 3 : 종료 : ");
				next = sc.nextInt();
				if(next == 3)
					break;
				if(next == 1)
				{
					m--;
					if(m == 0)
					{
						m = 12;
						y--;
					}	
				}
				else if(next == 2)
				{
					m++;
					if(m == 13)
					{
						m = 1;
						y++;
					}
				} 
		}
			// 프로그램이 종료되지 않고 이전, 다음 달로 이어갈 수 있게 while문을 구성해주세요
			// 이전, 다음 달에 해당하는 년도와 월을 계산해주세요
			// next변수의 값이 3이면 while문을 종료해주세요
		sc.close();
	}
}
