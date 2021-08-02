package days13;

// static 키워드
// 클래스(중첩 클래스에서만 사용 가능), 멤버변수, 멤버메소드에 적용할 수 있는 키워드
// 정적 변수(클래스의 변수), 정적 메소드(클래스의 메소드)를 선언할 때 사용

// 자바 프로그램의 구동 과정
// 1. JVM에 의해서 실행할 모든 클래스 중, static 메소드, static 멤버필드를 수집해서
// 메모리에 로딩되고, 프로그램의 시작(main메소드의 실행)전에 메모리 적재됩니다.
// 2. 메모리에 로딩된 static 메소드 중, main 이름을 검색
// 3. main 메소드가 검색되었다면 JVM 해당 main 메소드를 호출하여 프로그램을 시작

// static 필드/메소드의 특징
// 프로그램의 구동 전부터 메모리를확보하고 있는 멤버필드 및 메서드!!!ㅁ

class StaticA
{
	int num;// 멤버 변수 선언 - 동적 변수
	static int number = 100; // 멤버 변수 선언 - 정적 변수
}

public class Class17 
{
	public static void main(String[] args)
	{
		// 동적 멤버 변수는 객체가 반드시 만들어져야 사용이 가능한 변수입니다.
		StaticA a = new StaticA();
		a.num = 100;
		System.out.println("a 객체의 동적 멤버 변수 값 : " + a.num);
		// 위에서 객체 생성 명령(StaticA a = new StaticA();)이 없다면
		// 아래 두 개의 명령은 모두 에러가 발생한다.
		
		// 그러나 static 변수는 main 메서드 실행전에, 객체 생성 전에
		// 이미 생성되어 있는 객체와는 독립적, 클래스와는 종속적으로 사용하도록 생성됩니다.
	}
}
