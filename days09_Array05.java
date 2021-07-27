package days09;

import java.util.Scanner;

public class Array05 
{
	public static void main(String[] args)
	{
		// 정해지지 않은 과목수의 성적을 입력받아, 총점과 평균을 출력
		Scanner sc = new Scanner(System.in);
		int [] score = new int[100];
		
		int tot = 0;
		double avg = 0.0;
		int i = 0;
		// 반복 실행문을 이용하여 점수 입력(do while 이용)
		do 
		{
			System.out.printf("점수 입력(종료 : 0) : ");
			score[i] = sc.nextInt();
			++i;
		}while(score[i-1] != 0);
		
		i = 0;
		// 총점 평균 계산
		do
		{
			tot += score[i++];
		}while(score[i-1] != 0);
		
		// for(int j = 0; j < i-1; j--)
		//		tot = score[j];
		
		if(score[0] != 0)
			avg = tot / (double)(i-1);
		else
			avg = 0.0;
		
		// 출력
		if(score[0] == 0)
			System.out.printf("입력된 점수 없음.");
		else
			System.out.println("입력된 점수 : ");
		for(int k = 0; k < i-1; k++)
			System.out.printf("%d ", score[k]);
		System.out.printf("\n총점 : %d점, 평균 : %.2f점\n", tot, avg);
		sc.close();
	}
}
