package days16;

// 추상 클래스의 단점
// 추상 메소드 구현의 강제성!!
// 추상 메소드의 갯수가 많으면 상속에 부담을 주게 됩니다.
// 자식 클래스에서 사용하지 않을 추상 메소드라도, 객체 생성을 위해 반드시 구현해야
// 하는 문제점이 있습니다.

abstract class AbstractA
{
	public abstract void test1();
	public abstract void test2();
	public abstract void test3();
	public abstract void test4();
	public abstract void test5();
	public abstract void test6();
	public abstract void test7();
}
// Abstract_A 클래스를 상속 받은 클래스는 필요없는 메소드가 있어도, 추상 메소드를 모두
// 오버라이드(구현)해야합니다.
class AbstractA_Sub1 extends AbstractA
{
	public void test1() {}
	public void test2() {}
	public void test3() {}
	public void test4() {}
	public void test5() {}
	public void test6() {}
	public void test7() {}
}

class AbstractA_Adapter extends AbstractA
{
	public void test1() {}
	public void test2() {}
	public void test3() {}
	public void test4() {}
	public void test5() {}
	public void test6() {}
	public void test7() {}
}

// 모든 추상 클래스가 구현(오버라이드)된 AbstracA_Adapter 클래스를 상속받아
// 사용하면 필요없는 메서드를 강제로 구현(오버라이드)하지 않고 필요한 것만 구현하여
// 사용할 수 있습니다.
class AbstractA_Sub2 extends AbstractA_Adapter
{
	public void test1() 
	{
		System.out.println("test1 오버라이딩~!");
	}
}

public class Extends11_Abstract03 
{
	public static void main(String[] args)
	{
		
	}
}
