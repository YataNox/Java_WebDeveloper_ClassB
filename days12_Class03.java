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
	// 멤버 메소드의 내용을 객체와 상관없는 명령이 들어갈수도 있지만
	// 보통은 멤버 변수들의 조작, 출력, 입력을 위한 명령들로 주로 구성됩니다.
	public void input(String n, int a)
	{
		name = n;
		age = a;
	}
	// 멤버 메소드는 같은 클래스 안에 있는 메소드이므로, 변수 앞에 객체 이름을 쓰지 않습니다.
	// 다만 호출 객체 정보는 자동으로 전다로디서 어느 객체에 변수가 사용되는지 자동 구분됩니다.
}
public class Class03 
{
	public static void main(String[] args)
	{
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		
		// 멤버 변수가 어떤 객체의 변수인지 구분하기 위해, 변수 이름 앞에 (객체이름.)을
		// 붙여서 사용하듯이 멤버 메소드도, 호출의 주체가 되는 객체 이름을 반드시 써야합니다.
		a1.output();
		a2.output();
		
		a1.name = "댕댕이";
		a1.age = 20;
		
		a2.input("바둑이", 5);
		
		a1.output();
		a2.output();
	}
}
