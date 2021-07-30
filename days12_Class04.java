package days12;

class Student
{
	private int bunho;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	
	public void init(int bunho, String name, int kor, int eng, int mat)
	{
		this.bunho = bunho;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = this.kor + this.eng + this.mat;
		this.avg = tot / 3.0;
	}
	public void prn()
	{
		System.out.println("\t\t-------- 성적표 --------");
		System.out.println("------------------------------------------------------");
		System.out.println("번호\t이름\t\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------------------");
		System.out.printf("%d\t%s\t\t%d\t%d\t%d\t%d\t%.2f\n",bunho, name, kor, eng, mat, tot, avg);
		System.out.println("------------------------------------------------------");
	}
	public double getAvg()
	{
		return this.avg;
	}
}

public class Class04 
{
	public static void main(String[] args)
	{
		Student std1 = new Student();
		std1.init(1, "홍길동", 89, 56, 67); // 번호, 이름, 세 점수 입력 총점 평균 계산
		std1.prn(); // 성적표 출력
		System.out.printf("std1학생의 평균 : %.2f\n", std1.getAvg()); // 평균 리턴
	}
}
