package days14;

// 접근 지정자와 상속
// 부모클래스의 private 멤버는 아무리 자식 클래스라고 하더라도 접근할 수 없는 멤버입니다.

class SuperA
{
	// private : 현재 클래스 내에있는 멤버 메서드를 통해서만 접근 가능한 완전
	// 은닉 멤버 변수
	private int n1;
	public int n2;
	// 디폴트 접근 지정자 : 동일한 패키지 내부에서는 public으로 동작,
	// 다른 패키지에서는 private으로 동작
	int n3;
	public int getN1() {return n1;}
}

public class Extends03 
{
	public static void main(String[] args)
	{
		
	}
}
