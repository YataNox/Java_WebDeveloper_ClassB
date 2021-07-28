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
		myPrint(200);
		myPrintWith2Int(300, 400);
	}
	// 아래 메서드는 다수의 매개변수를 전달 받는 매서드의 형태 - 각 매개변수 별로
	// 전달 받을 변수를 선언합니다.
	// 동일한 타입이라도 자료형의 생략은 혀용되지 않습니다. (int n1, n2) X
	public static void myPrintWith2Int(int n1, int n2)
	{
		System.out.println("전달받은 매개변수의 값 n1 -> " + n1 + ", n2 -> " + n2);
	}
	// 전달인수는 반드시 매개변수의 자료형과 일치하는 자료를 전달해줘야 합니다.
	// 다수개의 값을 전달할때는 자료형과 순서도 일치하게 전달해줘야 합니다.
	// 매개변수 acb(int x, double y) 전달인수 abc(300.0, 500);
}
