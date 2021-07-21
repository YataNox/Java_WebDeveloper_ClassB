package days05;

import java.util.Scanner;

public class ControllOpif08 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, mat, tot;
		double ave;
		
		//Input Data
		System.out.printf("국어점수 : ");
		kor = sc.nextInt();
		System.out.printf("영어점수 : ");
		eng = sc.nextInt();
		System.out.printf("수학점수 : ");
		mat = sc.nextInt();
		
		// 평균 60점 이상이면서 모든 과목에 40미만이 없다면 합격
		// 그렇지 않다면 불학격을 출력하되
		// 불합격 사유 (평균 미달, 국어 과락, 영어 과락, 수학과락)를 함께 출력하세요
		
		tot = kor + eng + mat;
		ave = tot / 3.0;
		
		//Print Data
		System.out.printf("평균 : %.1f점\n", ave);
		if(ave >= 60.0 && kor >= 40.0 && eng >= 40.0 && mat >= 40.0)
			System.out.println("합격");
		else
		{
			System.out.print("불합격 : ");
			if(ave < 60.0)
				System.out.print("(평균 미달) ");
			if (kor < 40.0)
				System.out.print("(국어 과락) ");
			if (eng < 40.0)
				System.out.print("(영어 과락) ");
			if (mat < 40.0)
				System.out.print("(수학 과락)");
		}
	}
}
