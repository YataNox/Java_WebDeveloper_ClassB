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
	
	public void display(/*ThisA this*/)
	{
		System.out.printf("n = %d\n", n);
		// 매개변수와 멤버변수가 겹치는 상황 등 여러 이유로 this 꼭 사용해야하는 사오항이
		// 있지만, 그런 상황이 아니라면 위처럼 생략 가능합니다.
		// 보통 멤버변수를 this 없이 사용해도 매개변수가 아니라면 아래의 실행 코드는
		// 내부적으로 this가 붙어서 다음과 같이 변환되어 실행됩니다.
		// System.out.printf("n = %d\n", this.n);
	}
	// this의 용도 1 : 멤버메소드를 호출한 호출 객체의 참조변수 값(주소 값)을 전달받아
	// 전달된 호출 객체를 식별하는 용도로 사용됩니다.
	
}

public class Class14 
{
	public static void main(String[] args)
	{
		ThisA a1 = new ThisA();
		ThisA a2 = new ThisA();
		
		a1.setNum(10);
		a2.setNum(20);
		a1.display();
		a2.display();
		
		ThisA a3 = a1; // a1 참조변수 값을 a3에 복사하는 동작
		
		a3.setNum(100); // a3의 멤버변수만 수정.
		a1.display();  // 출력은 a1과 a3가 모두 수정되어 출력
		a3.display();
		// 위 연산은 new를 이용하여 a3에 새로운 공간을 만든게 아니라,
		// a1 위 레퍼런스 값만 복사 저장한 결과로, a1과 a3는 같은 공간의 주소를 
		// 저장하고 있기 때문입니다.
	}
}
