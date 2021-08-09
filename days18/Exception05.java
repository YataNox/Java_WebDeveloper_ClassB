package days18;

// 예외처리와 메소드 호출간의 관계
// 예외 처리 가능성이 있는 구문을 포함 메소드는 throws Exception's name을 표시하여
// 본 메소드들을 호출한 구문에 예외처리 권한을 일임합니다.
// 또는 예외처리 가능성이 있는 구문을 try~catch로 처리하여 호출 구문에 부담을 주지 않고 처리
// 할 수도 있습니다.
// 아래 예제는 예외처리 메소드에게 예외처리 권한을 넘기고, 최초 호출 구문에 try~catch로 처리하는 예

public class Exception05 
{
	public static void method1()
	{
		method2();
	}
	public static void method2()
	{
		System.out.println("Method2 실행");
		throw new Exception(); // 강제 예외 발생
	}
	public static void main(String[] args)
	{
		
	}
}
