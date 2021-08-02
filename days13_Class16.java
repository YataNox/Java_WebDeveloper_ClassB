package days13;

class Student
{
	private int bunho;
	private String name;
	private int[] scores; // 성적을 저장하기 위한 배열 변수
	private String[] subjects;
	private int tot; // 총점을 저장하기 위한 변수
	private double avg; // 평균을 저장하기 위한 변수
	private char grade; // 학점을 저장하기 위한 변수
	
	Student()
	{
		subjects = new String[3];
		subjects[0] = "국어"; subjects[1] = "영어";	subjects[2] = "수학";
		scores = new int [subjects.length];
	}
	Student(String name)
	{
		this();
		this.name = name;
	}
	Student(String name, int kor, int eng, int mat)
	{
		this(name);
		this.scores[0] = kor;
		this.scores[1] = eng;
		this.scores[2] = mat;
	}
}

public class Class16 
{
	public static void main(String[] args)
	{
		Student std1 = new Student();
		Student std2 = new Student("홍길동");
		Student std3 = new Student("홍길남, 100, 100, 100");
	}
}
