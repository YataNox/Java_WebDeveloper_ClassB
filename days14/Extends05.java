package days14;

class SuperC
{
	// public SuperC() {}
	public SuperC(int num)
	{
		System.out.println("부모 클래스의 매개 변수가 있는 생성자");
	}
}

class SubC extends SuperC
{
	// 부모 클래스의 디폴트 생성자가 존재하지 않는 경우
	// 자식 클래스의 생성자에서는 반드시 super를 사용하여 명시적으로 매개 변수가 잇는
	// 부모 클래스의 생성자를 호출해야합니다.
	
	public SubC()
	{
		// 숨어있는 부모 생성자 호출 명령은 super(); -> 부모의 디폴트 생성자 호출
		super(10);
	}
}

public class Extends05 
{
	public static void main(String[] args)
	{
		SubC c = new SubC();
	}
}
