package days15;

// Object 클래스의 equals 메소드 : 객체간의 비교를 위해서 사용되는 메소드
// Object가 상속한 메서드들 중 toString과 함께 가장 많이 오버라이딩 되는 메소드

public class Extends10_Object03 
{
	public static void main(String[] args)
	{
		// 일반적, 기본 자료형들의 값의 비교는 비교연산자(==)를 사용합니다.
		int n1 = 10;
		int n2 = 10;
		if(n1 == n2)
			System.out.println("n1 변수와 n2 변수는 같습니다.");
		else
			System.out.println("n1 변수와 n2 변수는 다릅니다.");
	}
}
