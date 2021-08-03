package days14;

// 일반 객체의 생성 과정
// 1. 멤버 필드 메모리 로딩
// 2. 생성자 호출

// 상속 관계에서의 객체 생성 과정
// 1. 멤버 필드의 메모리 로딩 - 부모/자식 클래스의 모든 멤버 필드가 메모리 로딩
// 2. 생성자 호출(먼저 자식 클래스의 생성자 호출)
// 3. 자식 클래스 생성자의 첫 번째 실행 코드인 super()에 의해 부모클래스의
// 		생성자 호출. super()라는 명령은 따로 쓰지 않아도 이미 존재하며 부모 클래스가 있다면
// 		자동 호출되는 명령.
// 4. 자식클래스의 생성자의 나머지 코드들 실행
// - 부모 클래스의 private멤버와 같은 경우 자식 클래스에서 초기화를 할 수 없기
// 	  때문에 부모 클래스의 생성자를 통해 초기화를 실행

class SuperB
{
	int superNum;
	public SuperB()
	{
		System.out.println("부모 클래스의 생성자 실행");
	} // 부모 클래스 생성자
}

class SubB extends SuperB // SuperB 클래스 상속
{
	int subNum;
	// 생성자를 별도로 꺼내서 정의하지 않았다면..
	// 보이지 않는 곳에 디폴트 생성자가 존재할 것이며, 그의 첫 번째 명령은
	// super();가 되어있습니다.
	// SubB(){super();}
	
	// 생성자를 별로도 꺼내서 정의한 경우..
	// 매개변수가 있는 생성자가 오버로딩 된 경우... this()로 형제 생성자를 호출한 경우
	public SubB()
	{
		super();
		// 자식 클래스에서 부모 클래스 생성자 호출은 super();라고 명령하며,
		// 반드시 첫 번째 실행코드로 씁니다.
		// 다만 부모 클래스의 생성자가 오버로딩 되거나 하지 않았다면 쓰지 않아도
		// super();명령은 실행됩니다.
		// 부모클래스 생성자가 디폴트 생성자만 있을 경우 super(); 명령 생략 - 자동호출
		System.out.println("자식 클래스의 생성자 호출");
	}
	// 매개변수가 있는 생성자가 오버로딩 된 경우... this()로 형제 생성자를 호출한 경우
	public SubB(int subNum) // 오버로딩된 자식 클래스 생성자
	{
		// 자식 클래스의 오버로딩된 생성자의 첫 번째 실행코드는 super() 또는
		// this()를 코딩하는데 그 둘을 같이 실행할 수는 없습니다.
		// 현재 클래스의 매개 변수가 없는 생성자를 this()로 호출하고 그 안에서
		// super()가 실행되도록 합니다.
		this();
		System.out.println("자식 클래스의 오버로딩된 생성자 실행(this()o)");
		// 부모나 형제 생성자에 매개 변수가 있는 경우 반드시
		// 호출하려는 super() 또는 this()의 매개 변수에 맞춰 전달인수를 전달합니다.
	}
	// 매개 변수가 있는 생성자가 오버로딩 된 경우
	// this()로 형제 생성자를 호출 하지 않는 경우
	public SubB(int subNum, int num)
	{
		super();
		System.out.println("자식 클래스의 오버로딩된 생성자 실행(this()x)");
		
	}
}

public class Extends04
{
	public static void main(String[] args)
	{
		SubB b = new SubB();
		System.out.println();
		SubB b1 = new SubB(10);
		System.out.println();
		SubB b2 = new SubB(10, 20);
 	}
}
