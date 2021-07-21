package days05;

import java.util.Scanner;

public class ControllOpif02 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
					
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) // 입력한 num이 짝수일 경우
			System.out.println("입력한 정수 " + num + "는 짝수입니다.");
		else // 입력한 num이 홀수일 경우
			System.out.println("입력한 정수 " + num + "는 홀수입니다.");
		
		int kor = 87, eng = 78, mat = 9;
		double avg = (kor + eng + mat) / 3.0;
		// 평균이 80이상이면 합격이라고 출력
		System.out.print("단일 if문 출력 : ");
		if(avg >= 80.0)
			System.out.println("합격");
		
		// 평균이 80이상이면서 영어점수가 75점 이상이면 합격, 아니면 불합격을 출력
		System.out.print("\nif~else문 출력 : ");
		if(avg >= 80.0 && eng >= 75)
			System.out.println("합격");
		else 
			System.out.println("불합격");
	}
}
