package days16;

// 자바 언어세서 제공하는 상속 기능은 단일 상속만을 지원합니다.
// 하나의 클래스는 하나의 부모 클래스를 가질 수 있습니다.
// (여러개의 클래스를 상속할 수 없음)
// class SubA extends SuperA, SuperB{} 에러

// 다중 상속을 위해 interface
// 인터페이스도 클래스입니다. 다만 제약이 있는 클래스입니다.
// 인터페이스는 멤버 필드로 public static final 멤버만 가질 수 있습니다.
// 인터페이스는 멤버 메소드로 public abstract 메소드만 가질 수 있습니다.
// 다중 상속이 가능합니다.

// class 만들듯이 생성하며, class란 키워드 대신 interface라는 키워드를 
// 써서 생성합니다.
interface InterA
{
	// int n1; // 에러. 일반 변수는 생성하지 못합니다.
	// InterA(){} // 에러. 추상 메소드만 생성이 가능하고, 일반 메서드는 생성자조차도
	// 생성이 불가능합니다.
	// public void print(){} 에러 - 일반 메소드 선언 불가(추상 메소드만 생성 가능)
	
	// 인터페이스 내부에 선언할 수 있는 요소
	public static final int num = 10;
	public abstract void test();
}



public class Extends12_Interface01 
{
	public static void main(String[] args)
	{
		
	}
}
