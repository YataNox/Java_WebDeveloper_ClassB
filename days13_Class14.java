package days13;

// this 변수 : 레퍼런스(참조) 변수
// 클래스의 멤버필드들은 new 라는 워드에 의해서 각각의 객체별로 생성됩니다.
// 서로 다른(겹치지 않은) 메모리공간
// 반면, 멤버 메소드는 생성된(오버로딩 포함) 메소드별로 하나만 존재하며 모든 객들이 
// 공유하게 됩니다.
// 이 때 현재 메소드를 호출한 객체가 어떤 객체인지 구분하여 실행될 수 있게 this라는 
// 숨겨진 참조변수를 사용합니다.

class ThisA
{
	private int n;
	
	public void setNum(int n /*, ThisA this*/)
	{
		this.n = n;
		// this에는 현재 메소드를 호출한 객체의 참조변수값이 전달되어 저장됩니다.
		// 매개변수로 선언된 n변수는 현재 메소드안에서만 사용되는 지역 변수로만
		// 사용되고 소멸합니다.
		// 멤버 메소드에서는 멤버변수에 접근 권한이 있으므로, 참조변수 this와
		// 멤버변수가 (.)으로 연결되어 사용됩니다.
	}
}

public class Class14 
{
	public static void main(String[] args)
	{
		ThisA a1 = new ThisA();
		ThisA a2 = new ThisA();
		a1.setNum(10);
		a1.setNum(20);
	}
}
