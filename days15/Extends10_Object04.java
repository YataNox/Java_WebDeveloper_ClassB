package days15;

class Student
{
	private String name;
	private int age;
	public Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public String toString()
	{
		String info = "name = " + this.name + ", ";
		info += "age = " + this.age;
		return info;
	}
}

public class Extends10_Object04 
{
	public static void main(String[] args)
	{
		Student s1 = new Student("홍길동", 21);
		Student s2 = new Student("홍길동", 21);
		Student s3 = new Student("홍길서", 22);
		System.out.println("학생 1번의 정보 : " + s1);
		System.out.println("학생 2번의 정보 : " + s2);
		System.out.println("학생 3번의 정보 : " + s3);
		
		// 레퍼런스 변수들간의 비교
		if(s1 == s2)
			System.out.println("s1 변수와 s2 변수는 같습니다.(s1 == s2)");
		else
			System.out.println("s1 변수와 s2 변수는 다릅니다.(s1 == s2)");
		// 결과 : s1 변수와 s2 변수는 다릅니다.(s1 == s2)
	}
}
