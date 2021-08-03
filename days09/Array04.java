package days09;

import java.util.Scanner;

public class Array04 
{
	public static void main(String[] argd)
	{
		Scanner sc = new Scanner(System.in);
		// 필요한 각 배열의 선언
		int [] kor = new int[3]; // 3명의 학생의 국어 점수 저장용
		int [] eng = new int[3]; // 3명의 학생의 영어 점수 저장용
		int [] mat = new int[3]; // 3명의 학생의 수학 점수 저장용
		int [] tot = new int[3]; // 3명의 학생의 총점 저장용
		double [] avg = new double[3]; //평균용
		
		for(int i = 0; i < 3; i++)
		{
			System.out.printf("%d번 학생 국어 점수 입력 : ", i+1);
			kor[i] = sc.nextInt();
			System.out.printf("%d번 학생 영어 점수 입력 : ", i+1);
			eng[i] = sc.nextInt();
			System.out.printf("%d번 학생 수학 점수 입력 : ", i+1);
			mat[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 3; i++)
		{
			tot[i] = kor[i] + eng[i] + mat[i];
			avg[i] = tot[i] / 3.0;
		}
		
		System.out.println("\t\t###성적표###");
		System.out.println("-----------------------------------------------------");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------------");
		for(int i = 0; i < 3; i++)
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\n", i+1, kor[i], eng[i],
					mat[i], tot[i], avg[i]);
		System.out.println("-----------------------------------------------------");
    sc.close();
	}
}
/*
package days09;

import java.util.Scanner;

public class Array04 
{
	public static void main(String[] argd)
	{
		Scanner sc = new Scanner(System.in);
		// 필요한 각 배열의 선언
		System.out.printf("학생 수 : ");
		int std = sc.nextInt();
		int [] kor = new int[std]; // 3명의 학생의 국어 점수 저장용
		int [] eng = new int[std]; // 3명의 학생의 영어 점수 저장용
		int [] mat = new int[std]; // 3명의 학생의 수학 점수 저장용
		int [] tot = new int[std]; // 3명의 학생의 총점 저장용
		double [] avg = new double[std]; //평균용
		
		for(int i = 0; i < tot.length; i++)
		{
			System.out.printf("%d번 학생 국어 점수 입력 : ", i+1);
			kor[i] = sc.nextInt();
			System.out.printf("%d번 학생 영어 점수 입력 : ", i+1);
			eng[i] = sc.nextInt();
			System.out.printf("%d번 학생 수학 점수 입력 : ", i+1);
			mat[i] = sc.nextInt();
		}
		
		for(int i = 0; i < tot.length; i++)
		{
			tot[i] = kor[i] + eng[i] + mat[i];
			avg[i] = tot[i] / 3.0;
		}
		
		System.out.println("\t\t###성적표###");
		System.out.println("-----------------------------------------------------");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------------");
		for(int i = 0; i < tot.length; i++)
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\n", i+1, kor[i], eng[i],
					mat[i], tot[i], avg[i]);
		System.out.println("-----------------------------------------------------");
		sc.close();
	}
}

*/
