package days10;

public class Method02 
{
	// 매개변수 : 메서드 호출 시 메서드가 필요로하는 데이터를 전달해줄 수 있는 매개역할의 변수
	// 메서드 호출시 괄호안에 넣어주는 데이터 : 전달인수
	// 메서드 몸체에서 괄호안에 위치하면 전달된 값을 받아주는 변수 : 매개변수
	// 매개 변수의 선언
	// public static void 메서드이름(자료형 매개변수, 자료형 매개변수....){
	// } 매개변수 또한 필요한 갯수만큼 선언해서 사용할 수 있습니다.
	public static void myPrint(int n)
	{
		System.out.println("전달받은 매개변수의 값 n -> " + n);
	}
	public static void main(String[] args)
	{
		myPrint(100); // 100 : 전달인수 -> 괄호안에 전달된 인수는 메서드
		// 실행될 떄 괄호안에 선언된 n변수에 저장합니다.
	}
}
