package days12;

class Animal
{
	String name;
	int age;
	// 멤버 메서드
	public void output()
	{
		System.out.printf("나의 이름은 %s, 나의 나이는 %d입니다.\n", name, age);
	}
	// 멤버 메소드는 클래스형으로 생성된 객체 전용 메소드
	// 메소드의 실행이 객체 전용으로만 사용디 된다는 뜻입니다.
}
public class Class03 
{
	public static void main(String[] args)
	{
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		
		a1.output();
		a2.output();
	}
}
