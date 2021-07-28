package days10;

import java.util.Scanner;

public class Array17 
{
	public static void main(String[] args)
	{
		// 3명 학생의 3과목 점수 저장 배열. 마지막 열은 총점
		int [][] score = new int[3][4];
		String[] name = new String[3];
		double[] avg = new double[3];
		String[] subject = {"국어", "영어", "수학"};
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < score.length; i++)
		{
			System.out.printf("%d번째 학생의 이름 : ", i+1);
			name[i] = sc.nextLine();
			
			for(int j = 0; j < score[i].length-1; j++)
			{
				System.out.printf("%d번째 학생 %s과목 점수 : ", i+1, subject[j]);
				score[i][j] = sc.nextInt();
				sc.nextLine();
			}
			score[i][3] = score[i][0] + score[i][1] + score[i][2];
			avg[i] = score[i][3] / 3.0;
		}
    sc.close();
	}
}
