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
		for(int i = 0; i < k; i++) // for(int i = 0; i < score.length; i++)
		{
			System.out.printf("점수 입력 : ");
			score[i] = sc.nextInt();
		}
		for(int i = 0; i < k; i++)
			tot += score[i];
		avg = tot / (double)k;
		
		System.out.println("입력된 점수 : ");
		for(int i = 0; i < k; i++)
			System.out.printf("%d ", score[i]);
		System.out.printf("\n총점 : %d점, 평균 : %.2f점\n", tot, avg);
		sc.close();
	}
}
