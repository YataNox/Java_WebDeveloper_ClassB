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
	}
}
