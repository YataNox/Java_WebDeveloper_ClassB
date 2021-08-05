package days16;

public class StringClass 
{
	public static void main(String[] args)
	{
		// 0.
		// 가용한 HEAP 건강에 "Hello"를 저장하고 그 주소를 s에 전달
		String s = "Hello";
		// 이미 저장된 "Hello"가 있다면 그 주소를 전달합니다.
		// System.out.println("0." + s.toString());
		System.out.println("0." + s);
		// 단점 : 같은 문자열 Hello를 다른 변수에 저장하려 한다면, 새로운 공간이 할당
		// 되지 않습니다.
		
		// 1. 
		// new에 의해 새로운 HEAP 공간에 "Hello"를 저장, 그 주소를 s에 전달
		s = new String("Hello");
		System.out.println("1." + s);
		// System.out.println("1." + s.toString());
		// String 클래스는 Object 클래스를 상속받고,
		// 이미 toString과 equals가 자신에게 적합하게 오버라이딩 되어 있습니다.
		
		// 2.
		// 한 글자만을 하나의 데이터로 갖는 char형 배열
		char[] c = {'H', 'e', 'l', 'l', 'o'};
		String s2 = new String(c); // 배열 주소를 초기 값으로 문자열 구성.
		System.out.println("2." + s2);
		
		// 3.
		String n = "0123456789";
		char c1 = n.charAt(0);
		char c2 = n.charAt(5); // 괄호 안에 정수 값 번째의 글자를 얻음.(0부터 시작)
		System.out.println("3." + c1 + " " + c2);
		
		// 4.
		String a1 = new String("ABCD");
		String a2 = new String("BCD");
		String a3 = new String("ABCD");
		System.out.println("4. a1.compareTo(a2) ? " + a1.compareTo(a2));
		System.out.println("4. a2.compareTo(a3) ? " + a2.compareTo(a3));
		System.out.println("4. a1.compareTo(a3) ? " + a1.compareTo(a3));
		// String간의 비교
		// 숫자 987보다 숫자 1234가 크다고 표현하지만 문자열 "987"이
		// 문자열 "1234"보다 크다고 표현한다
		// 문자들간의 비교는 첫 글자부터 차례차례 비교하여, 서로 첫 글자가 다르면
		// a1.charAt() 글자의 아스키코드 값으로 크기를 결정짓고, 첫 글자가 같으면
		// 두 번째 글자들끼리 비교하여 결정한다. 두 번째도 같으면 세 번째 글자로...
		// 크기를 결정하는 방법은 비교되는 두 글자들의 뺄셈을 연산하여, 결과가 음수이면
		// 두 번째 글자가 크다고하고 양수이면 앞 쪽 글자가 크다고 한다.
		// ex) 'A' - 'B' => -1 뒤에서 빼려는 글자가 크다
	}
}
