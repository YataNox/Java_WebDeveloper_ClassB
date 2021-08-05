package days16;

// 추상 클래스 (Abstract Class)
// 상속을 통한 다형성의 구현(메소드 오버라이딩)에 강제성을 부여하기 위한 클래스
// 추상 메소드를 포함한 클래스 : 추상 메소드를 하나 이상 포함하면 추상 클래스라고 부릅니다.
// 추상 메소드 : 메소드의 원형만 존재하고 실제 내용이 없는 메소드

abstract class AbstractAnimal
{
	public abstract void sound();
	// 메소드 정의만 있고, 메소드의 body(몸체)구현은 없습니다.
}
// 추상 메소드의 작성 방법
// 접근 지정자 abstract 리턴값의타입 메소드명(매개변수);
// 추상 클래스는 일반 클래스와 동일하게 일반 멤버변수 일반 메소드, 생성자 등을
// 포함할 수 있습니다.
// 단, 추상 메소드를 포함할 수 있는 특징이 추가된 클래스입니다.
// 추상 클래스는 상속을 통한 다형성 구현을 위해서 생성됩니다.

class DogA extends AbstractAnimal
{
	public void sound()
	{
		System.out.println("멍~멍~");
	}
}

class CatA extends AbstractAnimal
{
	public void sound() 
	{
		System.out.println("야옹~");
	}
}

public class Extends11_Abstract02 
{
	public static void main(String[] args)
	{
		
	}
}
