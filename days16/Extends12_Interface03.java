package days16;

interface InterC_Super1
{
	public abstract void interC_Super1Test();
}
interface InterC_Super2
{
	public abstract void interC_Super12Test();
}

// 인터페이스들간의 상속(extends) : 엔터페이스 끼리 상속해서 부모의 추상 메소드를 
// 물려받을 수 있습니다.
interface InterC_Sub extends InterC_Super1, InterC_Super2
{
	public abstract void interC_SubText();
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
	public void interC_Super12Test() {}
}// 일반 클래스가 인터페이스를 다수개 implements 했다면 그 인터페이스들이
// 보유한 추상 메소드들을 모두 구현(override)해야합니다.

public class Extends12_Interface03 
{
	public static void main(String[] args)
	{
		
	}
}
