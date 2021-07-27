package days09;

import java.util.Scanner;

public class Array06 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇과목을 계산하시겠습니까? ");
		int k = sc.nextInt();
		int [] score = new int[k];
		int tot = 0;
		double avg;
		for(int i = 0; i < score.length; i++)
		{
			System.out.printf("점수 입력 : ");
			score[i] = sc.nextInt();
		}
		for(int i = 0; i < score.length; i++)
			tot += score[i];
		avg = tot / (double)k;
		
		System.out.println("입력된 점수 : ");
		for(int i = 0; i < score.length; i++)
			System.out.printf("%d ", score[i]);
		System.out.printf("\n총점 : %d점, 평균 : %.2f점\n", tot, avg);
		sc.close();
		// 배열의 크기 : 배열 크기는 프로그램에서 중요한 정보입니다.
		// 배열의 크기에 따라 반복의 횟수나, 특정 인덱스 값을 참조하는 것이 수시로
		// 바뀌기 때문입니다.
		// 배열은 이러한 문제를 해결하기 위해 length라는 속성을 제공합니다.
		// 배열의 이름.length -> 배열의 크기, 정수 타입의 데이터를 얻습니다.
	}
}
