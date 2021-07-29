package days11;

import java.util.Scanner;

public class Method08 
{
	public static void main(String[] args)
	{
		int year;
		boolean a;
		Scanner sc = new Scanner(System.in);
		System.out.print("연도 입력 : ");
		year = sc.nextInt();
		
		// 연도를 전달인수로 전달하여 윤녀이면 true, 평년이면 false를 리턴
		a = yoon(year);
		prn(a); // 변수 a값을 전달받아 윤년 또는 평년을 출력하는 메소드
		
		sc.close();
	}
	
	// 윤년 검사 함수
	public static boolean yoon(int year)
	{
		boolean check = false;
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			check = true;
		else 
			check = false;
		
		return  check;
	}
	
	// 출력함수
	public static void prn(boolean a)
	{
		if(a == true)
			System.out.print("입력한 연도는 윤년입니다.");
		else
			System.out.print("입력한 연도는 평년입니다.");
	}
}
