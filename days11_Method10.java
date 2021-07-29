package days11;

import java.util.Scanner;

public class Method10 
{
	public static void main(String[] args)
	{
		int kor, eng, mat, tot;
		double avg;
		kor = myInput(1); // 점수입력
		eng = myInput(2);
		mat = myInput(3);
		tot = sum(kor, eng, mat); // 총점 계산
		avg = avg(kor, eng, mat); // 평균 계산
		prn(tot, avg); // 총점, 평균, 학점 출력
	}
	
	// 점수 입력 함수
	public static int myInput(int num)
	{
		Scanner sc = new Scanner(System.in);
		switch(num) 
		{
			case 1 :
				System.out.print("국어점수 입력 : ");
				break;
			case 2 :
				System.out.print("영어점수 입력 : ");
				break;
			case 3 :
				System.out.print("수학점수 입력 : ");
				break;
		}
		int value = sc.nextInt();
		
		if(num == 3)
			sc.close();
		
		return value;
	}
	
	// 총점 계산 함수
	public static int sum(int kor, int eng, int mat)
	{
		return kor + eng + mat;
	}
	
	// 평균 계산 함수
	public static double avg(int kor, int eng, int mat)
	{
		int total = sum(kor, eng, mat);
		return total;
	}
	
	// 출력 함수
	public static void prn(int tot, double avg)
	{
		String[] grade = {"F", "F", "F", "F", "F", "F", "D", "C", "B", "A"};
		System.out.printf("입력한 점수의 총점은 %d\n", tot);
		System.out.printf("입력한 점수의 평균은 %.2f\n", avg);
		int n = (int)(avg / 10);
		System.out.printf("학점은 %s입니다.", grade[n]);
	}
}
