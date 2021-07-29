package days11;

import java.util.Scanner;

public class Method16 
{
	public static void main(String[] args)
	{
		int [][] scores;
		int s = getStudentNumber(); // 학생수를 입력 받아서 리턴하는 메소드
		int k = getSubjectNumber(); // 과목수를 입력 받아서 리턴하는 메서드
		scores = new int[s][k];
		input(scores); // s 명의 학생의 k 개의 과목 수 입력
		output(scores); // 총점 평균 계산 후 성적표 출력
		//				 -------- 성적표 --------
		// --------------------------------------------
		// 번호 과목1 과목2 과목3..... 총점	 평균
		// --------------------------------------------
	}
	
	// 학생 수 입력 함수
	public static int getStudentNumber()
	{
		int std;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수 입력 : ");
		std = sc.nextInt();
		
		return std;
	}
	
	// 과목 수 입력 함수
	public static int getSubjectNumber()
	{
		int sub;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("과목 수 입력 : ");
		sub = sc.nextInt();
		
		return sub;
	}
	
	// 과목 점수 입력 함수
	public static void input(int[][] scores)
	{
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < scores.length; i++)
		{
			System.out.println("--------------------------------------------");
			System.out.println((i+1) + "번째 학생 과목 입력 ");
			
			for(int j = 0; j < scores[i].length; j++)
			{
				System.out.printf("과목%d 점수 입력 : ", j+1);
				scores[i][j] = sc.nextInt();
			}
		}
		sc.close();
	}
	
	// 성적 출력 함수
	public static void output(int[][] scores)
	{
		int [] tot = new int[scores.length];
		double [] avg = new double[scores.length];
		
		// 총점과 평균 계산
		for(int i = 0; i < scores.length; i++)
		{
			for(int j = 0; j < scores[i].length; j++)
				tot[i] += scores[i][j];
			
			avg[i] = tot[i] / scores[i].length;
		}
		
		// 성적표 출력
		System.out.println("\t\t-------- 성적표 --------");
		System.out.println("--------------------------------------------");
		System.out.printf("번호\t");
		
		// 입력한 과목 수만큼 점수 출력
		for(int i = 0; i < scores[0].length; i++)
			System.out.printf("과목%d\t", i+1);
		
		System.out.println("총점\t평균");
		System.out.println("--------------------------------------------");
		
		// 총점 평균 출력
		for(int i = 0; i < scores.length; i++)
		{
			System.out.printf("%d\t", i+1);
			
			for(int j = 0; j < scores[i].length; j++)
				System.out.printf("%d\t", scores[i][j]);
			
			System.out.printf("%d\t%.2f\n", tot[i], avg[i]);
		}
	}
	
}
