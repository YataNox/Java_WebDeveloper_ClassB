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
	}
}
