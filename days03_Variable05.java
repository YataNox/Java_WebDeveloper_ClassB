package days03;

import java.util.Scanner;

public class Variable05 
{
	public static void main(String args[])
	{
		int kor, mat, eng, total;
		double avg;
		String name;
		Scanner sc = new Scanner(System.in);
		
		// 이름, 국어, 영어, 수학 점수를 입력 받아서 1명의 성적표를 총점 평균과 함께 
		// 출력하세요
		
		// 이름, 국어, 영어, 수학 성적 입력
		System.out.printf("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.printf("국어 성적을 입력하세요 : ");
		kor = sc.nextInt();
		System.out.printf("영어 성적을 입력하세요 : ");
		eng = sc.nextInt();
		System.out.printf("수학 성적을 입력하세요 : ");
		mat = sc.nextInt();
		
		//총점, 평균 값 계산
		total = kor + eng + mat;
		avg = total / 3.0;
		
		//이름부터 평균까지의 값 출력
		System.out.println("--------------------------------------------");
		System.out.printf("%3s\t %3s\t %3s\t %3s\t %3s\t %3s\n", "이름", "국어", "영어", "수학", "총점", "평균");
		System.out.println("--------------------------------------------");
		System.out.printf("%3s\t %3d\t %3d\t %3d\t %3d\t %3.2f\n", name, kor, eng, mat, total, avg);
		System.out.println("--------------------------------------------");
		sc.close();
	}
}
