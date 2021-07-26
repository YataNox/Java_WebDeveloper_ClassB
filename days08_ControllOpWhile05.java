package days08;

import java.util.Scanner;

public class ControllOpWhile05 
{
	public static void main(String args[])
	{
		int std, k, i=1, j=1; // 학생수 , 과목수, 반복실행 변수 i,j
		int tot = 0, num; // 총점, 방금 입력 받은 점수가 저장될 변수
		double avg = 0.0; // 평균이 저장될 변수
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("학생수 입력 : ");
		std = sc.nextInt();
		System.out.printf("과목수 입력 : ");
		k = sc.nextInt();
		
		// 입력된 학생 수 만큼과 입력된 과목수 만큼의 성적표를 총점 평균과 함께
		// 총점 평균만 성적표 양식으로 출력해주세요
		
		System.out.printf("\t\t###성적표###\n");
		System.out.printf("-------------------------------------------------\n");
		System.out.printf("번호/\t총점/\t평균\t\n");
		System.out.printf("-------------------------------------------------\n");
		while(i <= std) 
		{
			System.out.println(i + "번 학생");
			while(j <= k) 
			{
				System.out.printf("과목 점수 입력 : ");
				num = sc.nextInt();
				tot += num;
				j++;
			}
			
			avg = tot / k;
			System.out.printf("%d/\t%d/\t%.1f/\t\n", i, tot, avg);
			System.out.printf("-------------------------------------------------\n");
			j = 1;
			tot = 0;
			i++;
		}
		sc.close();
	}
}
