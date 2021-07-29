package days11;

import java.util.Scanner;

public class Method09 
{
	public static void main(String[] args)
	{
		// 밑변과 높이를 입력받아서 삼각형의 넓이를 계산하여 출력(메소드 사용)
		int a, b;
		double c;
		a = myInput(1); // 밑변을 입력 받음
		b = myInput(2); // 높이을 입력 받음
		c = calculate(a, b); // 넓이를 계산

		prn(c); // 넓이 출력
	}
	
	// 데이터 입력 함수
	public static int myInput(int num)
	{
		int value;
		Scanner sc = new Scanner(System.in);
		if(num == 1)
			System.out.print("밑변을 입력하세요 : ");
		else if(num == 2)
			System.out.print("높이를 입력하세요 : ");
			
		value = sc.nextInt();
		return value;
	}
	
	// 넓이 계산 함수
	public static double calculate(int base, int height)
	{
		return (base * height) / 2.0;
	}
	
	// 출력함수
	public static void prn(double c)
	{
		System.out.printf("삼각형의 넓이는 %.2f입니다.", c);
	}
}
// 1. 함수의 용도 전달인수 및 리턴 값 유무 파악
// myInput은 함수내에서 밑변 또는 높이 입력이라는 안내와 함께 정수를 입력받아
// 입력 받은 정수를 리턴
// 2. 메소드의 호출 형태(호출 구문)을 복사 a = myInput(1);
// 3. 왼쪽에 'a = '가 있다는 뜻은 리턴 값이 있다는 뜻이므로 자료형을 보고 앞 쪽 내용을 
// 바꿔 줍니다.
// a = -> public static int public static int myInput(1);
// 만약 a= 이라는 구문이 없다면 리턴 값이 없는 것이므로 public staitc void를
// 사용합니다.
// 4. myInput(1)의 괄호 안에 1이 있다는 건 전달인수가 있다는 뜻으로 1을
// 받아줄 수 있는 변수를 선언
// 1 -> int k public static int myInput(int k) - 맨끝의 ; 도삭제
// 변수의 자료형은 괄호안에 전달되는 자료형과 일치시킵니다.
