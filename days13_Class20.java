package days13;

// static 메소드
// static 멤버 필드와 같이 프로그램의 구동 전에 메모리에 로딩되어
// 객체의 생성없이 클래스의 이름을 사용해 호출할 수 있는 메소드. 클래스 이름을 앞에도구
// (.)으로 연결해서 사용. 객체 생성없이 사용이 가능합니다.

public class Class20 
{
	public static void main(String[] args)
	{
		// static 메서드의 실제 사용 예
		// 간단한 공용 기능을 제공하기 위한 Math 클래스
		// Math 클래스 안에 public  static int abs(int n) {}와 같은 양식의
		// sqrt, random 메서드가 있음
		// abs : 절대 값 계산 메서드, sqrt : 제곱근 계산 메서드
		// random : 난수 발생 메서드
		// Math 클래스의 random 메서드는 Random 클래스의 nextInt() 메서드와
		// 양식은 다르지만 역할은 같은 메서드들입니다.
		// 다만 Math 클래스의 random 메서드는 static 메서드 이므로
		// Math.random();와같이 사용하고
		//Random 클래스의 nextInt() 메서드는 동적 멤버 메소드이므로 객체 생성 후
		// 호출 객체를 앞에 두고 사용합니다.
		// Random rd = new Randon(); rd.nextInt();
	}
}
