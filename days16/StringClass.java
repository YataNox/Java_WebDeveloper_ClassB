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
		String a2 = new String("CCD");
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
		
		// 5.
		s2 = s.concat(" World");
		// concat 메서드는 원본 s에 있는 문자열에 World를 이어붙이기 하고 s에
		// 업데이트해서 저장하는 것이 아니라
		// 이어붙이기된 새로운 문자열 객체를 만들어서 새로운 레퍼런스 변수에 저장할 수
		// 있게 리턴해줍니다.
		// String 클래스의 특성상 s에 있는 Hello 원본은 보호되고 있습니다.
		System.out.println("5." + s2);
		System.out.println("5." + s);
		
		// 6.
		s = new String("abcdefg");
		boolean b = s.contains("bc");
		// 괄호 안의 문자열이 메소드 호출 객체가 갖고 있는 문자열의 일부를 포함하고
		// 있다면 true를 리턴해주는 메소드.
		// boolean b = new String("abcdefg").contains("bc");
		System.out.println("6. 문자열 " + s + "에는 \"bc\" 가 포함되어 있다? " + b);
		
		// 7.
		s = new String("Hello.txt");
		b = s.endsWith("txt");
		// 메서드 호출 객체가 갖고 있는 문자열이 괄호 안의 문자열로 끝나면 true를
		// 리턴해주는 메소드
		System.out.println("7. 문자열 " + s + "는 \"txt\"로 끝난다 ? " + b);
		
		// 8.
		s = new String("Hello");
		// 대소문자 구분해서 비교
		System.out.println("8. " + s + "는 \"Hello\"와 같다 ? " + s.equals("Hello"));
		System.out.println("8. " + s + "는 \"Hello\"와 같다 ? " + s.equals("hello"));
		// 대소문자를 구분하지 않고 비교
		System.out.println("8. " + s + "는 \"HELLO\"와 같다 ? " + s.equalsIgnoreCase("Hello"));
		System.out.println("8. " + s + "는 \"Hello\"와 같다 ? " + s.equalsIgnoreCase("Hello"));
		
		// 9.
		System.out.println("\n9. " + s + "의 문자 중 \'o\'의 위치 " + s.indexOf('o'));
		System.out.println("9. " + s + "의 문자 중 \'k\'의 위치 " + s.indexOf('k'));
		// 메소드 호출 객체의 문자열 중에 괄호 안에 있는 문자가 몇 번째로 위치하는 지를
		// 구해줍니다. 있으면 위치값(0부터 시작하는 정수), 없으면 -1
		System.out.println("9. " + s + " s.indexOf(\'e\', 0) -> " +  s.indexOf('e', 0));
		System.out.println("9. " + s + " s.indexOf(\'o\', 2) -> " + s.indexOf('o', 2));
		System.out.println("9. " + s + " s.indexOf(\'e\', 0) -> " + s.indexOf('e', 2));
		// 찾고 자 하는 문자가 지정한 정수(0부터 시작)번째부터 시작해서 몇 번째 글자로
		// 위치하는 지를 구해줍니다.
		// 첫 번째 사용 예 : 알파벳 'e'가 문자열 s의 0번째부터 찾아서 전체 글자의 몇 번째
		// 글자인지 구함 : 1 리턴
		// 두 번째 사용 예 : 알파벳 'o'가 문자열 s의 2번째부터 찾아서 전체 글자의 몇 번째
				// 글자인지 구함 : 없으므로 -1 리턴
		// 두 번째 사용 예 : 알파벳 'e'가 문자열 s의 2번째부터 찾아서 전체 글자의 몇 번째
		// 글자인지 구함 : 없으므로 4 리턴
		
		// 10.
		s = new String("ABCDEFG");
		System.out.println("\n10. " + s + "s.indexOf(\"CD\") -> " + s.indexOf("CD"));
		// 문자열의 일부가 위치한 위치 값
		s = "java.lang.Object";
		System.out.println("\n10. " + s + "문자열중 '.'의 마지막 위치 -> " + s.lastIndexOf('.'));
		// 문자열의 일부 또는 문자가 마지막으로 확인된 위치
		
		// 11.
		s = "Hello";
		System.out.println("\n11. " + s + "s.replace(\'H\', \'C\') -> " + s.replace('H', 'C'));
		s2 = s.replace('H', 'C'); // H를 C로 치환
		System.out.println("11. " + s + " " + s2);
		System.out.println("11. " + s + "s.replace(\"ll\", \"LL\") -> " + s.replace("ll", "LL"));
		s2 = s.replace("ll", "LL");
		System.out.println("11. " + s + " " + s2);
		// String 클래스는 보관하고 있는 문자열을 이용하여 변화를 주는 메소드들에서
		// 변화된 내용이 업데이트 되듯 저장되는 것이 아니고 대부분 새로운 변화된 문자열
		// 객체로 만들어 리턴합니다.
		// 따라서 다양한 메서드들이 있지만 실행 결과가 원본 s 문자열을 변경시키지는 
		// 못합니다.
		
		// 12.
		String animal = "dog,cat,bear";
		String[] a = animal.split(",");
		// ','을 기준으로 문자열을 분리 - 문자열 배열로 만듦
		System.out.print("\n12. ");
		for(int i = 0; i < a.length; i++)
			System.out.printf("%s ", a[i]);
		System.out.println();
		
		// 13.
		s = "java.lang.Object";
		s2 = s.substring(5,9);
		// 원본에서 다섯번째 글자(0부터 시작)부터 8번째(9-1)까지 추출
		System.out.println("\n13. " + s2);
		s2 = s.substring(10); // 원본에서 열 번째 글자부터(0부터 시작) 끝까지 추출
		System.out.println("13. " + s2);
		
		// 14.
		
		
		// 15.
		
		
		// 16.
		
	}
}
