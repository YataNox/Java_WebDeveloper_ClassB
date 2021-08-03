package days14;

class SuperC
{
	public SuperC(int num)
	{
		System.out.println("부모 클래스의 매개 변수가 있는 생성자");
	}
}

class SubC extends SuperC
{
	public SubC()
	{
		
	}
}

public class Extends05 
{
	public static void main(String[] args)
	{
		SubC c = new SubC();
	}
}
