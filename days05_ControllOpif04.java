package days05;

import java.util.Scanner;

public class ControllOpif04 
{
	public static void main(String args[])
	{
		int year;
		int na;
		Scanner sc = new Scanner(System.in);
		System.out.print("출생년도 입력 : ");
		year = sc.nextInt();
		na = 2021 - year + 1;
		// 12세 미만 어린이, 12~18세 청소년, 19~25세 청년
		// 26세 이상 성년입니다. 라고 출력하는 if문 작성
		
		if(na >= 1 && na < 12)
			System.out.printf("%d세, 어린이입니다.\n", na);
		else if(na >=12 && na <= 18)
			System.out.printf("%d세, 청소년입니다.\n", na);
		else if(na >=19 && na <= 25)
			System.out.printf("%d세, 청년입니다.\n", na);
		else if(na >= 26)
			System.out.printf("%d세, 성년입니다.\n", na);
		else
			System.out.printf("잘못입력하셨습니다.\n");
		
	}
}
