package days16;

interface InterC_Super1
{
	public abstract void interC_Super1Test();
}
interface InterC_Super2
{
	public abstract void interC_Super2Test();
}

// 인터페이스들간의 상속(extends) : 엔터페이스 끼리 상속해서 부모의 추상 메소드를 
// 물려받을 수 있습니다.
interface InterC_Sub extends InterC_Super1, InterC_Super2
{
	public abstract void interC_SubTest();
	// public abstract void interC_Super1Test(); 상속받은 추상 메소드
	// public abstract void interC_Super12Test(); 상속받은 추상 메소드
}
// 인터페이스끼리의 extends는 추상 메서드의 override 의무는  면제됩니다.
// 다만 상속받은 추상 메소드를 보유하게 되어 이를 implements 한 클래스가
// 오버라이드 하게 합니다.

// 클래스에서 다수개의 인터페이스를 구현(implements)할 수 있습니다.
class SubC1 implements InterC_Super1, InterC_Super2
{
	public void interC_Super1Test() {}
	public void interC_Super2Test() {}
}// 일반 클래스가 인터페이스를 다수개 implements 했다면 그 인터페이스들이
// 보유한 추상 메소드들을 모두 구현(override)해야합니다.

// 인터페이스 간 상속을 구현하고 있는 인터페이스를 클래스에서 구현하는 경우
// 부모 인터페이스의 추상 메소드를 포함하여 모두 오버라이딩해야 합니다.

class SubC2 implements InterC_Sub
{
	public void interC_Super1Test() {}
	public void interC_Super2Test() {}
	public void interC_SubTest() {}
}

public class Extends12_Interface03 
{
	public static void main(String[] args)
	{
		// 부모 인터페이스의 레퍼런스 변수에 자식 클래스의 객체를 대입
		InterC_Super1 s1 = new SubC2();
		InterC_Super2 s2 = new SubC2();
		InterC_Sub s3 = new SubC2();
		// 인터페이스를 다중 상속한 경우 부모 인터페이스는 자신의 추상 메소드만을
		// 접근할 수 있습니다.
		s1.interC_Super1Test();
		s2.interC_Super2Test();
		// s1.interC_Super2test(); 에러 - 상속해주지 않은 다른 인터페이스의 추상 메소드
		// s2.interC_Super1test(); 에러 - 상속해주지 않은 다른 인터페이스의 추상 메소드
		s3.interC_SubTest();
		s3.interC_Super1Test();
		s3.interC_Super2Test();
	}
	// 일반 클래스는 extends로 상속할 때 다중 상속이 안 될뿐
	// 클래스의 extends와 interface의 impolements도 동시 구현이 가능합니다.
	// class 자식 클래스명 extends 부모클래스명 implements 부모인터페이스명
	// 더불어 인터페이스는 여러개를 동시 implements 할 수 있습니다.
}
