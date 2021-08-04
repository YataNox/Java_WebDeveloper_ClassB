package days15;

// 메소드 오버라이딩
// 1. 메소드의 이름이 동일해야합니다.
// 2. 메소드의 매개변수의 타입, 개수, 순서가 다를 경우 같은 이름의
// 메소드라도 다른 메소드로 인식합니다.
// 3. 상속 관계에서만 사용할 수 있습ㄴ디ㅏ.
// 4. 부모 클래스의 메소드의 원형과 반드시 일치해야 합니다.(리턴 값의 타입, 메소드 이름,
// 매개변수)
// 5. 접근 지정자는 축소될 수 없습니다.(다형성의 구현 때문에)
// 6. 부모 클래스의 final로 정의된 메소드는 오버라이딩 할 수 없습니다.

class Animal2
{
	public void crying()
	{
		System.out.println("소리를 냅니다.");
	}
}

class Dog2 extends Animal2
{
	public void crying()
	{
		super.crying();
		System.out.println("멍멍~!");
	}
}

class Cat2 extends Animal2
{
	public void crying2()
	{
		super.crying();
		System.out.println("냐옹~!");
	}
	// 메소드의 이름이 다르므로 메소드 오버라이딩이 아닙니다.
}

public class Extends08_MethodOverriding02 
{
	public static void main(String[] args)
	{
		Dog2 d = new Dog2();
		Cat2 c = new Cat2();
		// 메소드가 오버라이딩 되지 않은 Cat2 클래스의 crying() 메서드는
		// 부모 클래스 메소드가 실행됩니다.
		c.crying();
		d.crying();
		// 클래스의 외부에서는 super 키워드를 통한 부모 클래스의 메소드 호출이 제한됨
		// c.super.crying(); 에러
		
		// 부모 클래스의 레퍼런스 변수는 자식 클래스의 객체의 주소를 저장할 수 있습니다.
		Animal2 a = d; // Animal2 a = new Dog2();
		// 이것을 상속의 다형성이라고 합니다.
		
		// 이때 a.crying()을 실행하면 자식 클래스에서 오버라이딩된 메소드가
		// 우선적으로 실행됩니다.
		a.crying();
	}
}
